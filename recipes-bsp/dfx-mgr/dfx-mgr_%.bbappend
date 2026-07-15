# System Controller override for dfx-mgr firmware load script.
# Replaces direct EEPROM access with sc-board-id utility to support
# both new (a1.01/a2.01) and legacy (a1/a2) board revision formats.

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://xlnx-firmware-load"

RDEPENDS:${PN} += "sc-board-id"

do_install:append() {
    install -m 0755 ${WORKDIR}/xlnx-firmware-load ${D}${bindir}/xlnx-firmware-load
}
