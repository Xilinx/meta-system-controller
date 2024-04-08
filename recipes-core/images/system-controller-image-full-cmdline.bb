DESCRIPTION = "A full featured console-only image for System Controller."

inherit core-image

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:system-controller = "${MACHINE}"

IMAGE_FEATURES += "splash ssh-server-openssh hwcodecs package-management"

IMAGE_INSTALL = " \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    dfx-mgr \
    image-update \
    kernel-modules \
    linux-xlnx-udev-rules \
    lmsensors-fancontrol \
    lmsensors-config \
    packagegroup-core-boot \
    packagegroup-petalinux-scweb \
    packagegroup-petalinux-syscontroller \
    python3-pip \
    python3-psutil \
    u-boot-tools \
    udev-extraconf \
    uboot-device-tree \
    libubootenv \
    libubootenv-bin \
    sc-licenses-manual \
"

IMAGE_INSTALL:append:system-controller = " raft"
IMAGE_INSTALL:append:eval-brd-sc-zynqmp = " temp-repart"
IMAGE_INSTALL:append:vck-sc-zynqmp = " resize-partition"
