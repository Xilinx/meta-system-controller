SUMMARY = "System Controller App - VRK160 board specific files"

LICENSE = "Proprietary & MIT"
LIC_FILES_CHKSUM:append = " file://${WORKDIR}/LICENSE_BINARIES.md;md5=fef5c700acd3d5fa08c24279a8126704"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/system-controller/sc_app_bsp/2025.2/2025.2_202605141514/external/systemcontroller-app-vrk160.tar.gz"
SRC_URI[sha256sum] = "7bd84e0960a0fa876ca896ce8e3e2749f94f728853d735fe0e9d7a05d4d61b0e"

BOARD = "vrk160"

require system-controller-app.inc

do_install:append() {
	install -d ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}
	install -d ${D}${datadir}/scweb/static/images/
	install -d ${D}${datadir}/scweb/static/js/
	install -d ${D}${datadir}/config

	install -m 0664 ${WORKDIR}/${BOARD}_es1_system_wrapper.pdi ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}/es1_system_wrapper.pdi
	install -m 0664 ${WORKDIR}/${BOARD}_versal_bit.elf ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}/versal_bit.elf

	install -m 0664 ${WORKDIR}/${BOARD_upper}_home.png ${D}${datadir}/scweb/static/images/
	install -m 0664 ${WORKDIR}/${BOARD}.jpg ${D}${datadir}/scweb/static/images/
	install -m 0664 ${WORKDIR}/${BOARD}_strings.js ${D}${datadir}/scweb/static/js/

	install -m 0664 ${WORKDIR}/ser2net_${BOARD}.yaml ${D}${datadir}/config/
}

FILES:${PN} += " \
    ${datadir}/scweb/ \
    ${datadir}/config \
    "
