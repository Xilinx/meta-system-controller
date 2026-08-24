COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "b5fe66ae72f1a49d352b2b1946d7ef1a6a988fe9"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"

# RAFT Makefile installs pmcapture.service when raftstartupsc is enabled.
SYSTEMD_SERVICE:${PN}:append = " pmcapture.service"
FILES:${PN} += "${mandir}/man1/pmcapture.1"
