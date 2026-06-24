DESCRIPTION = "AMD SC packages image"
LICENSE = "MIT"

inherit core-image

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

# We don't actually need to produce a specific image, we just want to run
# through all of the dependencies.
IMAGE_FSTYPES = ""

BOARD_PACKAGES = " \
    packagegroup-systemcontroller-boards \
    "

SC_PACKAGES = " \
    packagegroup-scweb \
    labtool-jtag-support \
    raft \
    pmtool \
    embpf-bootfw-update-tool \
    setup-board \
    sc-version-info \
    python3-image-mgmt \
    "

IMAGE_INSTALL = " ${BOARD_PACKAGES} ${SC_PACKAGES}"
