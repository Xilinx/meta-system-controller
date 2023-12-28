BIF_PARTITION_ATTR[u-boot-xlnx-fit-blob] = "destination_cpu=a53-0,load=0x100000"
BIF_PARTITION_IMAGE[u-boot-xlnx-fit-blob] = "${RECIPE_SYSROOT}/boot/fit-dtb.blob"

BIF_PARTITION_ATTR:eval-brd-sc-zynqmp = "${BIF_FSBL_ATTR} ${BIF_BITSTREAM_ATTR} ${BIF_ATF_ATTR} u-boot-xlnx-fit-blob ${BIF_SSBL_ATTR}"
