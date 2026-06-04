require xilinx-bootbin-version.inc

COMPATIBLE_MACHINE:eval-brd-sc-zynqmp = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-k24-sc-sdt-base = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-k26-sc-sdt-base = "${MACHINE}"

BOOTBIN_ROLLBACK_COUNTER ?= "1"
BOOTBIN_ROLLBACK_COUNTER_FILE ?= "bootbin-version-header.bin"

python do_configure:prepend:eval-brd-sc-zynqmp() {
    version = "eval-brd-sc-v" + d.getVar("BOOTBIN_VER_MAIN")
}

python do_configure:prepend:amd-edf-sc() {
    version = d.getVar("BOOTBIN_ROLLBACK_COUNTER")
}

python do_configure:append:amd-edf-sc() {
    edf_version = d.getVar('BOOTBIN_ROLLBACK_COUNTER')
    if d.getVar('SOC_FAMILY') == 'zynqmp':
       edf_version = d.getVar('MACHINE') + '-v' + d.getVar('BOOTBIN_ROLLBACK_COUNTER')
       edf_ver_f = edf_version.encode("utf-8").hex()
    else:
       edf_ver_f = int(edf_version).to_bytes(4, 'little').decode('utf-8')

    with open(d.expand("${B}/${BOOTBIN_ROLLBACK_COUNTER_FILE}"), "w") as f:
       f.write(edf_ver_f)
}

do_deploy:append:amd-edf-sc() {
     install -m 0644 ${B}/${BOOTBIN_ROLLBACK_COUNTER_FILE} ${DEPLOYDIR}/${IMAGE_NAME}.bin
     ln -s ${IMAGE_NAME}.bin ${DEPLOYDIR}/${IMAGE_LINK_NAME}.bin
}
