DESCRIPTION = "Required packages for vpk360"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VPK360_PACKAGES = " \
			systemcontroller-firmware-vpk360-a1 \
			systemcontroller-app-vpk360 \
			"

RDEPENDS:${PN} = "${VPK360_PACKAGES}"
