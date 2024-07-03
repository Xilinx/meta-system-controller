DESCRIPTION = "Required packages for system controller"

PACKAGE_ARCH = "${MACHINE_ARCH}"

# Need to update PR, PACKAGE_ARCH changed.
PR = "r1"

inherit packagegroup

SYSTEM_CONTROLLER_PACKAGES = " \
        python3-flask \
        python3-flask-restful \
        python3-werkzeug \
        python3-jinja2 \
        python3-markupsafe \
        python3-itsdangerous \
        python3-twisted \
        python3-gevent \
        python3-matplotlib \
        packagegroup-petalinux-lmsensors \
        i2c-tools \
        libgpiod \
        libgpiod-tools \
        system-controller-app \
        python3-loguru \
        python3-rich \
        python3-chipscopy \
        "

RDEPENDS:${PN} = "${SYSTEM_CONTROLLER_PACKAGES}"

SYSTEM_CONTROLLER_PACKAGES:append:vck-sc-zynqmp = " \
        vck190 \
        vmk180 \
        "

SYSTEM_CONTROLLER_PACKAGES:append:eval-brd-sc-zynqmp = " \
        rauc \
        rauc-service \
        rauc-mark-good \
        temp-repart \
        json-glib \
        lzo \
        libnl \
        lz4 \
        squashfs-tools \
        kernel-module-dm-bio-prison-6.1.60-xilinx-v2023.2 \
        kernel-module-dm-persistent-data-6.1.60-xilinx-v2023.2 \
        kernel-module-dm-thin-pool-6.1.60-xilinx-v2023.2 \
        "
