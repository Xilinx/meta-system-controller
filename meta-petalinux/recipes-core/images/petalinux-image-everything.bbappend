require petalinux-image-common-sc.inc

# TODO - Disable power-advantage-tool due to python3-ipywidgets dependency which
# is part of meta-jupyter layer.

IMAGE_INSTALL:append:eval-brd-sc-zynqmp = " \
    packagegroup-petalinux-syscontroller \
    packagegroup-petalinux-scweb \
    "

IMAGE_INSTALL:append:vck-sc-zynqmp = " \
    packagegroup-petalinux-syscontroller \
    packagegroup-petalinux-scweb \
    "
