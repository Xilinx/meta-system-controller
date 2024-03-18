DESCRIPTION = "Required packages for VMK180"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VMK180_PACKAGES = " \
        vmk180-sc-app \
        "

RDEPENDS:${PN} = "${VMK180_PACKAGES}"
