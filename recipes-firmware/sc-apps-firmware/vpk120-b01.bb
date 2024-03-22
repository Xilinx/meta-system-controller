SUMMARY = "Firmware for the vpk120-b01/3h versal system controller"

PROVIDES += "vpk120-3h"

include sc-apps-firmware.inc

FW_DIR = "vpk120"

COMPATIBLE_MACHINE:system-controller = "${MACHINE}"

do_install:append() {
	install -d ${D}/lib/firmware/xilinx/vpk120-3h
        # create symbolic links to supported revisions of the same board
        ln -sr ${D}/lib/firmware/xilinx/${PN}/${PN}.bit.bin ${D}/lib/firmware/xilinx/vpk120-3h/vpk120-3h.bit.bin
        ln -sr ${D}/lib/firmware/xilinx/${PN}/${PN}.dtbo ${D}/lib/firmware/xilinx/vpk120-3h/vpk120-3h.dtbo
        ln -sr ${D}/lib/firmware/xilinx/${PN}/shell.json ${D}/lib/firmware/xilinx/vpk120-3h/shell.json
}

FILES:${PN} = "/lib/firmware/xilinx/*"
RPROVIDES:${PN} += "vpk120-3h"
RREPLACES:${PN} += "vpk120-3h"
