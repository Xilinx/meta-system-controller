DESCRIPTION = "A full featured RPM's for System Controller."

require system-controller-image-full-cmdline.bb

# We don't actually need to produce a specific image, we just want to run
# through all of the dependencies.
IMAGE_FSTYPES = ""

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

IMAGE_INSTALL += " packagegroup-systemcontroller-boards"
