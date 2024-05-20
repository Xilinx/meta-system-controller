# Automatically generated.  Manual changes will be lost.

ES1_PATH = "${@d.getVarFlag('ES1_PATH', d.getVar('BOARD')) or ''}"
SYS_PATH = "${@d.getVarFlag('SYS_PATH', d.getVar('BOARD')) or ''}"
ELF_PATH = "${@d.getVarFlag('ELF_PATH', d.getVar('BOARD')) or ''}"
JSON_PATH = "${@d.getVarFlag('JSON_PATH', d.getVar('BOARD')) or ''}"
JPG_PATH = "${@d.getVarFlag('JPG_PATH', d.getVar('BOARD')) or ''}"
PNG_PATH = "${@d.getVarFlag('PNG_PATH', d.getVar('BOARD')) or ''}"
JS_PATH = "${@d.getVarFlag('JS_PATH', d.getVar('BOARD')) or ''}"

# VCK190
# vck190.jpg
JPG_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VCK190/vck190.jpg;name=vck190-jpg'
SRC_URI[vck190-jpg.sha256sum] = '6edd9e644435783d4f7c25ba337eb5ea34ad7aa4c151b920f3ae7290505a33e4'

# VCK190.json
JSON_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VCK190/VCK190.json;name=vck190-json'
SRC_URI[vck190-json.sha256sum] = '047f8dea8c0508a13bf7c79653ae9a9a6e24b088e49fc2aef6fb45207da1f995'

# VCK190_home.png
PNG_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VCK190/VCK190_home.png;name=vck190-png'
SRC_URI[vck190-png.sha256sum] = 'b781ed74f3d2f64e3c8b430271c2e671371a16abf41d3b46ebb54948a530fe0f'

# vck190_strings.js
JS_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VCK190/vck190_strings.js;name=vck190-js'
SRC_URI[vck190-js.sha256sum] = '72c40308f0b4dc657292e4e826fb141a495aa630acc3026c75e1b17223e1ee02'

# vck190_system_wrapper.pdi
SYS_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VCK190/vck190_system_wrapper.pdi;name=vck190-system'
SRC_URI[vck190-system.sha256sum] = '9685e5d6df4f31b1efaea0912be0420afe1f409797e5998367bb8dafdbfd7f89'

# vck190_versal_bit.elf
ELF_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VCK190/vck190_versal_bit.elf;name=vck190-elf'
SRC_URI[vck190-elf.sha256sum] = '2c4b2e8c95b4e5c8dc51525e8eeed74c76471c1b3c6216416fac2aaf6f88a23a'

# VEK280
# vek280.jpg
JPG_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VEK280/vek280.jpg;name=vek280-jpg'
SRC_URI[vek280-jpg.sha256sum] = '2ec075cf00e15d67dfa106c785f08f47ebea50897629e29d23e27a1ed9ff3848'

# VEK280.json
JSON_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VEK280/VEK280.json;name=vek280-json'
SRC_URI[vek280-json.sha256sum] = 'b7ab46caa4cc80d5b87dcc8512e29cdad28c8ace04a6b56bd606c8039749f7bb'

# vek280_es1_system_wrapper.pdi
ES1_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VEK280/vek280_es1_system_wrapper.pdi;name=vek280-es1-system'
SRC_URI[vek280-es1-system.sha256sum] = '1c2390bb0383c5af75a6f0afc6b710f153edbabed4e8aef16832929fbf9cbc22'

# VEK280_home.png
PNG_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VEK280/VEK280_home.png;name=vek280-png'
SRC_URI[vek280-png.sha256sum] = '9ce1208334fc5434d9bf0158aa2a525944439a1b69f4ea4796b278d4edcb7018'

# vek280_strings.js
JS_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VEK280/vek280_strings.js;name=vek280-js'
SRC_URI[vek280-js.sha256sum] = '3139f5484e51cecca07f29350d3da2e418fea8a630f44c68ae841793a7907a6a'

