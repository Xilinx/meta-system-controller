DESCRIPTION = "Package group for VPK360-A1 containing SC app and firmware required for system functionality"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VPK360_PACKAGES = " \
			systemcontroller-firmware-vpk360-a1 \
			systemcontroller-app-vpk360 \
			"

RDEPENDS:${PN} = "${VPK360_PACKAGES}"
