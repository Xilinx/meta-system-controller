# Override fancontrol configuration file, making this SC specific
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://versal-sysmon-milli.patch"
