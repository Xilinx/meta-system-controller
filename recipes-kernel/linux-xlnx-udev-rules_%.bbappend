# Add udev rules for xsysmoni2c to activate fancontrol
FILESEXTRAPATHS:prepend := "${THISDIR}/linux-xlnx-udev-rules:"

SRC_URI:append:eval-brd-sc-zynqmp = " file://fancontrol.rules"
