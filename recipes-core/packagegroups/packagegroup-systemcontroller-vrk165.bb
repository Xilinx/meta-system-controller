DESCRIPTION = "Default packagegroup for VRK165 pointing to the latest available revision packagegroup"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Points to the latest available revision packagegroup for this board.
VRK165_DEFAULT_PACKAGES = " \
	packagegroup-systemcontroller-vrk165-b1 \
	"

RDEPENDS:${PN} = "${VRK165_DEFAULT_PACKAGES}"
