FILESEXTRAPATHS:prepend:amd-cortexa53-common := "${THISDIR}/linux-xlnx:"

# XADC I2C driver patches for system controller
SRC_URI:append:amd-cortexa53-common = " file://0001-iio-adc-xilinx-xadc-Split-driver-into-core-and-platf.patch"
SRC_URI:append:amd-cortexa53-common = " file://0002-iio-adc-xilinx-xadc-Add-.setup_channels-to-struct-xa.patch"
SRC_URI:append:amd-cortexa53-common = " file://0003-iio-adc-xilinx-xadc-Add-I2C-interface-support.patch"
SRC_URI:append:amd-cortexa53-common = " file://0004-arm64-xilinx-Enable-XADC-I2C-interface.patch"
SRC_URI:append:amd-cortexa53-common = " file://0001-iio-adc-xilinx-xadc-Handle-I2C-errors-with-known-val.patch"

# DMA-buf heaps: CMA heap for reserved memory regions (cherry-picked from mainline)
# Original commits:
#   507211e3c7a1 Documentation: dma-buf: heaps: Add naming guidelines
#   2034134de658 doc: dma-buf: List the heaps by name
#   8b5690d5c942 dma-buf: heaps: cma: Register list of CMA regions at boot
#   84a593066a85 dma: contiguous: Register reusable CMA regions at boot
#   8f1fc1bf1a3d dma: contiguous: Reserve default CMA heap
#   4f5f8baf7341 dma-buf: heaps: cma: Create CMA heap for each CMA reserved region
SRC_URI:append:amd-cortexa53-common = " file://0005-Documentation-dma-buf-heaps-Add-naming-guidelines.patch"
SRC_URI:append:amd-cortexa53-common = " file://0006-doc-dma-buf-List-the-heaps-by-name.patch"
SRC_URI:append:amd-cortexa53-common = " file://0007-dma-buf-heaps-cma-Register-list-of-CMA-regions-at-bo.patch"
SRC_URI:append:amd-cortexa53-common = " file://0008-dma-contiguous-Register-reusable-CMA-regions-at-boot.patch"
SRC_URI:append:amd-cortexa53-common = " file://0009-dma-contiguous-Reserve-default-CMA-heap.patch"
SRC_URI:append:amd-cortexa53-common = " file://0010-dma-buf-heaps-cma-Create-CMA-heap-for-each-CMA-reser.patch"

# eval-brd-sc-zynqmp needs to enable the CONFIG_VERSAL_SYSMON_I2C
KERNEL_FEATURES:append:eval-brd-sc-zynqmp = " features/versal-sysmon/versal-sysmon.scc"
KERNEL_FEATURES:append:eval-brd-sc-zynqmp = " features/hwmon/hwmon_modules.scc"
