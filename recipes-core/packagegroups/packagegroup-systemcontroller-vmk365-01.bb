DESCRIPTION = "Required packages for vmk365 func_rev 01"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VMK365_01_PACKAGES = " \
	systemcontroller-firmware-vmk365-01 \
	systemcontroller-app-vmk365 \
	"

RDEPENDS:${PN} = "${VMK365_01_PACKAGES}"
