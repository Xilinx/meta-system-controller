COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "474d185b3469742ca5d32c2caa4de922fa6d851a"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"
