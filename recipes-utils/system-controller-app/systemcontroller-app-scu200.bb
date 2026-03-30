SUMMARY = "System Controller App - SCU200 board specific files"

LICENSE = "Proprietary & MIT"
LIC_FILES_CHKSUM:append = " file://${WORKDIR}/LICENSE_BINARIES.md;md5=fef5c700acd3d5fa08c24279a8126704"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202603061327/external/systemcontroller-app-scu200.tar.gz"
SRC_URI[sha256sum] = "e9017237a4f4b63ad1acef950e30877f9d01e348bae1a9ff8fdc0ac9bfbd9476"

BOARD = "scu200"

require system-controller-app.inc

# The default QA checks the installed elf binaries against ARM aarch64
# architecture.  On this board, the device-under-test runs the elf binaries
# that are compiled for MicroBlaze RISC-V architecture.  Therefore, skip
# the QA architecture check for this board.
INSANE_SKIP:${PN} = "arch"

do_install:append() {
	install -d ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}
	install -d ${D}${datadir}/scweb/static/images/
	install -d ${D}${datadir}/scweb/static/js/
	install -d ${D}${datadir}/config

	install -m 0664 ${WORKDIR}/es1_system_wrapper.pdi ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}/
	install -m 0664 ${WORKDIR}/versal_bit.elf ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}/

	install -m 0664 ${WORKDIR}/${BOARD_upper}_home.png ${D}${datadir}/scweb/static/images/
	install -m 0664 ${WORKDIR}/${BOARD}.jpg ${D}${datadir}/scweb/static/images/
	install -m 0664 ${WORKDIR}/${BOARD}_strings.js ${D}${datadir}/scweb/static/js/

	install -m 0664 ${WORKDIR}/ser2net_${BOARD}.yaml ${D}${datadir}/config/
}

FILES:${PN} += " \
	${datadir}/scweb/ \
	${datadir}/config \
	"
