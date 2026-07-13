DESCRIPTION = "AMD SC packages image"
LICENSE = "MIT"

inherit core-image

require system-controller.inc

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

# We don't actually need to produce a specific image, we just want to run
# through all of the dependencies.
IMAGE_FSTYPES = ""

BOARD_PACKAGES = " \
    packagegroup-systemcontroller-boards \
    "

IMAGE_INSTALL = " ${BOARD_PACKAGES} ${SC_PACKAGES}"
