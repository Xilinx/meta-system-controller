DESCRIPTION = "Package group for vrk165-b1 containing SC app and firmware required for system functionality"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VRK165-B1_PACKAGES = " \
	systemcontroller-firmware-vrk165-b1 \
	systemcontroller-app-vrk165 \
"

RDEPENDS:${PN} = "${VRK165-B1_PACKAGES}"
