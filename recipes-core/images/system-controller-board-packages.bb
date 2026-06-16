DESCRIPTION = "AMD SC packages image"
LICENSE = "MIT"

inherit core-image

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

# We don't actually need to produce a specific image, we just want to run
# through all of the dependencies.
IMAGE_FSTYPES = ""

SC_PACKAGES_INSTALL = " \
    packagegroup-systemcontroller-boards \
    packagegroup-scweb \
    labtool-jtag-support \
    raft \
    pmtool \
    embpf-bootfw-update-tool \
    "

IMAGE_INSTALL = " ${SC_PACKAGES_INSTALL}"
