SUMMARY = "License Files"
DESCRIPTION = "Recipe to include license files in the root filesystem"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PETALINUX_LIC_URL ??= "https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller-license/"
PETALINUX_LIC_DIR ??= "system-controller-license"


COMPATIBLE_MACHINE:system-controller = "${MACHINE}"

S = "${WORKDIR}"

SRC_URI = "${PETALINUX_LIC_URL}/${PETALINUX_LIC_DIR}.tar.gz"

SRC_URI[sha256sum] = "86aa4cb5474a85a3f88d87d710bd1f858aa4e7713002a7ec034cf3717cb5c072"

do_install() {
	install -d ${D}${datadir}/lic/
	cp ${S}/system-controller-license/* ${D}${datadir}/lic/
}

FILES:${PN} += "${datadir}/lic/*"
