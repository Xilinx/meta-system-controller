DESCRIPTION = "A full featured RPM's for System Controller."

inherit core-image

# We don't actually need to produce a specific image, we just want to run
# through all of the dependencies.
IMAGE_FSTYPES = ""

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

IMAGE_INSTALL = " \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    dfx-mgr \
    image-update \
    kernel-modules \
    libubootenv \
    libubootenv-bin \
    linux-xlnx-udev-rules \
    lmsensors-config-sc-fancontrol \
    packagegroup-core-boot \
    packagegroup-scweb \
    packagegroup-syscontroller \
    python3-pip \
    python3-psutil \
    python3-frugy \
    raft \
    repart-resize \
    systemcontroller-licenses-manual \
    u-boot-tools \
    ser2net \
    picocom \
    coreutils \
    embpf-bootfw-update-tool \
    ${UBOOT_BOOT_SCRIPT} \
    systemd-conf-sc \
    lmsensors-config-sc-libsensors \
    libubootenv-sc \
    vim-common \
    setup-board \
    packagegroup-systemcontroller-boards \
"
