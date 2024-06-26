require petalinux-image-common-sc.inc

IMAGE_INSTALL:append:system-controller = " \
    packagegroup-petalinux-syscontroller \
    packagegroup-petalinux-scweb \
    libubootenv \
    libubootenv-bin \
    mmc-utils \
    resize-partition \
    sc-boards \
    u-boot-tools \
    uboot-device-tree \
    udev-extraconf \
    "
