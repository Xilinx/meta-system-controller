COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "1204bebcfa922784718c92551cd2920b3ca491e6"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"
