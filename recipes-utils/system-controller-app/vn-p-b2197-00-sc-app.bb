SUMMARY = "System Controller App - VN-P-B2197-00 board specific files"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SCAP="sc-app"

SRC_URI = "\
	git://gitenterprise.xilinx.com/Platform-Management/system-controller.git;branch=xlnx_rel_v2023.2;protocol=https;name=scapp;destsuffix=${SCAP} \
"

SRCREV_scapp="102e370142b3e6612ee46d8bec0e07ba6ca07a63"

BOARD = "VN-P-B2197-00"
BOARD_lower = "vn-p-b2197-00"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:system-controller = "${MACHINE}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES:${PN} += " \
	${datadir}/system-controller-app/ \
	"

do_install(){
	mkdir -p ${D}${datadir}/system-controller-app/board
	mkdir -p ${D}${datadir}/system-controller-app/BIT
	mkdir -p ${D}${datadir}/system-controller-app/BIT/${BOARD}

	cp ${WORKDIR}/${SCAP}/board/${BOARD}.json ${D}${datadir}/system-controller-app/board/
	cp -r ${WORKDIR}/${SCAP}/BIT/${BOARD} ${D}${datadir}/system-controller-app/BIT/
}
