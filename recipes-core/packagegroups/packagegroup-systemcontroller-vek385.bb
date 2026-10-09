DESCRIPTION = "Default packagegroup for VEK385 pointing to the latest available revision packagegroup"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Points to the latest available revision packagegroup for this board.
VEK385_DEFAULT_PACKAGES = " \
	packagegroup-systemcontroller-vek385-b1 \
	"

RDEPENDS:${PN} = "${VEK385_DEFAULT_PACKAGES}"
