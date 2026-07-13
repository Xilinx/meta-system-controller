DESCRIPTION = "System Controller Board ID Script"
SUMMARY = "Board revision and name provider from U-Boot env vars or EEPROM"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://sc-board-id"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/sc-board-id ${D}${bindir}/sc-board-id
}

RDEPENDS:${PN} = " \
    bash \
    freeipmi \
    u-boot-tools \
    "
