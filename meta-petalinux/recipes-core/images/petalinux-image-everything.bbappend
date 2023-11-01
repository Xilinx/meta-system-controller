require petalinux-image-common-sc.inc

IMAGE_INSTALL:append:system-controller = " \
    packagegroup-petalinux-syscontroller \
    packagegroup-petalinux-scweb \
    "

IMAGE_INSTALL:append:system-controller = " \
    vhk158-a01 \
    vpk120-b01 \
    vpk180-a01 \
"
