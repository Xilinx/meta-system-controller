#!/bin/bash

MOTD_FILE="/etc/motd"
LOG_FILE="/var/log/firmware_update.log"
MOTD_MARKER="BOOT.bin firmware update notification"

get_hostname() {
    hostname | sed 's/\..*//g' | sed 's/-/_/g'
}

check_for_new_version() {
    local PACKAGE="xilinx-bootbin.$(get_hostname)"
    if dnf check-update $PACKAGE > /dev/null 2>&1; then
        add_motd_update_message $PACKAGE
    else
        remove_motd_update_message
    fi
}

add_motd_update_message() {
    local PACKAGE=$1
    local MESSAGE="\n************************************************************************\n\
* New firmware update available for BOOT.bin, To update follow steps:  *\n\
* 1. sudo dnf install $PACKAGE                                         *\n\
* 2. Program the QSPI partition:                                       *\n\
*    image_update -p                                                   *\n\
*    image_update -i /boot/BOOT.bin                                    *\n\
************************************************************************"
    grep -qF "$MOTD_MARKER" "$MOTD_FILE" || {
        sudo bash -c "echo -e '\n$MOTD_MARKER' >> $MOTD_FILE"
        sudo bash -c "echo -e '$MESSAGE' >> $MOTD_FILE"
    }
}

remove_motd_update_message() {
    grep -qF "$MOTD_MARKER" "$MOTD_FILE" && \
        sudo sed -i "/$MOTD_MARKER/,/************************************************************************/d" "$MOTD_FILE"
}

[[ ! -w $LOG_FILE ]] && sudo touch $LOG_FILE && sudo chmod 644 $LOG_FILE
check_for_new_version

