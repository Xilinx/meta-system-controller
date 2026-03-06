SUMMARY = "Recipe to add 2025.2 ChipScopy Python Package"
LICENSE = "Apache-2.0 & EPL-2.0"
LIC_FILES_CHKSUM = "file://chipscopy-2025.2.0.55.dist-info/LICENSE;md5=ed1460b087aa5c22cfda4e3cdb2b2c88"

inherit  python3-dir

SRC_URI = "https://files.pythonhosted.org/packages/80/f7/9815ad3e25ab51f53b58db689451da2c821fd3326c350dce40411a27b90b/chipscopy-2025.2.0.55-py3-none-any.whl;downloadfilename=chipscopy-2025.2.0.55-py3-none-any.zip;subdir=${BP}"

SRC_URI[md5sum] = "eeaf2cb22c942547af9371c76ef1e3e7"
SRC_URI[sha256sum] = "5b9c4adfbb50498eedb800b3d17dfe78c5bf08cc4abe58076e7d05cc96180d86"

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
        ${PYTHON_PN}-antlr4-runtime \
        "

DEPENDS += " \
	python3-wheel-native \
	python3-pip-native \
"

FILES:${PN} += "\
    ${libdir}/${PYTHON_DIR}/site-packages/* \
"

do_install() {
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy-2025.2.0.55.dist-info
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy

    # cp -r is required here to recursively copy the chipscopy Python package
    # which contains a deep nested directory structure of modules and subpackages
    cp -r ${S}/chipscopy/* ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy/
    cp -r ${S}/chipscopy-2025.2.0.55.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy-2025.2.0.55.dist-info/
}
