COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "62f487028ff420f0d230878c60cf118810ccb578"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"
