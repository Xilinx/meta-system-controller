FILESEXTRAPATHS:prepend:eval-brd-sc-zynqmp := "${THISDIR}/u-boot-xlnx-scr:"

BOOTMODE:eval-brd-sc-zynqmp = "rauc"
SRC_URI:append:eval-brd-sc-zynqmp = " file://boot.cmd.raucsc"
