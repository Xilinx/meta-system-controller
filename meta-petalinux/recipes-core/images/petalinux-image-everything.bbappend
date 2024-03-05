require petalinux-image-common-sc.inc

IMAGE_INSTALL:append:system-controller = " \
    packagegroup-petalinux-syscontroller \
    packagegroup-petalinux-scweb \
    "

IMAGE_INSTALL:append:system-controller = " \
    vck190 \
    vek280 \
    vhk158 \
    vpk120 \
    vpk180 \
"
