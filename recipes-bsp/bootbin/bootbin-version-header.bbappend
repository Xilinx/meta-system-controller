require xilinx-bootbin-version.inc

COMPATIBLE_MACHINE:eval-brd-sc-zynqmp = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-k24-sc-sdt-base = "${MACHINE}"
COMPATIBLE_MACHINE:zynqmp-k26-sc-sdt-base = "${MACHINE}"

python do_configure:prepend:eval-brd-sc-zynqmp() {
    version = "eval-brd-sc-v" + d.getVar("BOOTBIN_VER_MAIN")
}

python do_configure:prepend:zynqmp-k24-sc-sdt-base() {
    version = "k24-sc-sdt-base-v" + d.getVar("BOOTBIN_VER_MAIN")
}

python do_configure:prepend:zynqmp-k26-sc-sdt-base() {
    version = "k26-sc-sdt-base-v" + d.getVar("BOOTBIN_VER_MAIN")
}

BOOTBIN_VER_MAX_LEN:zynqmp-k24-sc-sdt-base = "40"
BOOTBIN_VER_MAX_LEN:zynqmp-k26-sc-sdt-base = "40"
