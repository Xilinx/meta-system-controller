DESCRIPTION = "SC Board support packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

SC_BOARDS_PACKAGES = " \
    packagegroup-systemcontroller-vek385 \
        "

RDEPENDS:${PN} = "${SC_BOARDS_PACKAGES}"

