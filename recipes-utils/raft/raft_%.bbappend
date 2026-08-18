COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "b3ab7a0f42986b4bc995bcf40ca605fc92cc2b31"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"

# RAFT Makefile installs pmcapture.service when raftstartupsc is enabled.
SYSTEMD_SERVICE:${PN}:append = " pmcapture.service"
FILES:${PN} += "${mandir}/man1/pmcapture.1"
