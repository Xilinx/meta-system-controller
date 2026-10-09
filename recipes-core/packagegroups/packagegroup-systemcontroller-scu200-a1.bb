DESCRIPTION = "Package group for SCU200-A1 containing SC app and firmware required for system functionality"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

SCU200_PACKAGES = " \
        systemcontroller-firmware-scu200-a1 \
        systemcontroller-app-scu200 \
        "

RDEPENDS:${PN} = "${SCU200_PACKAGES}"