# vek280_system_wrapper.pdi
SYS_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VEK280/vek280_system_wrapper.pdi;name=vek280-system'
SRC_URI[vek280-system.sha256sum] = 'cffa7c42221ac2618c3cff34e9f965484e6c10ad098fa52561cc2b4536114e4d'

# vek280_versal_bit.elf
ELF_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VEK280/vek280_versal_bit.elf;name=vek280-elf'
SRC_URI[vek280-elf.sha256sum] = 'b86bc6394e0132af6851dbf7f6b5b7cc60a169da86f8049c376e55c2628e3dde'

# VHK158
# vhk158.jpg
JPG_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VHK158/vhk158.jpg;name=vhk158-jpg'
SRC_URI[vhk158-jpg.sha256sum] = '824d9ee61a31416b75d915dbb63a27af7b095e66565ca1cf3ea8945d3fbc3e58'

# VHK158.json
JSON_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VHK158/VHK158.json;name=vhk158-json'
SRC_URI[vhk158-json.sha256sum] = '9f5d6252b45b438a3d609f040260a8dc31cf1c1eec3238a2fbd0ec206ee7f2c5'

# vhk158_es1_system_wrapper.pdi
ES1_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VHK158/vhk158_es1_system_wrapper.pdi;name=vhk158-es1-system'
SRC_URI[vhk158-es1-system.sha256sum] = 'bee9e6be013dd01c336a692133b7aa97c3d3e9e63070fcd37176a29aaac2ab73'

# VHK158_home.png
PNG_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VHK158/VHK158_home.png;name=vhk158-png'
SRC_URI[vhk158-png.sha256sum] = 'a7ac77696a8c659741c9c078709a94de2b2f5bfc58812d17c852187de91d0713'

# vhk158_strings.js
JS_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VHK158/vhk158_strings.js;name=vhk158-js'
SRC_URI[vhk158-js.sha256sum] = '6b8e3b3ed0985a6b80499af05349ea31939a21af597b3e402028f39749294e3e'

# vhk158_system_wrapper.pdi
SYS_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VHK158/vhk158_system_wrapper.pdi;name=vhk158-system'
SRC_URI[vhk158-system.sha256sum] = 'f0180ba75570c9d41289200cec3bc270a52d3220a217246c0258b37f65df3e36'

# vhk158_versal_bit.elf
ELF_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VHK158/vhk158_versal_bit.elf;name=vhk158-elf'
SRC_URI[vhk158-elf.sha256sum] = '148a1e920ab0d11c7880fcb0ce603ce01463ef6a2890e9eeda1e8b74a6e72be4'

# VMK180
# vmk180.jpg
JPG_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VMK180/vmk180.jpg;name=vmk180-jpg'
SRC_URI[vmk180-jpg.sha256sum] = '1da64085afe80d403f7586c54cea343fc2b5f3a64ed082e090588494877b8568'

# VMK180.json
JSON_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VMK180/VMK180.json;name=vmk180-json'
SRC_URI[vmk180-json.sha256sum] = '2293dba14ec4954090f995e55c1cf5cb092194d52d24e008bd1ff7b782878a2e'

# VMK180_home.png
PNG_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VMK180/VMK180_home.png;name=vmk180-png'
SRC_URI[vmk180-png.sha256sum] = 'b781ed74f3d2f64e3c8b430271c2e671371a16abf41d3b46ebb54948a530fe0f'

# vmk180_strings.js
JS_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VMK180/vmk180_strings.js;name=vmk180-js'
SRC_URI[vmk180-js.sha256sum] = '53e670a56367d74377784b2542718e0faadc62db8ddd2e627bbf715f3953e54b'

# vmk180_system_wrapper.pdi
SYS_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VMK180/vmk180_system_wrapper.pdi;name=vmk180-system'
SRC_URI[vmk180-system.sha256sum] = '18ea2497911ffec3b9a269879233829421a8d566d9a67c94f5f05032d28a2160'

# vmk180_versal_bit.elf
ELF_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VMK180/vmk180_versal_bit.elf;name=vmk180-elf'
SRC_URI[vmk180-elf.sha256sum] = 'fa4af72e30d8dc055b3ff22ee2f2f8c10a83d6fe0522432b0613f0d4473f2ae9'

