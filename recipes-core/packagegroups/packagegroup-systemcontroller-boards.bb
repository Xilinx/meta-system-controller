DESCRIPTION = "SC Board support packages"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

SC_BOARDS_PACKAGES = " \
	packagegroup-systemcontroller-vek385 \
	packagegroup-systemcontroller-vek385-a1 \
	packagegroup-systemcontroller-vek385-b1 \
	packagegroup-systemcontroller-vek386 \
	packagegroup-systemcontroller-vek386-a1 \
	packagegroup-systemcontroller-vpk360 \
	packagegroup-systemcontroller-vpk360-a1 \
	packagegroup-systemcontroller-scu200 \
	packagegroup-systemcontroller-scu200-a1 \
	packagegroup-systemcontroller-scu200-b1 \
	packagegroup-systemcontroller-vrk160 \
	packagegroup-systemcontroller-vrk160-a1 \
	packagegroup-systemcontroller-vrk160-a4 \
	packagegroup-systemcontroller-vrk160-b1 \
	packagegroup-systemcontroller-vrk165 \
	packagegroup-systemcontroller-vrk165-a1 \
	packagegroup-systemcontroller-vrk165-b1 \
	packagegroup-systemcontroller-vmk365 \
	packagegroup-systemcontroller-vmk365-01 \
"

RDEPENDS:${PN} = "${SC_BOARDS_PACKAGES}"

