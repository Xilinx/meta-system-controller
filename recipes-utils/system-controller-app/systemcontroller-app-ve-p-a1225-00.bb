SUMMARY = "System Controller App - VE-P-A1225-00 board specific files"

LICENSE = "Proprietary & MIT"
LIC_FILES_CHKSUM:append = " file://${WORKDIR}/LICENSE_BINARIES.md;md5=fef5c700acd3d5fa08c24279a8126704"

SRC_URI = "https://edf.amd.com/sswreleases/rel-v2025.2/system-controller/sc_app_bsp/2025.2/2025.2_202603241741/internal/systemcontroller-app-ve-p-a1225-00.tar.gz"
SRC_URI[sha256sum] = "f13bb44bc41424ec93ca5bd3b6736e29ec5f6f0fc39b83595ce0ef5112441b04"

BOARD = "ve-p-a1225-00"

require recipes-utils/system-controller-app/system-controller-app.inc
