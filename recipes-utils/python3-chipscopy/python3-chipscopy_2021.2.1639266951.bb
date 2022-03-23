SUMMARY = "Recipe to embedded ChipScopy Python Package"
LICENSE = "Apache-2.0 & EPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e044f1626fcb471118a71a253d550cb1 \
                    file://epl-v20.html;md5=84283fa8859daf213bdda5a9f8d1be1d \
"

inherit  python3-dir

SRC_URI = "https://files.pythonhosted.org/packages/97/9f/9bb2043f93ca1b737559396707d0ca82c8292cf7ac61f986c724fa63a3a8/chipscopy-2021.2.1639266951-py3-none-any.whl;downloadfilename=chipscopy-2021.2.1639266951-py3-none-any.zip;subdir=${BP}"

SRC_URI[md5sum] = "28eaae19eae90acc5586e2e6104599ff"
SRC_URI[sha256sum] = "2b0234606adb7681e1facac9d6d9a57c5ade4737098880b3ba6438250bd10252"

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
        ${PYTHON_PN}-pyqt5 \
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
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy-2021.2.1639266951.dist-info
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy

    cp -r ${S}/chipscopy/* ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy/
    cp -r ${S}/chipscopy-2021.2.1639266951.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/chipscopy-2021.2.1639266951.dist-info/
}


