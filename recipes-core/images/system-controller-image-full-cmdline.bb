DESCRIPTION = "A full featured console-only image for System Controller."

inherit core-image

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:vck-sc-zynqmp = "${MACHINE}"
COMPATIBLE_MACHINE:eval-brd-sc-zynqmp = "${MACHINE}"

IMAGE_FEATURES += "splash ssh-server-openssh hwcodecs package-management"

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    kernel-modules \
    nfs-utils \
    nfs-utils-client \
    u-boot-tools \
    linux-xlnx-udev-rules \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    udev-extraconf \
"
