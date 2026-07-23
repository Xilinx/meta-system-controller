SUMMARY = "Firmware for the vrk160-b1 system controller"

include systemcontroller-firmware.inc

FW_DIR = "vrk160-b1"
FW_FILENAME = "vrk160-b1"

INSTALL_DIR = "vrk160"

COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

do_install:append() {
    # create symbolic links to supported revisions of the same board
    for board in b1; do
        install -d ${D}${nonarch_base_libdir}/firmware/xilinx/${INSTALL_DIR}-${board}
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.bin ${D}${nonarch_base_libdir}/firmware/xilinx/${INSTALL_DIR}-${board}/${INSTALL_DIR}-${board}.bin
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/${PN}.dtbo ${D}${nonarch_base_libdir}/firmware/xilinx/${INSTALL_DIR}-${board}/${INSTALL_DIR}-${board}.dtbo
        ln -sr ${D}${nonarch_base_libdir}/firmware/xilinx/${PN}/shell.json ${D}${nonarch_base_libdir}/firmware/xilinx/${INSTALL_DIR}-${board}/shell.json
    done
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/xilinx/*"
