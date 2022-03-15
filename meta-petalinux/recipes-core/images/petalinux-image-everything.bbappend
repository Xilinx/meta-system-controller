require petalinux-image-common-sc.inc

IMAGE_INSTALL:append:vck-sc = " power-advantage-tool packagegroup-petalinux-syscontroller packagegroup-petalinux-scweb"
IMAGE_INSTALL:append:vpk-sc = " power-advantage-tool packagegroup-petalinux-syscontroller packagegroup-petalinux-scweb"

