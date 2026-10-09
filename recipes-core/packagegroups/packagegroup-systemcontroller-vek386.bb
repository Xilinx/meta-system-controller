DESCRIPTION = "Default packagegroup for VEK386 pointing to the latest available revision packagegroup"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Points to the latest available revision packagegroup for this board.
VEK386_DEFAULT_PACKAGES = " \
	packagegroup-systemcontroller-vek386-a1 \
	"

RDEPENDS:${PN} = "${VEK386_DEFAULT_PACKAGES}"
