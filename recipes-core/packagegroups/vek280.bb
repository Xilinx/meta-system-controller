DESCRIPTION = "Required packages for VEK280"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VEK280_PACKAGES = " \
		vek280-a01 \
		vek280-sc-app \
        "

RDEPENDS:${PN} = "${VEK280_PACKAGES}"

