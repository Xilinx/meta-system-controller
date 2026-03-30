SUMMARY = "System Controller App - VEK385 board specific files"

LICENSE = "Proprietary & MIT"
LIC_FILES_CHKSUM:append = " file://${WORKDIR}/LICENSE_BINARIES.md;md5=fef5c700acd3d5fa08c24279a8126704"

FILESEXTRAPATHS:prepend := "${THISDIR}/${BOARD}:"

SRC_URI = " \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/LICENSE_BINARIES.md;name=vek385-lic \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/VEK385-A01.json;name=vek385-A01-json \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/VEK385-A02.json;name=vek385-A02-json \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/vek385.jpg;name=vek385-jpg \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/VEK385.json;name=vek385-json \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/vek385_A01_es1_system_wrapper.pdi;name=vek385-A01-es1-system \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/vek385_A02_es1_system_wrapper.pdi;name=vek385-A02-es1-system \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/vek385_es1_system_wrapper.pdi;name=vek385-es1-system \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/VEK385_home.png;name=vek385-png \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/vek385_strings.js;name=vek385-js \
	https://edf.amd.com/sswreleases/rel-v2026.1/system-controller/sc_app_bsp/2026.1/2026.1_202602171220/external/VEK385/vek385_versal_bit.elf;name=vek385-elf \
	file://ser2net_vek385_a01.yaml \
	file://ser2net_vek385.yaml \
"

SRC_URI[vek385-lic.sha256sum] = "c8ba4634bf62ead0f2dc0e221d4ea107e54f843f82e337c3f7bdbec4d82cbf20"
SRC_URI[vek385-A01-json.sha256sum] = "0635252ac59bc108f80d2cdb26f102eddb8d1195dacf5cb16c49490fd345165a"
SRC_URI[vek385-A02-json.sha256sum] = "0635252ac59bc108f80d2cdb26f102eddb8d1195dacf5cb16c49490fd345165a"
SRC_URI[vek385-jpg.sha256sum] = "c6753fc7859c7e783a3b920ec58f1be32b5e73a6554e5d9f8c48ecf7b81d678c"
SRC_URI[vek385-json.sha256sum] = "0b660a75cda2056c08554f7c9396a5aaaa2b3ec99438316cafdcc0c548a28c84"
SRC_URI[vek385-A01-es1-system.sha256sum] = "e858fcd745689449b0199dc137fce928f2ca1bef54b076962a096f4a4034439d"
SRC_URI[vek385-A02-es1-system.sha256sum] = "e858fcd745689449b0199dc137fce928f2ca1bef54b076962a096f4a4034439d"
SRC_URI[vek385-es1-system.sha256sum] = "4bca1c43ee770d0ea869d5b79a4cbf53733e6c589c6c35c9312683b3d70643f1"
SRC_URI[vek385-png.sha256sum] = "aff86f39817f877873991a18e7aaf86780314648a3b0c9eb1c6128c0c9df0daf"
SRC_URI[vek385-js.sha256sum] = "1d114d1ae1d310c61858d472a36f2da45206a7c0501d293f01692b21350bf4b6"
SRC_URI[vek385-elf.sha256sum] = "2d9c2be80b1f83e8f077ed07fd0f00d3646fa3d21e9736dfd5faafd2ce2389a3"

BOARD = "vek385"

require system-controller-app.inc

do_install:append() {
	install -d ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}
	install -d ${D}${datadir}/scweb/static/images/
	install -d ${D}${datadir}/scweb/static/js/
	install -d ${D}${datadir}/config

	install -m 0664 ${WORKDIR}/${BOARD_upper}-A01.json ${D}${datadir}/system-controller-app/board/
	ln -sr ${D}${datadir}/system-controller-app/board/${BOARD_upper}-A01.json ${D}${datadir}/system-controller-app/board/${BOARD_upper}-A02.json

	install -m 0664 ${WORKDIR}/${BOARD}_A01_es1_system_wrapper.pdi ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}/
	install -m 0664 ${WORKDIR}/${BOARD}_A02_es1_system_wrapper.pdi ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}/
	install -m 0664 ${WORKDIR}/${BOARD}_es1_system_wrapper.pdi ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}/
	install -m 0664 ${WORKDIR}/${BOARD}_versal_bit.elf ${D}${datadir}/system-controller-app/BIT/${BOARD_upper}/

	install -m 0664 ${WORKDIR}/${BOARD_upper}_home.png ${D}${datadir}/scweb/static/images/
	install -m 0664 ${WORKDIR}/${BOARD}.jpg ${D}${datadir}/scweb/static/images/
	install -m 0664 ${WORKDIR}/${BOARD}_strings.js ${D}${datadir}/scweb/static/js/

	install -m 0664 ${WORKDIR}/ser2net_${BOARD}_a01.yaml ${D}${datadir}/config/
	install -m 0664 ${WORKDIR}/ser2net_${BOARD}.yaml ${D}${datadir}/config/
	ln -sr ${D}${datadir}/config/ser2net_${BOARD}_a01.yaml ${D}${datadir}/config/ser2net_${BOARD}_a02.yaml
}

FILES:${PN} += " \
    ${datadir}/scweb/ \
    ${datadir}/config \
    "
