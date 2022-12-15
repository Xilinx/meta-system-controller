# Override fancontrol configuration file, making this SC specific
FILESEXTRAPATHS:prepend:eval-brd-sc := "${THISDIR}/${PN}:"

PACKAGE_ARCH:eval-brd-sc = "${MACHINE_ARCH}"
