FILESEXTRAPATHS:prepend:amd-cortexa53-common := "${THISDIR}/linux-xlnx:"

# XADC I2C driver patches for system controller
SRC_URI:append:amd-cortexa53-common = " file://0001-iio-adc-xilinx-xadc-Split-driver-into-core-and-platf.patch"
SRC_URI:append:amd-cortexa53-common = " file://0002-iio-adc-xilinx-xadc-Add-.setup_channels-to-struct-xa.patch"
SRC_URI:append:amd-cortexa53-common = " file://0003-iio-adc-xilinx-xadc-Add-I2C-interface-support.patch"
SRC_URI:append:amd-cortexa53-common = " file://0004-arm64-xilinx-Enable-XADC-I2C-interface.patch"
SRC_URI:append:amd-cortexa53-common = " file://0001-iio-adc-xilinx-xadc-Handle-I2C-errors-with-known-val.patch"

# eval-brd-sc-zynqmp needs to enable the CONFIG_VERSAL_SYSMON_I2C
KERNEL_FEATURES:append:eval-brd-sc-zynqmp = " features/versal-sysmon/versal-sysmon.scc"
KERNEL_FEATURES:append:eval-brd-sc-zynqmp = " features/hwmon/hwmon_modules.scc"
