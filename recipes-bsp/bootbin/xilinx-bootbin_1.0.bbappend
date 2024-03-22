BIF_UDFBH_ATTR = "bootbin-version-header"

BIF_PARTITION_ATTR[bootbin-version-header] = "udf_bh"
BIF_PARTITION_IMAGE[bootbin-version-header] = "${RECIPE_SYSROOT}/boot/bootbin-version-header.txt"

BIF_PARTITION_ATTR[u-boot-xlnx-fit-blob] = "destination_cpu=a53-0,load=0x100000"
BIF_PARTITION_IMAGE[u-boot-xlnx-fit-blob] = "${RECIPE_SYSROOT}/boot/fit-dtb.blob"

BIF_PARTITION_ATTR:eval-brd-sc-zynqmp = "${BIF_FSBL_ATTR} ${BIF_BITSTREAM_ATTR} ${BIF_ATF_ATTR} u-boot-xlnx-fit-blob ${BIF_SSBL_ATTR} bootbin-version-header"

require xilinx-bootbin-version.inc

ADDN_COMPILE_DEPENDS = ""
ADDN_COMPILE_DEPENDS:eval-brd-sc-zynqmp = "bootbin-version-header:do_deploy"

do_compile[depends] += "${ADDN_COMPILE_DEPENDS}"
