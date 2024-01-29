require xilinx-bootbin-version.inc

COMPATIBLE_MACHINE:eval-brd-sc-zynqmp = "${MACHINE}"

python do_configure:prepend:eval-brd-sc-zynqmp() {
    version = "SC-BootFW-" + d.getVar("BOOTBIN_VER_MAIN")
}
