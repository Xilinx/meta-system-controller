COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "a6072beae601e220e4b54e3d8caa2b1da2bfa378"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"
