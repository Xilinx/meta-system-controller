DESCRIPTION = "SC Board support packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

SC_BOARDS_PACKAGES = " \
	packagegroup-systemcontroller-vek385 \
	packagegroup-systemcontroller-vek385-b1 \
	packagegroup-systemcontroller-scu200 \
	packagegroup-systemcontroller-vrk160-a4 \
	packagegroup-systemcontroller-vrk160 \
	packagegroup-systemcontroller-vrk165 \
	packagegroup-systemcontroller-scu200-b1 \
	packagegroup-systemcontroller-vek386 \
	packagegroup-systemcontroller-vpk360 \
	packagegroup-systemcontroller-vrk160-b1 \
	packagegroup-systemcontroller-vrk165-b1 \
"

RDEPENDS:${PN} = "${SC_BOARDS_PACKAGES}"

