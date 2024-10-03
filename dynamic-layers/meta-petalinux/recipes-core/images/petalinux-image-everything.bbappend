require petalinux-image-common-sc.inc

IMAGE_INSTALL:append:system-controller = " \
    packagegroup-syscontroller \
    packagegroup-scweb \
    packagegroup-systemcontroller-boards \
    libubootenv \
    libubootenv-bin \
    mmc-utils \
    resize-partition \
    u-boot-tools \
    uboot-device-tree \
    udev-extraconf \
    "
