COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "ceeb3ab387e1d89bedf62cbb9ecb827acb77fb10"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"

# RAFT Makefile installs pmcapture.service when raftstartupsc is enabled.
SYSTEMD_SERVICE:${PN}:append = " pmcapture.service"
FILES:${PN} += "${mandir}/man1/pmcapture.1"
