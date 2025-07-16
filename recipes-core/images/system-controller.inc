IMAGE_FSTYPES += "wic wic.xz"

EDF_IMAGE_ROOTFS_DIR = "${WORKDIR}/deploy-${IMAGE_BASENAME}-image-complete/${IMAGE_BASENAME}"

WICVARS:append = "\
    EDF_IMAGE_ROOTFS_DIR \
    "
WKS_FILES = "edf-disk-single-rootfs.wks"
