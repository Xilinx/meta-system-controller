# Copyright (C) 2024, Advanced Micro Devices, Inc. All rights reserved.
# SPDX-License-Identifier: MIT

SUMMARY = "Repartition, format, resize, edit /etc/fstab, and mount"
DESCRIPTION = "Work-around for bad systemd-repart dependencies in systemd-v251. \
This recipe is not needed anymore with systemd-v255 (scarthgap), simply remove \
and replace with regular systemd-repart. Put the config files in \
${D}${sysconfdir}/repart.d and get rid of the *service and *sh files."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS:prepend:eval-brd-sc-zynqmp := "${THISDIR}/files:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit systemd

SRC_URI:eval-brd-sc-zynqmp = " \
	file://25-rootfsA.conf \
	file://35-rootfsB.conf \
	file://45-data.conf \
	file://temp-repart.service \
	file://temp-repart.sh \
	"

do_install:eval-brd-sc-zynqmp() {
	install -d ${D}${sysconfdir}/temp-repart.d/
	install -m 0644 ${WORKDIR}/25-rootfsA.conf ${D}${sysconfdir}/temp-repart.d/
	install -m 0644 ${WORKDIR}/35-rootfsB.conf ${D}${sysconfdir}/temp-repart.d/
	install -m 0644 ${WORKDIR}/45-data.conf ${D}${sysconfdir}/temp-repart.d/

	install -d ${D}${sysconfdir}/systemd/system
	install -m 0644 ${WORKDIR}/temp-repart.service ${D}${sysconfdir}/systemd/system/

	install -d ${D}${base_bindir}
	install -m 0755 ${WORKDIR}/temp-repart.sh ${D}${base_bindir}/
}

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN}:eval-brd-sc-zynqmp = "temp-repart.service"

FILES:eval-brd-sc-zynqmp:${PN} += "${sysconfdir}/temp-repart.d/ ${sysconfdir}/systemd/system/*.service"
RDEPENDS:eval-brd-sc-zynqmp:${PN} = "e2fsprogs-mke2fs"
