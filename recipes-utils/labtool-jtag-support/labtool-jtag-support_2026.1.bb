DESCRIPTION = "Labtool (hw_server, xsdb, xvc_server) support for system controller"
SUMMARY = "Labtool (hw_server, xsdb, xvc_server) support for system controller"

LICENSE = "Proprietary & MIT"
LIC_FILES_CHKSUM = "file://license/LICENSE_PBO;md5=fb790ca133353ea709bb11d2d33db8b3 \
                    file://license/LICENSE_TCL;md5=ddd26d895decd0fa868c3489ddad3251 \
                    file://license/LICENSE_3RD_PARTY_HW_SERVER;md5=4650e7d6ac72ca39a349ccad766aa676 \
                    file://license/LICENSE_3RD_PARTY_CS_SERVER;md5=38e14296063e0ca8b88c1a5149284bd6 \
"

BRANCH = "xlnx_rel_v2026.1"
SRC_URI = " \
	git://github.com/Xilinx/systemctl-labtool.git;branch=${BRANCH};protocol=https \
	file://xvc.service \
	file://hw_server.service \
	file://cs_server.service \
"
SRCREV = "90d456a414625163027289c2bda0102125b9baf7"

inherit systemd

INSANE_SKIP:${PN} = "ldflags already-stripped"
INHIBIT_PACKAGE_STRIP = "1"

SYSTEMD_PACKAGES="${PN}"
SYSTEMD_SERVICE:${PN}="xvc.service hw_server.service cs_server.service"
SYSTEMD_AUTO_ENABLE:${PN}="enable"

S="${WORKDIR}/git"

DEPENDS += "zlib"
RDEPENDS:${PN} += "bash libxcrypt libusb1"
RPROVIDES:${PN} += "/opt/labtools/xilinx_vitis/xsdb"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:zynqmp-generic = "${MACHINE}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_configure[noexec]="1"
do_compile[noexec]="1"

do_install () {
    install -d ${D}${base_prefix}/opt
    # cp -r is required here to recursively copy the labtools directory tree
    # which contains a deep nested structure of tools, binaries, and libraries
    cp -r ${S}/opt/labtools ${D}${base_prefix}/opt/.

    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${S}/etc/profile.d/xsdb-variables.sh ${D}${sysconfdir}/profile.d/xsdb-variables.sh

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/xvc.service ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/hw_server.service ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/cs_server.service ${D}${systemd_system_unitdir}
}

SOLIBS = ".so*"
FILES_SOLIBSDEV = ""
FILES:${PN} += " \
    ${base_prefix}/opt/labtools \
    ${@bb.utils.contains('DISTRO_FEATURES','sysvinit','${sysconfdir}/init.d/xsdb', '', d)} \
    "
