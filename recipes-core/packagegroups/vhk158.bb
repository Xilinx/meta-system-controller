DESCRIPTION = "Required packages for VHK158"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VHK158_PACKAGES = " \
 		vhk158-a01 \
		vhk158-sc-app \
        "

RDEPENDS:${PN} = "${VHK158_PACKAGES}"

