LICENSE = "Proprietary & GPL-2.0-only"
LIC_FILES_CHKSUM = " \
	file://${WORKDIR}/git/LICENSE-BINARIES;md5=fa9b03ada9ffccf51dd60899bf28c702 \
	file://${WORKDIR}/git/LICENSE-GPLv2;md5=9afdcd1be3f71bd3791fa5961075d776 \
	"
BRANCH = "xlnx_rel_v2023.2"
SRC_URI = "git://github.com/Xilinx/versal-sc-firmware.git;protocol=https;branch=${BRANCH}"
SRCREV ?= "b8ef8d14a06d7fdd2f5319f1a84d64871f430c49"

inherit dfx_user_dts
COMPATIBLE_MACHINE = "^$"
PACKAGE_ARCH = "${MACHINE_ARCH}"
