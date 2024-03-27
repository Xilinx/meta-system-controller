DESCRIPTION = "SC Board support packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

SC_BOARDS_PACKAGES = " \
    vmk180 \
    vck190 \
    vek280 \
    vhk158 \
    vpk120 \
    vpk180 \
        "

RDEPENDS:${PN} = "${SC_BOARDS_PACKAGES}"

