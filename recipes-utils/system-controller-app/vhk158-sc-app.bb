SUMMARY = "System Controller App - VHK158 board specific files"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SCAP="sc-app"
SCIM="sc_image"

SRC_URI = "\
	git://gitenterprise.xilinx.com/Platform-Management/system-controller.git;branch=xlnx_rel_v2023.2;protocol=https;name=scapp;destsuffix=${SCAP} \
	git://gitenterprise.xilinx.com/PAEG/SystemController.git;branch=xlnx_rel_v2023.2;name=sc-images;destsuffix=${SCIM} \
"

SRCREV_scapp="102e370142b3e6612ee46d8bec0e07ba6ca07a63"
SRCREV_sc-images="c27fa4290df99cecf5834669fc632e74ab54020a"

BOARD = "VHK158"
BOARD_lower = "vhk158"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:system-controller = "${MACHINE}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES:${PN} += " \
	${datadir}/system-controller-app/ \
	${datadir}/scweb/static/images/ \
	"

do_install(){
	mkdir -p ${D}${datadir}/system-controller-app/board
	mkdir -p ${D}${datadir}/system-controller-app/BIT
	mkdir -p ${D}${datadir}/system-controller-app/BIT/${BOARD}
	mkdir -p ${D}${datadir}/scweb/static/images/

	cp ${WORKDIR}/${SCAP}/board/${BOARD}.json ${D}${datadir}/system-controller-app/board/
	cp -r ${WORKDIR}/${SCAP}/BIT/${BOARD} ${D}${datadir}/system-controller-app/BIT/
	
	cp ${WORKDIR}/${SCIM}/src/static/images/${BOARD}_home.png ${D}${datadir}/scweb/static/images/
	cp ${WORKDIR}/${SCIM}/src/static/images/${BOARD_lower}.jpg ${D}${datadir}/scweb/static/images/
}
