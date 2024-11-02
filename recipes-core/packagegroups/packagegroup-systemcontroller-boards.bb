DESCRIPTION = "SC Board support packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

SC_BOARDS_PACKAGES = " \
    packagegroup-systemcontroller-vmk180 \
    packagegroup-systemcontroller-vck190 \
    packagegroup-systemcontroller-vek280 \
    packagegroup-systemcontroller-vhk158 \
    packagegroup-systemcontroller-vpk120 \
    packagegroup-systemcontroller-vpk180 \
        "

RDEPENDS:${PN} = "${SC_BOARDS_PACKAGES}"

