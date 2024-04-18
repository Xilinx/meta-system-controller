DESCRIPTION = "Required packages for VPK180"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VPK180_PACKAGES = " \
        vpk180-a01 \
		vpk180-sc-app \
        "

RDEPENDS:${PN} = "${VPK180_PACKAGES}"

