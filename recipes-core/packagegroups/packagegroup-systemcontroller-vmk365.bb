DESCRIPTION = "Default packagegroup for VMK365 pointing to the latest available revision packagegroup"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# Points to the latest available revision packagegroup for this board.
VMK365_DEFAULT_PACKAGES = " \
	packagegroup-systemcontroller-vmk365-01 \
	"

RDEPENDS:${PN} = "${VMK365_DEFAULT_PACKAGES}"
