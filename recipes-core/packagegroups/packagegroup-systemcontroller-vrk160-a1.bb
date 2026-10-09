DESCRIPTION = "Package group for VRK160-A1/A2/A3 containing SC app and firmware required for system functionality"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VRK160_PACKAGES = " \
		systemcontroller-app-vrk160 \
		systemcontroller-firmware-vrk160-a1 \
        "

RDEPENDS:${PN} = "${VRK160_PACKAGES}"
