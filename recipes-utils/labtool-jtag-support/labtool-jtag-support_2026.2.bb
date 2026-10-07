DESCRIPTION = "Labtool (hw_server, xsdb, xvc_server, cs_server) support for system controller"
SUMMARY = "Labtool (hw_server, xsdb, xvc_server, cs_server) support for system controller"

LICENSE = "Proprietary & MIT"
LIC_FILES_CHKSUM = "file://license/LICENSE_PBO;md5=fb790ca133353ea709bb11d2d33db8b3 \
                    file://license/LICENSE_TCL;md5=ddd26d895decd0fa868c3489ddad3251 \
                    file://license/LICENSE_3RD_PARTY_HW_SERVER;md5=4650e7d6ac72ca39a349ccad766aa676 \
                    file://license/LICENSE_3RD_PARTY_CS_SERVER;md5=38e14296063e0ca8b88c1a5149284bd6 \
"

BRANCH = "xlnx_rel_v2026.2"
SRC_URI = " \
	git://github.com/Xilinx/systemctl-labtool.git;branch=${BRANCH};protocol=https \
	file://jtag-mode.service \
	file://jtag-mode-select \
	file://xvc.service \
	file://hw_server.service \
	file://cs_server.service \
	file://jtag-controller-config.service \
"
SRCREV = "9b01e9f855a1d4d701b168bbf111a1b703bc7a97"

inherit systemd

INSANE_SKIP:${PN} = "ldflags already-stripped"
INHIBIT_PACKAGE_STRIP = "1"

SYSTEMD_PACKAGES="${PN}"
# jtag-mode.service picks XVC or the JTAG controller at boot from the loaded PL
# design; xvc.service and jtag-controller-config.service run only in their mode.
SYSTEMD_SERVICE:${PN}="jtag-mode.service xvc.service jtag-controller-config.service hw_server.service cs_server.service"
SYSTEMD_AUTO_ENABLE:${PN}="enable"

S="${WORKDIR}/git"

DEPENDS += "zlib"
RDEPENDS:${PN} += "bash libxcrypt libusb1 python3-core python3-json python3-mmap"
RPROVIDES:${PN} += "/opt/labtools/xilinx_vitis/xsdb"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:zynqmp-generic = "${MACHINE}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_configure[noexec]="1"

do_compile () {
    ${CC} ${CFLAGS} ${LDFLAGS} -o dma_heap_test ${S}/src/dma_heap_test.c
}

do_install () {
    install -d ${D}${base_prefix}/opt
    # cp -r is required here to recursively copy the labtools directory tree
    # which contains a deep nested structure of tools, binaries, and libraries
    cp -r ${S}/opt/labtools ${D}${base_prefix}/opt/.

    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${S}/etc/profile.d/xsdb-variables.sh ${D}${sysconfdir}/profile.d/xsdb-variables.sh

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/jtag-mode.service ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/xvc.service ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/hw_server.service ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/cs_server.service ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/jtag-controller-config.service ${D}${systemd_system_unitdir}/jtag-controller-config.service

    # hw_server init files: hws0.txt for the JTAG controller, hws-xvc.txt for XVC
    install -m 0644 ${S}/etc/hws0.txt ${D}${sysconfdir}/hws0.txt
    install -m 0644 ${S}/etc/hws-xvc.txt ${D}${sysconfdir}/hws-xvc.txt

    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/jtag-mode-select ${D}${bindir}/jtag-mode-select
    install -m 0755 ${S}/usr/bin/jtag-controller-config.sh ${D}${bindir}/jtag-controller-config.sh
    install -m 0755 ${S}/usr/bin/jtag-selftest ${D}${bindir}/jtag-selftest
    install -m 0755 ${B}/dma_heap_test ${D}${bindir}/dma_heap_test
}

SOLIBS = ".so*"
FILES_SOLIBSDEV = ""
FILES:${PN} += " \
    ${base_prefix}/opt/labtools \
    ${@bb.utils.contains('DISTRO_FEATURES','sysvinit','${sysconfdir}/init.d/xsdb', '', d)} \
    "