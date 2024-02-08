SUMMARY = "System Controller App - VCK190 board specific files"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

require system-controller-app.inc

SCAP="sc-app"
SCIM="sc_image"

SRC_URI = "\
	${SC_APP_REPO};branch=${SC_APP_BRANCH};protocol=https;name=scapp;destsuffix=${SCAP} \
	${SC_IMG_REPO};branch=${SC_IMG_BRANCH};protocol=https;name=sc-images;destsuffix=${SCIM} \
"

SRCREV_scapp="${SC_APP_SRCREV}"
SRCREV_sc-images="${SC_IMG_SRCREV}"

BOARD = "VCK190"
BOARD_lower = "vck190"

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