# VPK120
# vpk120.jpg
JPG_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK120/vpk120.jpg;name=vpk120-jpg'
SRC_URI[vpk120-jpg.sha256sum] = '6c2fcfe2352bf3b7cb90de92bf6bbbcd95f06f158536307687a9e6d9813b321f'

# VPK120.json
JSON_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK120/VPK120.json;name=vpk120-json'
SRC_URI[vpk120-json.sha256sum] = 'eff692a9f430b9649f5308f45243d2791600b507e33fdf3f3ce2c3187c73506b'

# vpk120_es1_system_wrapper.pdi
ES1_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK120/vpk120_es1_system_wrapper.pdi;name=vpk120-es1-system'
SRC_URI[vpk120-es1-system.sha256sum] = '6972f7ad498df1512279879c2922c1612b75eea67b9ebf72165d3bb07bd1709e'

# VPK120_home.png
PNG_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK120/VPK120_home.png;name=vpk120-png'
SRC_URI[vpk120-png.sha256sum] = '4764b6ad94b50de631808309c50935719d220300dbdbdeeb1a50d52d33687c93'

# vpk120_strings.js
JS_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK120/vpk120_strings.js;name=vpk120-js'
SRC_URI[vpk120-js.sha256sum] = 'e7677943337208224a6c2785f4ea05718d22722c9c29078d88c5acdfd13bf301'

# vpk120_system_wrapper.pdi
SYS_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK120/vpk120_system_wrapper.pdi;name=vpk120-system'
SRC_URI[vpk120-system.sha256sum] = 'd2d8696a6f9099bf3016c8604cb22c9d7ca0cbf9388e54a7c7a13521f87d873b'

# vpk120_versal_bit.elf
ELF_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK120/vpk120_versal_bit.elf;name=vpk120-elf'
SRC_URI[vpk120-elf.sha256sum] = 'd4eda8b0f85d6aa57f4467e103cf4d11d5921336b95838f96157e2872d550304'

# VPK180
# vpk180.jpg
JPG_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK180/vpk180.jpg;name=vpk180-jpg'
SRC_URI[vpk180-jpg.sha256sum] = '58c8c3742750f40c44e7013632c617ab8a5552e9b7d11ed521ad6dd9b947a224'

# VPK180.json
JSON_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK180/VPK180.json;name=vpk180-json'
SRC_URI[vpk180-json.sha256sum] = '21abca9b41f0c2a2666c3fc6168f7c67433a25203ae6f520af727f907845625a'

# vpk180_es1_system_wrapper.pdi
ES1_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK180/vpk180_es1_system_wrapper.pdi;name=vpk180-es1-system'
SRC_URI[vpk180-es1-system.sha256sum] = '4604bf8fb2e054f485f19225f5afc4919f73ae8f81d36ca4908fe95f2e7e7560'

# VPK180_home.png
PNG_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK180/VPK180_home.png;name=vpk180-png'
SRC_URI[vpk180-png.sha256sum] = '9c94169377c50ebb5c68948e576ccb5e5e56cc24e3512c5d0053de2144a1cd5c'

# vpk180_strings.js
JS_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK180/vpk180_strings.js;name=vpk180-js'
SRC_URI[vpk180-js.sha256sum] = 'f1798c5189cf3afc53461e3d8b0fd449a8192fe0aaeeeb027b546e4433bc04dc'

# vpk180_system_wrapper.pdi
SYS_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK180/vpk180_system_wrapper.pdi;name=vpk180-system'
SRC_URI[vpk180-system.sha256sum] = '2e49b04cf909bc9be7427bc2a1574e312421a5dd8b9034030780582dfd87d916'

# vpk180_versal_bit.elf
ELF_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2023/system-controller/sc_app_bsp/2023.2/2023.2_0402241323/external/VPK180/vpk180_versal_bit.elf;name=vpk180-elf'
SRC_URI[vpk180-elf.sha256sum] = '14f44abd363e74c9d5fd4d067e3b534d6650635e9fcfa33b465eb24d1e9926b5'

