# SDT machine bootbin-version-header BIF defaults
# (overridden by xilinx-bootbin-sc.inc for system-controller machines)
BIF_PARTITION_ATTR[bootbin-version-header] = "udf_bh"
BIF_PARTITION_IMAGE[bootbin-version-header] = "${DEPLOY_DIR_IMAGE}/bootbin-version-header-${MACHINE}.bin"

BOOTBIN_INCLUDE:system-controller = "xilinx-bootbin-sc.inc"

include ${BOOTBIN_INCLUDE}

# SDT machine bootbin-version-header dependency
BOOTBIN_SDT_DEPENDS = ""
BOOTBIN_SDT_DEPENDS:zynqmp-k24-sc-sdt-base = "bootbin-version-header:do_deploy"
BOOTBIN_SDT_DEPENDS:zynqmp-k26-sc-sdt-base = "bootbin-version-header:do_deploy"
do_configure[depends] += "${BOOTBIN_SDT_DEPENDS}"

# Add bootbin-version-header to BIF for SDT machines
BIF_PARTITION_ATTR:append:zynqmp-k24-sc-sdt-base = " bootbin-version-header"
BIF_PARTITION_ATTR:append:zynqmp-k26-sc-sdt-base = " bootbin-version-header"
