DESCRIPTION = "Default packagegroup for VPK360 pointing to the latest available revision packagegroup"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Points to the latest available revision packagegroup for this board.
VPK360_DEFAULT_PACKAGES = " \
	packagegroup-systemcontroller-vpk360-a1 \
	"

RDEPENDS:${PN} = "${VPK360_DEFAULT_PACKAGES}"
