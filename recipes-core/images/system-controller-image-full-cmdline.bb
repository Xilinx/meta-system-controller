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
    packagegroup-core-boot \
    packagegroup-petalinux-scweb \
    packagegroup-petalinux-syscontroller \
    power-advantage-tool \
    python3-pip \
    python3-psutil \
    resize-partition \
    rpm-autoload \
    u-boot-tools \
    udev-extraconf \
"

IMAGE_INSTALL:append:eval-brd-sc-zynqmp = " \
    vhk158-a01 \
    vpk120-b01 \
    vpk180-a01 \
"
