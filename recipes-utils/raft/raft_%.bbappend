COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "55b24eb59ce5d1e01dce658cfce3a89a50fee231"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"
