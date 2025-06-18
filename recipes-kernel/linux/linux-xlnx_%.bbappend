FILESEXTRAPATHS:prepend := ":${THISDIR}/${PN}:"
SRC_URI:append = " file://0001-PCA9541-Increase-I2C-bus-arbitration-timeout.patch"
SRC_URI:append = " file://0001-Reset-the-dwc3-USB-core-on-init.patch"

KERNEL_FEATURES:append:eval-brd-sc-zynqmp = " features/versal-sysmon/versal-sysmon.scc"
KERNEL_FEATURES:append:eval-brd-sc-zynqmp = " features/hwmon/hwmon_modules.scc"
