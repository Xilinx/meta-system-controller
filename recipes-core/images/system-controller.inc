IMAGE_FSTYPES += "wic wic.xz"
IMAGE_FSTYPES:append:system-controller-rauc-demo = " ext4"

SC_PACKAGES = " \
    packagegroup-scweb \
    raft \
    embpf-bootfw-update-tool \
    setup-board \
    sc-version-info \
    python3-image-mgmt \
    sc-board-id \
    "

