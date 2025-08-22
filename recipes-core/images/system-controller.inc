IMAGE_FSTYPES += "wic wic.xz"

WKS_FILES = "system-controller-nobootpartition.wks"

UBOOT_BOOT_SCRIPT = "u-boot-edf-sc-scr"

ROOTFS_POSTPROCESS_COMMAND += "create_boot_symlink;"

create_boot_symlink () {
    ln -sf bootsc.scr ${IMAGE_ROOTFS}/boot/boot.scr
}
