require petalinux-image-common-sc.inc

IMAGE_INSTALL:append:system-controller = " \
    packagegroup-petalinux-syscontroller \
    packagegroup-petalinux-scweb \
    resize-partition \
    u-boot-tools \
    udev-extraconf \
    uboot-device-tree \
    libubootenv \
    libubootenv-bin \
    "

IMAGE_INSTALL:append:system-controller = " \
	sc-boards \
"
