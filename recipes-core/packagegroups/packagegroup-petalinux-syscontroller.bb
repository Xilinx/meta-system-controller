DESCRIPTION = "Required packages for system controller"

PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

SYSTEM_CONTROLLER_PACKAGES = " \
        python3-flask \
        python3-flask-restful \
        python3-werkzeug \
        python3-jinja2 \
        python3-markupsafe \
        python3-itsdangerous \
        python3-twisted \
        python3-gevent \
        python3-matplotlib \
        packagegroup-petalinux-lmsensors \
        i2c-tools \
        libgpiod \
        libgpiod-tools \
        system-controller-app \
        python3-loguru \
        python3-rich \
"
RDEPENDS:${PN} = "${SYSTEM_CONTROLLER_PACKAGES}"

# TODO:
# 1. Disable power-advantage-tool due to python3-ipywidgets dependency
# 2. Disable python3-chipscopy due to python3-plotly dependency
# 3. python3-ipywidgets and python3-plotly are part of meta-jupyter layer. Once
#    meta-jupyter port forward to langdale is complete this needs to be enabled.
#SYSTEM_CONTROLLER_PACKAGES:append:vck-sc-zynqmp = " power-advantage-tool"
