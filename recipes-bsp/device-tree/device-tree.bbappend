do_configure:append:eval-brd-sc-zynqmp() {
    printf "* ${PN}\nSRCREV: ${SRCREV}\nBRANCH: ${BRANCH}\n\n" > ${S}/device-tree-${MACHINE}.manifest
}

do_deploy:append:eval-brd-sc-zynqmp() {
    install -m 0644 ${S}/device-tree-${MACHINE}.manifest ${DEPLOYDIR}/
}

# Add the direct carrier eeprom@54 leaf to the K24 SC system DT so both the
# arbitrated and non-arbitrated topologies are present (U-Boot drops the unused
# one at boot).
FILESEXTRAPATHS:prepend:zynqmp-k24-sc-sdt-base:linux := "${THISDIR}/files:"

EXTRA_DT_INCLUDE_FILES:append:zynqmp-k24-sc-sdt-base:linux = " sc-k24-carrier-eeprom.dtsi"

# Reserved CMA region for the JTAG TDO buffer dma-buf heap, K24 SC only.
EXTRA_DT_INCLUDE_FILES:append:zynqmp-k24-sc-sdt-base:linux = " sc-k24-jtag-tdo-buffer.dtsi"

include device-tree-sc-${XILINX_XSCT_VERSION}.inc
