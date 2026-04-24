#!/bin/bash
#
# Copyright (c) 2024 Advanced Micro Devices, Inc.  All rights reserved.
#
# SPDX-License-Identifier: MIT
#

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

# Check if a package exists in the repo
pkg_exists() {
    dnf -q repoquery --qf '%{name}' "$1" 2>/dev/null | grep -Fxq "$1"
}

# Check if a package is already installed
pkg_installed() {
  rpm -q "$1" >/dev/null 2>&1
}

# Install/Upgrade helper:
# - If pkg is not installed => dnf install
# - If pkg is installed     => dnf upgrade (pull newer EVR if available)
install_pkg() {
  local pkg="$1"

  echo "Checking ${pkg} package availability"
  if ! pkg_exists "$pkg"; then
    echo "Error: ${pkg} is not available in repo."
    return 1
  fi

  # Refresh metadata to ensure latest repodata is used (especially after repo updates)
  # (safe even if already fresh)
  dnf -q makecache --refresh >/dev/null 2>&1 || true

  if pkg_installed "$pkg"; then
    echo "Package ${pkg} is already installed. Attempting upgrade..."
    if dnf upgrade -y "$pkg"; then
      echo "${pkg} upgrade complete."
      return 0
    else
      echo "Error: ${pkg} upgrade failed."
      return 1
    fi
  else
    echo "Package ${pkg} is not installed. Installing..."
    if dnf install -y "$pkg"; then
      echo "${pkg} install complete."
      return 0
    else
      echo "Error: ${pkg} install failed."
      return 1
    fi
  fi
}

# Build candidate list for board package (descending revision -> base)
package_list=()
REV_NUM_INT=$((10#$REV_NUMBER))
for ((i=REV_NUM_INT; i>0; i--)); do
    package_list+=("packagegroup-systemcontroller-${BOARD}-${REV_LETTER}$(printf "$PAD_FMT" "$i")")
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
    echo "No matching package found for ${BOARD} revision ${REVISION}. Continuing with common packages only."
fi

# Additional SC packages
additional_packages=(
    "packagegroup-scweb"
    "labtool-jtag-support"
    "raft"
)

# Build final install list
final_install_list=()
[[ -n "$PKG" ]] && final_install_list+=("$PKG")
final_install_list+=("${additional_packages[@]}")

echo "Final package installation list: ${final_install_list[*]}"

# Fail-fast: abort on any failure, reboot only when all succeed
for install_target in "${final_install_list[@]}"; do
    if ! install_pkg "$install_target"; then
        echo "Install failed for ${install_target}. Aborting. No reboot will be performed."
        exit 1
    fi
done

echo "Install process complete. Automatically rebooting in 5s."
sleep 5 && reboot
