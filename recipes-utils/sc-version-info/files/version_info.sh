#! /bin/bash

#
# Copyright (c) 2024 - 2026 Advanced Micro Devices, Inc.  All rights reserved.
#
# SPDX-License-Identifier: MIT
#

print_msg() {
    echo ""
    echo "$1"
    LEN=$(echo "$1" | wc -L)
    for ((i = 0; i < "${LEN}"; i++)); do
        echo -n "="
    done
    echo ""
}

if [ -f /etc/profile.d/socks_proxy.sh ]; then
    . /etc/profile.d/socks_proxy.sh
fi

# Read RPM release version
RPM_RELEASE_VERSION="@@RPM_RELEASE_VERSION@@"

# Get board and revision info from EEPROM
EEPROM=$(ls /sys/bus/i2c/devices/*/eeprom_cc*/nvmem 2> /dev/null)
if [[ -z "$EEPROM" ]]; then
    echo "Error: No EEPROM nvmem found."
    exit 1
fi

FRU_OUT="$(/usr/sbin/ipmi-fru --fru-file="$EEPROM" --interpret-oem-data 2>/dev/null)"
BOARD="$(awk -F": " '/FRU Board Product/ { print tolower($2) }' <<<"$FRU_OUT")"
REVISION="$(awk -F": " '/FRU Board Custom/ { print tolower($2); exit }' <<<"$FRU_OUT")"
LEGACY_BOARD=$(if [ "${BOARD}" = "vck190" ] || [ "${BOARD}" = "vmk180" ]; then echo "1"; else echo "0"; fi)

if [[ -z "$BOARD" ]]; then
    echo "Error: Failed to detect BOARD from EEPROM FRU data."
    exit 1
fi

# Information about QSPI image
if [ "${LEGACY_BOARD}" -eq 0 ]; then
    MSG="QSPI Image Information"
    print_msg "${MSG}"
    QSPI_INFO=$(image-mgmt version 2>&1)

    if echo "$QSPI_INFO" | grep -q "Unable to retrieve"; then
	    echo "Unable to fetch boot.bin information from spi flash (layout mismatch)"
    else
	    echo "$QSPI_INFO"
    fi
fi

# Information about the image on boot device
if [ "${LEGACY_BOARD}" -eq 0 ]; then
    BOOT_DEVICE="eMMC"
else
    BOOT_DEVICE="SD"
fi

MSG="${BOOT_DEVICE} Image Information"
print_msg "${MSG}"
cat /etc/os-release
echo "SC_APP=\"$(/usr/bin/sc_app -c version | grep 'Commit' | sed 's/^Commit:\t\+//')\""

# Print RPM Release Version
MSG="RPM Release Version"
print_msg "${MSG}"
echo "RPM_RELEASE_VERSION=${RPM_RELEASE_VERSION}"

# Board-specific RPM information
# Use wildcard to find installed firmware/app packages for this board
# (e.g. vrk160-a2 board may have systemcontroller-firmware-vrk160-a1 installed via symlink)
FW_PATTERN="systemcontroller-firmware-${BOARD}-*"
APP_PATTERN="systemcontroller-app-${BOARD}"

# Query installed packages matching the board pattern (exclude -dbg, -dev, -lic sub-packages)
FW_INSTALLED=$(rpm -qa "${FW_PATTERN}" 2>/dev/null | grep -v -e '-dbg$' -e '-dev$' -e '-lic$')
APP_INSTALLED=$(rpm -qa "${APP_PATTERN}" 2>/dev/null | grep -v -e '-dbg$' -e '-dev$' -e '-lic$')

if [[ -n "$FW_INSTALLED" ]]; then
    for PKG in ${FW_INSTALLED}; do
        PKG_NAME=$(rpm -q --qf '%{NAME}' "$PKG" 2>/dev/null)
        PKG_REL=$(rpm -q --qf '%{RELEASE}' "$PKG" 2>/dev/null)
        MSG="Package Information for '${PKG_NAME}'"
        print_msg "${MSG}"
        echo -n "Installed "
        echo "Release : ${PKG_REL}"
    done
else
    # Query DNF repo for available firmware package matching this board's revision first
    AVAIL_FW=$(dnf list available "systemcontroller-firmware-${BOARD}-${REVISION}" 2>/dev/null | grep "systemcontroller-firmware-${BOARD}-${REVISION}" | awk '{print $1}' | sed 's/\.[^.]*$//' | head -n 1)
    # Fallback: find the highest available revision <= EEPROM revision (symlink target)
    if [[ -z "$AVAIL_FW" ]]; then
        BOARD_PREFIX="systemcontroller-firmware-${BOARD}-"
        ALL_AVAIL=$(dnf list available "${FW_PATTERN}" 2>/dev/null | grep "systemcontroller-firmware-${BOARD}" | awk '{print $1}' | sed 's/\.[^.]*$//' | grep -v -e '-dbg$' -e '-dev$' -e '-lic$')
        # Iterate from highest to lowest revision, pick first one <= EEPROM revision
        for PKG_NAME in $(echo "$ALL_AVAIL" | sort -rV); do
            PKG_REV="${PKG_NAME#${BOARD_PREFIX}}"
            # Use version sort to check if PKG_REV <= REVISION
            LOWER=$(printf '%s\n%s' "$PKG_REV" "$REVISION" | sort -V | head -n 1)
            if [[ "$LOWER" == "$PKG_REV" ]]; then
                AVAIL_FW="$PKG_NAME"
                break
            fi
        done
    fi
    if [[ -n "$AVAIL_FW" ]]; then
        MSG="Package Information for '${AVAIL_FW}'"
    else
        MSG="Package Information for 'systemcontroller-firmware-${BOARD}'"
    fi
    print_msg "${MSG}"
    echo -n "Not installed"
    echo ""
fi

if [[ -n "$APP_INSTALLED" ]]; then
    for PKG in ${APP_INSTALLED}; do
        PKG_NAME=$(rpm -q --qf '%{NAME}' "$PKG" 2>/dev/null)
        PKG_REL=$(rpm -q --qf '%{RELEASE}' "$PKG" 2>/dev/null)
        MSG="Package Information for '${PKG_NAME}'"
        print_msg "${MSG}"
        echo -n "Installed "
        echo "Release : ${PKG_REL}"
    done
else
    MSG="Package Information for '${APP_PATTERN}'"
    print_msg "${MSG}"
    echo -n "Not installed"
    echo ""
fi

# Information about common packages
RPMS="system-controller-app scweb labtool-jtag-support pmtool raft embpf-bootfw-update-tool"
RPM_INFO=$(dnf info -C ${RPMS} 2>/dev/null)

for I in ${RPMS}; do
    MSG="Package Information for '$I'"
    VERS=$(echo "${RPM_INFO}" | grep -A 2 -e "Name.*: $I" | grep 'Release')
    print_msg "${MSG}"
    if [[ -z "${VERS}" ]]; then
        echo -n "Not installed"
    else
        echo -n "Installed "
    fi

    echo "${VERS}" | head -n 1

    if [ "$(echo "${VERS}" | wc -l)" -ge 2 ]; then
        echo -n "Latest    "
        echo "${VERS}" | tail -n 1
    fi
done
