#! /bin/bash

#
# Copyright (c) 2024 Advanced Micro Devices, Inc.  All rights reserved.
#
# SPDX-License-Identifier: MIT
#
if [ -f /etc/profile.d/socks_proxy.sh ]; then
    . /etc/profile.d/socks_proxy.sh
fi

EEPROM=$(ls /sys/bus/i2c/devices/*/eeprom_cc*/nvmem 2> /dev/null)
BOARD=$(/usr/sbin/ipmi-fru --fru-file="$EEPROM" --interpret-oem-data | /usr/bin/awk -F": " '/FRU Board Product/ { print tolower ($2) }')
REVISION=$(/usr/sbin/ipmi-fru --fru-file="$EEPROM" --interpret-oem-data | /usr/bin/awk -F": " '/FRU Board Custom/ { print tolower ($2); exit }')
echo Install board packages for "$BOARD"-"$REVISION"
if dnf install -y "packagegroup-systemcontroller-${BOARD}-${REVISION}"; then
    echo "Install complete. Automatically rebooting in 5s."
    sleep 5 && reboot
elif dnf install -y "packagegroup-systemcontroller-${BOARD}"; then
    echo "Install complete. Automatically rebooting in 5s."
    sleep 5 && reboot
else
    echo "Board install failed for ${BOARD}"
fi
