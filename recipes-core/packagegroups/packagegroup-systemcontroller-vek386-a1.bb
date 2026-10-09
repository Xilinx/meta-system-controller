DESCRIPTION = "Package group for VEK386-A1/A2 containing SC app and firmware required for system functionality"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VEK386_PACKAGES = " \
	systemcontroller-firmware-vek386-a1 \
	systemcontroller-app-vek386 \
	"

RDEPENDS:${PN} = "${VEK386_PACKAGES}"
