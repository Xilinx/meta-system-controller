MACHINEOVERRIDES =. "system-controller:"

IMAGE_FSTYPES += "wic wic.xz"

# Enable initramfs image to switch to full root file system
INITRAMFS_IMAGE ?= "petalinux-initramfs-image"
INITRAMFS_FSTYPES ?= "cpio.gz cpio.gz.u-boot tar.gz"
RAMDISK_IMAGE1 = "${INITRAMFS_IMAGE}-${MACHINE}.cpio.gz.u-boot"

# Required generic machine inclusion
require conf/machine/zynqmp-eg-generic.conf
