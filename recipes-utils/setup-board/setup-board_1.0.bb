DESCRIPTION = "Setup board helper script package"
SUMMARY = "Installs board_setup_v2.sh for board package provisioning"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://setup_board_v2.sh"

S = "${WORKDIR}"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} += " \
    bash \
    dnf \
    freeipmi \
    "

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/setup_board_v2.sh ${D}${bindir}/setup_board_v2.sh
}
