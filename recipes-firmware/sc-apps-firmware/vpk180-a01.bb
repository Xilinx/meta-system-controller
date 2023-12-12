SUMMARY = "Firmware for the vpk180-a01/b01 versal system controller"

PROVIDES += "vpk180-b01"

include sc-apps-firmware.inc

FW_DIR = "vpk180"

COMPATIBLE_MACHINE:system-controller = "${MACHINE}"

do_install:append() {
	install -d ${D}/lib/firmware/xilinx/vpk180-b01
        # create symbolic links to supported revisions of the same board
        ln -sr ${D}/lib/firmware/xilinx/${PN}/${PN}.bit.bin ${D}/lib/firmware/xilinx/vpk180-b01/vpk180-b01.bit.bin
        ln -sr ${D}/lib/firmware/xilinx/${PN}/${PN}.dtbo ${D}/lib/firmware/xilinx/vpk180-b01/vpk180-b01.dtbo
        ln -sr ${D}/lib/firmware/xilinx/${PN}/shell.json ${D}/lib/firmware/xilinx/vpk180-b01/shell.json
}

FILES:${PN} = "/lib/firmware/xilinx/*"
RPROVIDES:${PN} += "vpk180-b01"
RREPLACES:${PN} += "vpk180-b01"
