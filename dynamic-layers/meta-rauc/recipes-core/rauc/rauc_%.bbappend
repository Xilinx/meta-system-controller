FILESEXTRAPATHS:prepend:eval-brd-sc-zynqmp := "${THISDIR}/files:"

SRC_URI:append:eval-brd-sc-zynqmp = "  \
	file://system.conf.in \
	file://ca.cert.pem \
	"

do_install:append:eval-brd-sc-zynqmp() {
	install -d ${D}${sysconfdir}/rauc
	sed -e 's!@MACHINE@!${MACHINE}!g' ${WORKDIR}/system.conf.in > ${D}${sysconfdir}/rauc/system.conf
}
