DESCRIPTION = "Required packages for VCK190"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VCK190_PACKAGES = " \
        vck190-sc-app \
        "

RDEPENDS:${PN} = "${VCK190_PACKAGES}"
