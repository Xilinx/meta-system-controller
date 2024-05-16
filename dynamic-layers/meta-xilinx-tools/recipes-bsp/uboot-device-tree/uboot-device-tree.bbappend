FILESEXTRAPATHS:prepend:eval-brd-sc-zynqmp := "${THISDIR}/files:"

SRC_URI:append:eval-brd-sc-zynqmp = " file://zynqmp-sc-revc.dtsi"

UBOOT_DTS_NAME = "system-sc-revc-zynqmp"

do_configure:append:eval-brd-sc-zynqmp() {
	echo '#include "zynqmp-sc-revc.dtsi"' >> ${DT_FILES_PATH}/system-top.dts
}

