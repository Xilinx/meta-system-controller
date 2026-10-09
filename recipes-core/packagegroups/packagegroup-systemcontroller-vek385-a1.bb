DESCRIPTION = "Package group for VEK385-A01/A02 containing SC app and firmware required for system functionality"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VEK385_PACKAGES = " \
		systemcontroller-app-vek385 \
		systemcontroller-firmware-vek385-a01 \
        "

RDEPENDS:${PN} = "${VEK385_PACKAGES}"

