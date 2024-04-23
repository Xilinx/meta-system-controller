SUMMARY = "Firmware for the vpk120-b01/3h versal system controller"

PROVIDES += "vpk120-3h"

include sc-apps-firmware.inc

FW_DIR = "vpk120"

COMPATIBLE_MACHINE:system-controller = "${MACHINE}"

do_install:append() {
	install -d ${D}${nonarch_base_libdir}/firmware/xilinx/vpk120-3h
        # create symbolic links to supported revisions of the same board
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.bit.bin ${D}${nonarch_base_libdir}/firmware/xilinx/vpk120-3h/vpk120-3h.bit.bin
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.dtbo ${D}${nonarch_base_libdir}/firmware/xilinx/vpk120-3h/vpk120-3h.dtbo
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/shell.json ${D}${nonarch_base_libdir}/firmware/xilinx/vpk120-3h/shell.json
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/xilinx/*"
RPROVIDES:${PN} += "vpk120-3h"
RREPLACES:${PN} += "vpk120-3h"
