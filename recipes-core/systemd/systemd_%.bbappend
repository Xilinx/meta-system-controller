PR:system-controller = "r1"

PACKAGE_ARCH:system-controller = "${MACHINE_ARCH}"

PACKAGECONFIG:append:system-controller = " repart openssl"
