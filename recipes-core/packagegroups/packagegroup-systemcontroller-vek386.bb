DESCRIPTION = "Required packages for vek386"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VEK386_PACKAGES = " \
	systemcontroller-firmware-vek386-a1 \
	systemcontroller-app-vek386 \
	"

RDEPENDS:${PN} = "${VEK386_PACKAGES}"
