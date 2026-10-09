DESCRIPTION = "Default packagegroup for VRK160 pointing to the latest available revision packagegroup"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Points to the latest available revision packagegroup for this board.
VRK160_DEFAULT_PACKAGES = " \
	packagegroup-systemcontroller-vrk160-b1 \
	"

RDEPENDS:${PN} = "${VRK160_DEFAULT_PACKAGES}"
