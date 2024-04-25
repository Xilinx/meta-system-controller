DESCRIPTION = "System Contoller App"
SUMMARY = "System Controller App"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=306deb5c0f33f4b0570c30ba8564f93f"

SC_APP_REPO = "git://github.com/Xilinx/system-controller-app.git"
SC_APP_BRANCH = "xlnx_rel_v2023.2"
SC_APP_SRCREV = "fd1e6236ed8aecec58b3ae9e319b4e3dcaeefa79"

SRC_URI = "\
    ${SC_APP_REPO};branch=${SC_APP_BRANCH};protocol=https \
    file://system_controller.service \
"

SRCREV="${SC_APP_SRCREV}"

inherit systemd

SYSTEMD_PACKAGES="${PN}"
SYSTEMD_SERVICE:${PN}="system_controller.service"
SYSTEMD_AUTO_ENABLE:${PN}="enable"

S="${WORKDIR}/git"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:a2197 = "${MACHINE}"
COMPATIBLE_MACHINE:system-controller = "${MACHINE}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

DEPENDS += "libgpiod"
RDEPENDS:${PN} += "bootgen \
		   labtool-jtag-support \
		   python3-smbus2"

do_compile(){
	cd ${S}/build/
	oe_runmake
}

do_install(){
	install -d ${D}/usr/bin/
	install -d ${D}${datadir}/system-controller-app

	cp ${S}/build/sc_app ${D}${bindir}
	cp ${S}/build/sc_appd ${D}${bindir}
	cp -r ${S}/BIT ${D}${datadir}/system-controller-app/
	cp -r ${S}/script ${D}${datadir}/system-controller-app/
	ln -s ${datadir}/system-controller-app/script/setup_board.sh ${D}${bindir}

	install -d ${D}${systemd_system_unitdir}
	install -m 0644 ${WORKDIR}/system_controller.service ${D}${systemd_system_unitdir}

	# Temporary workaround, vitis does not build with Scarthgap
	rm -f ${D}/usr/share/system-controller-app/BIT/xsdb_funcs.tcl
}
