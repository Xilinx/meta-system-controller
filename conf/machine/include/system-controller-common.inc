MACHINEOVERRIDES =. "system-controller:"

MACHINE_FEATURES += "fpga-overlay"

IMAGE_FSTYPES += "wic wic.xz"

# Required generic machine inclusion
require conf/machine/zynqmp-eg-generic.conf
