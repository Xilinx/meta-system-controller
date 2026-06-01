DESCRIPTION = "System Controller Version Information Script"
SUMMARY = "Prints version and package information for the system controller"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://version_info.sh"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_install() {
    install -d ${D}${bindir}

    # Substitute release version placeholder at build time
    sed -e 's|@@RPM_RELEASE_VERSION@@|${RPM_RELEASE_VERSION}|g' \
        ${WORKDIR}/version_info.sh > ${D}${bindir}/version_info.sh
    chmod 0755 ${D}${bindir}/version_info.sh
}

RDEPENDS:${PN} = " \
    bash \
    freeipmi \
    dnf \
    "
