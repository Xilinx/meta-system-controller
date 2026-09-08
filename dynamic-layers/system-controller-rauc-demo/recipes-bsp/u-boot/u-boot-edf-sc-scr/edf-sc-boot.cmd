# rauc updates for u-boot boot script
setenv kernelname /boot/Image
setenv distro_bootpart 1

echo "devtype: ${devtype}"
echo "devnum: ${devnum}"
echo "distro_bootpart: ${distro_bootpart}"

test -n "${BOOT_ORDER}" || env set BOOT_ORDER "A B"
test -n "${BOOT_A_LEFT}" || env set BOOT_A_LEFT 3
test -n "${BOOT_B_LEFT}" || env set BOOT_B_LEFT 3
test -n "${RAUC_BOOTDEV}" || env set RAUC_BOOTDEV "${devtype} ${devnum}:${distro_partnum}"

env set RAUC_BOOTPART
env set RAUC_SLOT

echo "BOOT_ORDER: ${BOOT_ORDER}"
for RAUC_BOOTSLOT in "${BOOT_ORDER}"; do
  if test "x${RAUC_BOOTPART}" != "x"; then
    # skip remaining slots
  elif test "x${RAUC_BOOTSLOT}" = "xA"; then
    if test ${BOOT_A_LEFT} -gt 0; then
      echo "using RAUC slot A"
      setexpr BOOT_A_LEFT ${BOOT_A_LEFT} - 1
      env set RAUC_BOOTPART "PARTLABEL=rootfsA"
      env set RAUC_SLOT "A"
      env set RAUC_BOOTDEV "${devtype} ${devnum}:${distro_bootpart}"
      echo "RAUC_BOOTDEV: ${RAUC_BOOTDEV}"
    fi
  elif test "x${RAUC_BOOTSLOT}" = "xB"; then
    if test ${BOOT_B_LEFT} -gt 0; then
      echo "using RAUC slot B"
      setexpr BOOT_B_LEFT ${BOOT_B_LEFT} - 1
      env set RAUC_BOOTPART "PARTLABEL=rootfsB"
      env set RAUC_SLOT "B"
      setexpr BOOTPART1 ${distro_bootpart} + 1
      env set RAUC_BOOTDEV "${devtype} ${devnum}:${BOOTPART1}"
      echo "RAUC_BOOTDEV: ${RAUC_BOOTDEV}"
    fi
  fi
done

if test -n "${RAUC_BOOTPART}"; then
  fdt addr ${fdtcontroladdr}

  # Select the carrier EEPROM topology before Linux I2C enumeration.
  i2c dev 1
  if i2c md 0x72 0 1; then
    arb_present=1
  else
    arb_present=0
  fi

  if test "${arb_present}" = "1"; then
    echo "SC: PCA9541 arbitrator present - removing direct carrier eeprom@54"
    if fdt get value _cc /axi/i2c@ff030000/eeprom@54 compatible; then
      fdt rm /axi/i2c@ff030000/eeprom@54
    fi
  else
    echo "SC: PCA9541 arbitrator absent - removing arbitrated carrier eeprom@54"
    if fdt get value _arb /axi/i2c@ff030000/i2c-arbitrator@72/i2c-arb/eeprom@54 compatible; then
      fdt rm /axi/i2c@ff030000/i2c-arbitrator@72/i2c-arb/eeprom@54
    fi
  fi

  fdt get value bootargs /chosen bootargs
  env set bootargs "${bootargs} ro rootwait uio_pdrv_genirq.of_id=generic-uio root=${RAUC_BOOTPART} rauc.slot=${RAUC_SLOT}"
  env save
else
  echo "No valid RAUC slot found. Resetting tries to 3"
  env set BOOT_A_LEFT 3
  env set BOOT_B_LEFT 3
  env save
  reset
fi

ext4load ${RAUC_BOOTDEV} ${kernel_addr_r} ${kernelname}
booti ${kernel_addr_r} - ${fdtcontroladdr}
