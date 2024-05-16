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
    libubootenv \
    libubootenv-bin \
    linux-xlnx-udev-rules \
    lmsensors-config \
    lmsensors-fancontrol \
    packagegroup-core-boot \
    packagegroup-petalinux-scweb \
    packagegroup-petalinux-syscontroller \
    python3-pip \
    python3-psutil \
    raft \
    sc-licenses-manual \
    u-boot-tools \
    uboot-device-tree \
"

IMAGE_INSTALL:append:eval-brd-sc-zynqmp = " temp-repart"
IMAGE_INSTALL:append:vck-sc-zynqmp = " resize-partition"
