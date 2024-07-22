SUMMARY = "U-Boot libraries and tools to access environment"

DESCRIPTION = "This package contains tools and libraries to read \
and modify U-Boot environment. \
It provides a hardware-independent replacement for fw_printenv/setenv utilities \
provided by U-Boot"

HOMEPAGE = "https://github.com/sbabic/libubootenv"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://LICENSES/LGPL-2.1-or-later.txt;md5=4fbd65380cdd255951079008b364516c"
SECTION = "libs"

FILESEXTRAPATHS:prepend:system-controller := "${THISDIR}/${PN}:"
PACKAGE_ARCH:system-controller = "${MACHINE_ARCH}"

SRC_URI = " \
	git://github.com/sbabic/libubootenv;protocol=https;branch=master \
	file://fw_env.config \
	"
SRCREV = "3f4d15e36ceb58085b08dd13f3f2788e9299877b"

S = "${WORKDIR}/git"

inherit cmake lib_package

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release"

do_install:append:system-controller() {
    install -d ${D}${sysconfdir}/
    install -m 0644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}/
}

DEPENDS = "zlib libyaml"
PROVIDES += "u-boot-fw-utils"
RPROVIDES:${PN}-bin += "u-boot-fw-utils"

BBCLASSEXTEND = "native"
