#!/bin/bash
#
# Copyright (c) 2024 Advanced Micro Devices, Inc.  All rights reserved.
#
# SPDX-License-Identifier: MIT
#

#########################################################################
# Local repository path for offline installs.
# Defaults to empty (online/Yocto flow) unless --local-package-feed is provided.
#########################################################################
LOCAL_PACKAGE_FEED_PATH=""
#########################################################################

usage() {
    echo "Usage: $0 [-h|--help] [--local-package-feed <path>]"
}

# Command-line options:
# - no option passed: use online/Yocto flow (LOCAL_PACKAGE_FEED_PATH stays empty)
# - --local-package-feed <path>: use provided local package feed path
while [[ $# -gt 0 ]]; do
    case "$1" in
        --local-package-feed)
            if [[ -z "$2" || "$2" == -* ]]; then
                echo "Error: $1 requires a path argument."
                usage
                exit 1
            fi
            LOCAL_PACKAGE_FEED_PATH="$2"
            if [[ "$LOCAL_PACKAGE_FEED_PATH" != /* || ! -d "$LOCAL_PACKAGE_FEED_PATH" ]]; then
                echo "Error: --local-package-feed must be an existing absolute directory path."
                usage
                exit 1
            fi
            shift 2
            ;;
        -h|--help)
            usage
            exit 0
            ;;
        *)
            echo "Error: Unknown option: $1"
            usage
            exit 1
            ;;
    esac
done

# Source proxy settings if present
if [ -f /etc/profile.d/socks_proxy.sh ]; then
    . /etc/profile.d/socks_proxy.sh
fi

# Locate EEPROM nvmem node
EEPROM="$(ls /sys/bus/i2c/devices/*/eeprom_cc*/nvmem 2>/dev/null)"
if [[ -z "$EEPROM" ]]; then
    echo "No EEPROM nvmem found under /sys/bus/i2c/devices/*/eeprom_cc*/nvmem"
    exit 1
fi

# Run ipmi-fru once; parse required fields from the output
FRU_OUT="$(/usr/sbin/ipmi-fru --fru-file="$EEPROM" --interpret-oem-data 2>/dev/null)"
BOARD="$(awk -F": " '/FRU Board Product/ { print tolower($2) }' <<<"$FRU_OUT")"
REVISION="$(awk -F": " '/FRU Board Custom/ { print tolower($2); exit }' <<<"$FRU_OUT")"

if [[ -z "$BOARD" || -z "$REVISION" ]]; then
    echo "Failed to detect BOARD/REVISION from FRU data."
    exit 1
fi

REV_LETTER="${REVISION:0:1}"
REV_NUMBER="${REVISION:1}"

# Determine number padding format
if [[ "$REV_NUMBER" =~ ^0[0-9]+$ ]]; then
    PAD_FMT="%02d"
else
    PAD_FMT="%d"
fi

# Repo argument selector:
# - LOCAL_PACKAGE_FEED_PATH empty (default): use normal DNF args
# - LOCAL_PACKAGE_FEED_PATH set via --local-package-feed: use local offline repo args
if [[ -z "$LOCAL_PACKAGE_FEED_PATH" ]]; then
    DNF_ARGS=(-y)
else
    DNF_ARGS=(-y --nogpgcheck --repofrompath="local,file://${LOCAL_PACKAGE_FEED_PATH}" --repo=local)
fi

# Check if a package exists in the repo
pkg_exists() {
    dnf "${DNF_ARGS[@]}" -q repoquery --qf '%{name}' "$1" 2>/dev/null | grep -Fxq "$1"
}

# Build candidate list for board package (descending revision -> base)
package_list=()
REV_NUM_INT=$((10#$REV_NUMBER))
for ((i=REV_NUM_INT; i>0; i--)); do
    package_list+=("packagegroup-systemcontroller-${BOARD}-${REV_LETTER}$(printf "$PAD_FMT" "$i")")
    echo "Added package candidate: packagegroup-systemcontroller-${BOARD}-${REV_LETTER}$(printf "$PAD_FMT" "$i")"
done
package_list+=("packagegroup-systemcontroller-${BOARD}")

# Pick first available board package candidate
PKG=""
for TRY_PKG in "${package_list[@]}"; do
    if pkg_exists "$TRY_PKG"; then
        PKG="$TRY_PKG"
        break
    fi
done

if [[ -z "$PKG" ]]; then
    echo "No matching package found for ${BOARD} revision ${REVISION}. Continuing without board-specific package install."
else
    echo "Selected board package: ${PKG}"
fi

# Refresh metadata to ensure latest repodata is used
dnf "${DNF_ARGS[@]}" -q makecache --refresh >/dev/null 2>&1 || true

# Upgrade all installed packages first
echo "Upgrading all packages..."
if ! dnf "${DNF_ARGS[@]}" upgrade; then
    echo "Full system upgrade failed. Aborting. No reboot will be performed."
    exit 1
fi

# Install board-specific package when available
if [[ -n "$PKG" ]]; then
    echo "Installing/updating board package..."
    if ! dnf "${DNF_ARGS[@]}" install "$PKG"; then
        echo "Board package install/update failed. Aborting. No reboot will be performed."
        exit 1
    fi
fi

echo "Install process complete. Automatically rebooting in 5s."
sleep 5 && reboot
