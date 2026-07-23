COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "28465daa83b239c75d2721f0862833e1f037486b"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"
