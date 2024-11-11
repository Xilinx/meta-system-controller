SUMMARY = "Firmware for the vm-p-m1369-00-a01 versal system controller"

#inherit externalsrc
#EXTERNALSRC = "/proj/xhdsswstaff/swagathg/repos/versal-sc-firmware"

include sc-apps-firmware.inc

FW_DIR = "vm-p-m1369-00-a01"

COMPATIBLE_MACHINE:system-controller = "${MACHINE}"
