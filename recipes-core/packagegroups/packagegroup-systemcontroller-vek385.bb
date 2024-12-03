DESCRIPTION = "Required packages for VEK385"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VEK385_PACKAGES = " \
		systemcontroller-app-vek385 \
        "

RDEPENDS:${PN} = "${VEK385_PACKAGES}"

