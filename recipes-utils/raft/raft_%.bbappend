COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"


BRANCH = "2025.2"
SRC_URI = "git://github.com/Xilinx/RAFT;protocol=https;branch=${BRANCH}"
SRCREV = "e50b7eb4738378ab680b562009aa18a85700f7a5"

PACKAGECONFIG:append:amd-cortexa53-common = " raftstartupsc"

# RAFT Makefile installs pmcapture.service when raftstartupsc is enabled.
SYSTEMD_SERVICE:${PN}:append = " pmcapture.service"
FILES:${PN} += "${mandir}/man1/pmcapture.1"
