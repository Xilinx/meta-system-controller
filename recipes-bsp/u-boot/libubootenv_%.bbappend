FILESEXTRAPATHS:prepend:system-controller := "${THISDIR}/${PN}:"

PACKAGE_ARCH:system-controller = "${MACHINE_ARCH}"
SRC_URI:append:system-controller = " file://fw_env.config "

# The following 2 lines bump the version of code to release v0.3.5 in order to
# incorporate a fix to the way NOR flashes are handled.
# Before this bump the OSPI is written 1 byte at a time, which leads to
# excessively long write times, and which could lead to premature burnout of
# the underlying device.
# The following 2 lines should be removed when updating to 5.0-scarthgap, or beyond.
SRCREV:system-controller = "3f4d15e36ceb58085b08dd13f3f2788e9299877b"
DEPENDS:append:system-controller = " libyaml"

do_install:append:system-controller() {
    install -d ${D}${sysconfdir}/
    install -m 0644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}/
}
