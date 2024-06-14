dirs755:append:eval-brd-sc-zynqmp = " /data"

do_install:append:system-controller() {
    echo "************************************************************************" >> "${D}${sysconfdir}/motd"
    echo "*** NOTE: Configure System Settings 'sudo /usr/bin/system_config.sh' ***" >> "${D}${sysconfdir}/motd"
    echo "************************************************************************" >> "${D}${sysconfdir}/motd"
}
