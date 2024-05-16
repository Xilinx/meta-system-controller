inherit features_check
REQUIRED_DISTRO_FEATURES:eval-brd-sc-zynqmp += "rauc"

require ${@bb.utils.contains('MACHINE', 'eval-brd-sc-zynqmp', 'recipes-kernel/linux/linux-yocto_rauc.inc', '', d)}
