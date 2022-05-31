SUMMARY = "Recipe to add 2022.1 ChipScopy Python Package"
LICENSE = "Apache-2.0 & EPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e044f1626fcb471118a71a253d550cb1 \
                    file://epl-v20.html;md5=84283fa8859daf213bdda5a9f8d1be1d \
"

inherit  python3-dir

SRC_URI = "https://artifactory.xilinx.com/artifactory/api/pypi/pypi/chipscopy/2022.1.1648747406/chipscopy-2022.1.1648747406-py3-none-any.whl#sha256=c895b7a261a413a68fbb522dd473539ea572b78b29b3c6c9a10ed5c7a1afb85a;downloadfilename=chipscopy-2022.1.1648747406-py3-none-any.zip;subdir=${BP}"


SRC_URI[md5sum] = "72942a89ed426fbc05137fbdac3cb6ad"
SRC_URI[sha256sum] = "c895b7a261a413a68fbb522dd473539ea572b78b29b3c6c9a10ed5c7a1afb85a"

PN = "python3-chipscopy"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-click \
        ${PYTHON_PN}-importlib-metadata \
        ${PYTHON_PN}-loguru \
        ${PYTHON_PN}-more-itertools \
        ${PYTHON_PN}-rich \
        ${PYTHON_PN}-typing-extensions \
        ${PYTHON_PN}-pprint \
        ${PYTHON_PN}-json \
        ${PYTHON_PN}-matplotlib \
        ${PYTHON_PN}-plotly \
        ${PYTHON_PN}-regex \
        ${PYTHON_PN}-pandas \
        "

DEPENDS += " \
	python3-wheel-native \
	python3-pip-native \
"

FILES:${PN} += "\
    ${libdir}/${PYTHON_DIR}/site-packages/* \
"

do_install() {
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy-2022.1.1648747406.dist-info
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy

    cp -r ${S}/chipscopy/* ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy/
    cp -r ${S}/chipscopy-2022.1.1648747406.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy-2022.1.1648747406.dist-info/
}
