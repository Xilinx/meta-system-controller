LICENSE = "Proprietary & GPL-2.0-only"
LIC_FILES_CHKSUM = " \
	file://${WORKDIR}/git/LICENSE-BINARIES;md5=fa9b03ada9ffccf51dd60899bf28c702 \
	file://${WORKDIR}/git/LICENSE-GPLv2;md5=9afdcd1be3f71bd3791fa5961075d776 \
	"
BRANCH = "xlnx_rel_v2023.2"
SRC_URI = "git://github.com/Xilinx/versal-sc-firmware.git;protocol=https;branch=${BRANCH}"
SRCREV ?= "a9a7def2737b7bfe570c98ae97582ee1b07e8442"

inherit dfx_user_dts
COMPATIBLE_MACHINE = "^$"
PACKAGE_ARCH = "${MACHINE_ARCH}"
