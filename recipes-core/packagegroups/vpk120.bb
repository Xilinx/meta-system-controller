DESCRIPTION = "Required packages for VPK120"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VPK120_PACKAGES = " \
        vpk120-b01 \
		vpk120-sc-app \
        "

RDEPENDS:${PN} = "${VPK120_PACKAGES}"

