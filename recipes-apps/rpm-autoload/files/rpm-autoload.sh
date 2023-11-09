#!/bin/sh

dev_eeprom=$(find /sys/bus/i2c/devices/*54/ -name eeprom | head -1)
board=$(ipmi-fru --fru-file=${dev_eeprom} --interpret-oem-data | awk -F": " '/^  *FRU Board Product*/ { print tolower ($2) }')
revision=$(ipmi-fru --fru-file=${dev_eeprom} --interpret-oem-data | awk -F": " '/^  *FRU Board Custom*/ { print tolower ($2); exit }')
revision_ps=$(echo $revision | cut -b 1 | tr '[:lower:]' '[:upper:]')

echo "BOARD:$board REVISION:$revision"

base_path="/lib/firmware/xilinx/${board}-${revision}*/"
dtbo_file="${board}-${revision}*.dtbo"
psdtbo_file="zynqmp-sc-$board-rev$revision_ps.dtbo"
bit_file="${board}-${revision}*.bit.bin"

revision_num=$(echo ${revision} | cut -c3)
revision_ver=$(echo ${revision} | cut -c1)
while [ ${revision_num}  >  0 ];do
	if [ -d  /lib/firmware/xilinx/${board}-${revision_ver}0${revision_num} ]; then
		echo "Installing RPM for ${board}-${revision_ver}0${revision_num}"
		pkg_path="/lib/firmware/xilinx/${board}-${revision_ver}0${revision_num}"
		break
	fi
	revision_num=$(echo "$(( $revision_num - 1 ))")
done

overlay_path="/configfs/device-tree/overlays"
dfxmgr_overlay="${overlay_path}/${board}-${revision}_image_1"

if [ ! -d  ${dfxmgr_overlay} ]; then
	if [ -f ${pkg_path}/*.dtbo ] && [ -f ${pkg_path}/*.bit.bin ] && [ ! -d ${dfxmgr_overlay} ]; then
		echo "Applying ${pkg_path}/*.dtbo and ${pkg_path}/*.bit.bin using fpgautil"
		fpgautil -b ${pkg_path}/*.bit.bin -o ${pkg_path}/*.dtbo -f Full -n Full
	else
		 echo "Board specific Bitstream and dtbo did not install properly, please check at ${base_path}"
	 fi
else
	echo "Board specific Bitstream and dtbo already installed at ${dfxmgr_overlay}"
fi
