SUMMARY = "Recipe to add 2026.1 ChipScopy Python Package"
LICENSE = "Apache-2.0 & EPL-2.0"
LIC_FILES_CHKSUM = "file://chipscopy-2026.1.0.45.dist-info/licenses/LICENSE;md5=ed1460b087aa5c22cfda4e3cdb2b2c88"

inherit  python3-dir

SRC_URI = "https://files.pythonhosted.org/packages/d0/7e/bb42ae82a84ab0d6c1cdc00132d7233a836536bd6e13eed80cd129d4afba/chipscopy-2026.1.0.45-py3-none-any.whl;downloadfilename=chipscopy-2026.1.0.45-py3-none-any.zip;subdir=${BP}"

SRC_URI[md5sum] = "6d0db7b1768d46482d85b26ca8767c0d"
SRC_URI[sha256sum] = "344f60359af00bcf4ab1ffaf8c547bc8bf6d36feab2af0f40b8701ee348d9b2f"

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
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy-2026.1.0.45.dist-info
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy

    # cp -r is required here to recursively copy the chipscopy Python package
    # which contains a deep nested directory structure of modules and subpackages
    cp -r ${S}/chipscopy/* ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy/
    cp -r ${S}/chipscopy-2026.1.0.45.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy-2026.1.0.45.dist-info/
}
