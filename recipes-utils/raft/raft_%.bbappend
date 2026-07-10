COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "5a48f2b8c2cf41d2a8234e0f99aee608d0df0b54"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"
