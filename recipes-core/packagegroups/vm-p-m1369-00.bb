DESCRIPTION = "Required packages for VM-P-M1369-00"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

VM-P-M1369-00_PACKAGES = " \
        vm-p-m1369-00-a01 \
        vm-p-m1369-00-sc-app \
        "

RDEPENDS:${PN} = "${VM-P-M1369-00_PACKAGES}"

