#!/bin/sh

dev_eeprom=$(find /sys/bus/i2c/devices/*54/ -name eeprom | head -1)
manufacturer=$(fru-print.py -b som -s $dev_eeprom -f manufacturer)
board=$(fru-print.py -b som -s $dev_eeprom -f product | tr '[:upper:]' '[:lower:]')
revision=$(fru-print.py -b som -s $dev_eeprom -f revision | tr '[:upper:]' '[:lower:]')

echo "BOARD:$board REVISION:$revision"

base_path="/lib/firmware/xilinx/${board}-${revision}*/"
dtbo_file="${board}-${revision}*.dtbo"
bit_file="${board}-${revision}*.bit.bin"

if [ -d "/run/media/mmcblk0p2/" ]; then
        partition_path="/run/media/mmcblk0p2/"
elif [ -d "/mnt/sd-mmcblk0p2/" ]; then
        partition_path="/mnt/sd-mmcblk0p2/"
fi


if [ -d ${base_path} ]  && [ -f ${base_path}/$dtbo_file ] && [ -f ${base_path}/$bit_file ]; then
        echo "RPM Already installed at ${base_path}"
else
        if [ -f ${partition_path}/${board}-${revision}*.rpm ]; then
                echo "Installing RPM for ${board}-${revision}"
                /usr/bin/rpm -U --ignorearch ${partition_path}/${board}-${revision}*.rpm
        else
                echo "Board: ${board}-${revision} Specific RPM not found in ${partition_path}"
        fi
fi

if [ -f ${base_path}/$dtbo_file ] && [ -f ${base_path}/$bit_file ]; then
        echo "Applying $bit_file and $dtbo_file"
        fpgautil -b ${base_path}/$bit_file -o ${base_path}/$dtbo_file
else
        echo "RPM did not install properly, please check ${base_path}"
fi
