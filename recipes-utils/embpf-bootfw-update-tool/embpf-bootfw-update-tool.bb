DESCRIPTION = "Versal and Kria OSPI /QSPI Programming Utility"
SUMMARY = "Scripts used to program Versal and Kria OSPI and QSPI Boot image"

LICENSE = "Proprietary & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=15a2ee395e9805633766dce7d5d10a0f"

BRANCH = "main"
SRC_URI = " \
	git://github.com/Xilinx/embpf-bootfw-update-tool.git;branch=${BRANCH};protocol=https \
"

SRCREV = "a4db33de3a66c73ae4eba865f2446b87027459b6"

S="${WORKDIR}/git"

RDEPENDS:${PN} += " \
    bash \
    labtool-jtag-support \
	coreutils "

do_install() {
    install -d ${D}${datadir}/${PN}
    # cp -r is required here to recursively copy the entire source tree
    # which contains a nested directory structure of scripts and utilities
    cp -r ${S}/* ${D}${datadir}/${PN}

}
