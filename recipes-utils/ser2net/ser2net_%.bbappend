FILESEXTRAPATHS:prepend:system-controller := "${THISDIR}/${PN}:"

SRC_URI:append:system-controller = " file://ser2net.yaml \
									 file://ser2net.service "

inherit systemd

SYSTEMD_PACKAGES="${PN}"
SYSTEMD_SERVICE:${PN}="ser2net.service"
SYSTEMD_AUTO_ENABLE:${PN}="enable"

do_install:append:system-controller() {
    install -D -m 0644 ${WORKDIR}/ser2net.yaml ${D}${sysconfdir}/ser2net.yaml
    install -D -m 0644 ${WORKDIR}/ser2net.service ${D}${systemd_system_unitdir}/ser2net.service
}

