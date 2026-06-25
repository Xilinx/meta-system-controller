SUMMARY = "AMD System Boot Image Management Tool"
DESCRIPTION = "Python helper utility that orchestrates AMD System Boot \
Image (BOOT.BIN) selection and fall-back across the primary and \
recovery boot partitions."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSES/MIT;md5=e8f57dd048e186199433be2c41bd3d6d"

COMPATIBLE_MACHINE ?= "^$"
COMPATIBLE_MACHINE:amd-cortexa53-common = "${MACHINE}"

REPO ??= "git://github.com/Xilinx/image-recovery-linux.git;protocol=https"

BRANCH ?= "main"

SRCREV ?= "7a3c141628db33f6240a80aecb4d1877aaebd8d0"

BRANCHARG = "${@['nobranch=1', 'branch=${BRANCH}'][d.getVar('BRANCH', True) != '']}"

SRC_URI = "${REPO};${BRANCHARG}"

inherit setuptools3

S = "${WORKDIR}/git"

# Python dependencies
RDEPENDS:${PN} = " \
    python3-core \
"

# Host utilities called from Python scripts
RDEPENDS:${PN} += " \
    binutils \
    mtd-utils \
    freeipmi \
    ufs-utils \
"
