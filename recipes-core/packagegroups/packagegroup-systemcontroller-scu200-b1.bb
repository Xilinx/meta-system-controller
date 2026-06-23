DESCRIPTION = "Package group for SCU200-B1 containing SC app and firmware required for system functionality"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

SCU200_B1_PACKAGES = " \
        systemcontroller-firmware-scu200-b1 \
        "

RDEPENDS:${PN} = "${SCU200_B1_PACKAGES}"
