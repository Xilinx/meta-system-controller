DESCRIPTION = "Package group for vrk160-b1 containing SC app and firmware required for system functionality"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VRK160-B1_PACKAGES = " \
	systemcontroller-firmware-vrk160-b1 \
	systemcontroller-app-vrk160 \
"

RDEPENDS:${PN} = "${VRK160-B1_PACKAGES}"
