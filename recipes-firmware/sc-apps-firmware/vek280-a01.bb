SUMMARY = "Firmware for the vek280-a01/b01/b02/b03 versal system controller"

PROVIDES += "vek280-b01 vek280-b02 vek280-b03"

include sc-apps-firmware.inc

FW_DIR = "vek280"

COMPATIBLE_MACHINE:system-controller = "${MACHINE}"


do_install:append() {
	install -d ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b01
	install -d ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b02
	install -d ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b03
        # create symbolic links to supported revisions of the same board
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.bit.bin ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b01/vek280-b01.bit.bin
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.dtbo ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b01/vek280-b01.dtbo
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/shell.json ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b01/shell.json

	ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.bit.bin ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b02/vek280-b02.bit.bin
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.dtbo ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b02/vek280-b02.dtbo
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/shell.json ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b02/shell.json

	ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.bit.bin ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b03/vek280-b03.bit.bin
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.dtbo ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b03/vek280-b03.dtbo
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/shell.json ${D}${nonarch_base_libdir}/firmware/xilinx/vek280-b03/shell.json
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/xilinx/*"
RPROVIDES:${PN} += "vek280-b01 vek280-b02 vek280-b03"
RREPLACES:${PN} += "vek280-b01 vek280-b02 vek280-b03"
