DESCRIPTION = "Default packagegroup for SCU200 pointing to the latest available revision packagegroup"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Points to the latest available revision packagegroup for this board.
SCU200_DEFAULT_PACKAGES = " \
	packagegroup-systemcontroller-scu200-b1 \
	"

RDEPENDS:${PN} = "${SCU200_DEFAULT_PACKAGES}"
