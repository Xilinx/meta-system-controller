# Automatically generated.  Manual changes will be lost.

ES1_PATH = "${@d.getVarFlag('ES1_PATH', d.getVar('BOARD')) or ''}"
SYS_PATH = "${@d.getVarFlag('SYS_PATH', d.getVar('BOARD')) or ''}"
ELF_PATH = "${@d.getVarFlag('ELF_PATH', d.getVar('BOARD')) or ''}"
JSON_PATH = "${@d.getVarFlag('JSON_PATH', d.getVar('BOARD')) or ''}"
JPG_PATH = "${@d.getVarFlag('JPG_PATH', d.getVar('BOARD')) or ''}"
PNG_PATH = "${@d.getVarFlag('PNG_PATH', d.getVar('BOARD')) or ''}"
JS_PATH = "${@d.getVarFlag('JS_PATH', d.getVar('BOARD')) or ''}"

# VCK190
# system_wrapper.pdi
SYS_PATH[vck190] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VCK190/system_wrapper.pdi;name=vck190-system'
SRC_URI[vck190-system.sha256sum] = '9685e5d6df4f31b1efaea0912be0420afe1f409797e5998367bb8dafdbfd7f89'

# vck190.jpg
JPG_PATH[vck190] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VCK190/vck190.jpg;name=vck190-jpg'
SRC_URI[vck190-jpg.sha256sum] = '0a50e6bbc0554b38c469e0c83925bf8e7baebcdf590364f5f29ddae2fdc12a1e'

# VCK190.json
JSON_PATH[vck190] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VCK190/VCK190.json;name=vck190-json'
SRC_URI[vck190-json.sha256sum] = 'f3d03a80a20d3417e45f046b1811489107fbab5ea22c97fd0fb4f092d110a9b1'

# VCK190_home.png
PNG_PATH[vck190] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VCK190/VCK190_home.png;name=vck190-png'
SRC_URI[vck190-png.sha256sum] = 'b781ed74f3d2f64e3c8b430271c2e671371a16abf41d3b46ebb54948a530fe0f'

# vck190_strings.js
JS_PATH[vck190] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VCK190/vck190_strings.js;name=vck190-js'
SRC_URI[vck190-js.sha256sum] = '4b34ebb91692965c111efed5ee39d1e8727089c2a5c2b0446ccdc2993d4002db'

# versal_bit.elf
ELF_PATH[vck190] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VCK190/versal_bit.elf;name=vck190-elf'
SRC_URI[vck190-elf.sha256sum] = '2c4b2e8c95b4e5c8dc51525e8eeed74c76471c1b3c6216416fac2aaf6f88a23a'

# VEK280
# es1_system_wrapper.pdi
ES1_PATH[vek280] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VEK280/es1_system_wrapper.pdi;name=vek280-es1-system'
SRC_URI[vek280-es1-system.sha256sum] = '1c2390bb0383c5af75a6f0afc6b710f153edbabed4e8aef16832929fbf9cbc22'

# system_wrapper.pdi
SYS_PATH[vek280] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VEK280/system_wrapper.pdi;name=vek280-system'
SRC_URI[vek280-system.sha256sum] = 'cffa7c42221ac2618c3cff34e9f965484e6c10ad098fa52561cc2b4536114e4d'

# vek280.jpg
JPG_PATH[vek280] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VEK280/vek280.jpg;name=vek280-jpg'
SRC_URI[vek280-jpg.sha256sum] = '2ec075cf00e15d67dfa106c785f08f47ebea50897629e29d23e27a1ed9ff3848'

# VEK280.json
JSON_PATH[vek280] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VEK280/VEK280.json;name=vek280-json'
SRC_URI[vek280-json.sha256sum] = 'e816794bed125802acfd4298833f21083600e0bb52e5ccbfe1832fbf154c4b21'

# VEK280_home.png
PNG_PATH[vek280] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VEK280/VEK280_home.png;name=vek280-png'
SRC_URI[vek280-png.sha256sum] = '9ce1208334fc5434d9bf0158aa2a525944439a1b69f4ea4796b278d4edcb7018'

# vek280_strings.js
JS_PATH[vek280] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VEK280/vek280_strings.js;name=vek280-js'
SRC_URI[vek280-js.sha256sum] = 'b4805e747c38f61f06fded1f5635f4874fd0e665136c5e5bf0918ecc5ca48da3'

# versal_bit.elf
ELF_PATH[vek280] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VEK280/versal_bit.elf;name=vek280-elf'
SRC_URI[vek280-elf.sha256sum] = 'b86bc6394e0132af6851dbf7f6b5b7cc60a169da86f8049c376e55c2628e3dde'

# VHK158
# es1_system_wrapper.pdi
ES1_PATH[vhk158] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VHK158/es1_system_wrapper.pdi;name=vhk158-es1-system'
SRC_URI[vhk158-es1-system.sha256sum] = 'bee9e6be013dd01c336a692133b7aa97c3d3e9e63070fcd37176a29aaac2ab73'

# system_wrapper.pdi
SYS_PATH[vhk158] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VHK158/system_wrapper.pdi;name=vhk158-system'
SRC_URI[vhk158-system.sha256sum] = 'f0180ba75570c9d41289200cec3bc270a52d3220a217246c0258b37f65df3e36'

# versal_bit.elf
ELF_PATH[vhk158] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VHK158/versal_bit.elf;name=vhk158-elf'
SRC_URI[vhk158-elf.sha256sum] = '148a1e920ab0d11c7880fcb0ce603ce01463ef6a2890e9eeda1e8b74a6e72be4'

# vhk158.jpg
JPG_PATH[vhk158] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VHK158/vhk158.jpg;name=vhk158-jpg'
SRC_URI[vhk158-jpg.sha256sum] = '824d9ee61a31416b75d915dbb63a27af7b095e66565ca1cf3ea8945d3fbc3e58'

# VHK158.json
JSON_PATH[vhk158] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VHK158/VHK158.json;name=vhk158-json'
SRC_URI[vhk158-json.sha256sum] = 'c739be985407b18f5f4ef8be169e7e4713b8873a0ca2a31c88992ac2f1afeb30'

# VHK158_home.png
PNG_PATH[vhk158] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VHK158/VHK158_home.png;name=vhk158-png'
SRC_URI[vhk158-png.sha256sum] = 'a7ac77696a8c659741c9c078709a94de2b2f5bfc58812d17c852187de91d0713'

# vhk158_strings.js
JS_PATH[vhk158] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VHK158/vhk158_strings.js;name=vhk158-js'
SRC_URI[vhk158-js.sha256sum] = '45392a6bdcc4f4a6bbe49388f3e7cd8432c13d01aa1a62a2003a25a04e05d196'

# VMK180
# system_wrapper.pdi
SYS_PATH[vmk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VMK180/system_wrapper.pdi;name=vmk180-system'
SRC_URI[vmk180-system.sha256sum] = '18ea2497911ffec3b9a269879233829421a8d566d9a67c94f5f05032d28a2160'

# versal_bit.elf
ELF_PATH[vmk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VMK180/versal_bit.elf;name=vmk180-elf'
SRC_URI[vmk180-elf.sha256sum] = 'fa4af72e30d8dc055b3ff22ee2f2f8c10a83d6fe0522432b0613f0d4473f2ae9'

# vmk180.jpg
JPG_PATH[vmk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VMK180/vmk180.jpg;name=vmk180-jpg'
SRC_URI[vmk180-jpg.sha256sum] = '656438c2be81c01c7da358f7266c2c4a211321deb640a4f75b43375440ef7e65'

# VMK180_home.png
PNG_PATH[vmk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VMK180/VMK180_home.png;name=vmk180-png'
SRC_URI[vmk180-png.sha256sum] = 'b781ed74f3d2f64e3c8b430271c2e671371a16abf41d3b46ebb54948a530fe0f'

# vmk180_strings.js
JS_PATH[vmk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VMK180/vmk180_strings.js;name=vmk180-js'
SRC_URI[vmk180-js.sha256sum] = '7fb78df1fd19cc866b28f5c6e4a92f98dbfb53cfe42efb76b78467e2e029ea11'

# VPK120
# es1_system_wrapper.pdi
ES1_PATH[vpk120] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK120/es1_system_wrapper.pdi;name=vpk120-es1-system'
SRC_URI[vpk120-es1-system.sha256sum] = '6972f7ad498df1512279879c2922c1612b75eea67b9ebf72165d3bb07bd1709e'

# system_wrapper.pdi
SYS_PATH[vpk120] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK120/system_wrapper.pdi;name=vpk120-system'
SRC_URI[vpk120-system.sha256sum] = 'd2d8696a6f9099bf3016c8604cb22c9d7ca0cbf9388e54a7c7a13521f87d873b'

# versal_bit.elf
ELF_PATH[vpk120] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK120/versal_bit.elf;name=vpk120-elf'
SRC_URI[vpk120-elf.sha256sum] = 'd4eda8b0f85d6aa57f4467e103cf4d11d5921336b95838f96157e2872d550304'

# vpk120.jpg
JPG_PATH[vpk120] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK120/vpk120.jpg;name=vpk120-jpg'
SRC_URI[vpk120-jpg.sha256sum] = '6c2fcfe2352bf3b7cb90de92bf6bbbcd95f06f158536307687a9e6d9813b321f'

# VPK120.json
JSON_PATH[vpk120] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK120/VPK120.json;name=vpk120-json'
SRC_URI[vpk120-json.sha256sum] = '54177f4eec9f0d17cc294f8856e8af1ca92461f1e43b1974d03aab09a0d4fea6'

# VPK120_home.png
PNG_PATH[vpk120] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK120/VPK120_home.png;name=vpk120-png'
SRC_URI[vpk120-png.sha256sum] = '4764b6ad94b50de631808309c50935719d220300dbdbdeeb1a50d52d33687c93'

# vpk120_strings.js
JS_PATH[vpk120] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK120/vpk120_strings.js;name=vpk120-js'
SRC_URI[vpk120-js.sha256sum] = '596f27a132acd8787f5ea19f7bc7774655f8dbbb6356c843a57d5f7ba6dbf965'

# VPK180
# es1_system_wrapper.pdi
ES1_PATH[vpk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK180/es1_system_wrapper.pdi;name=vpk180-es1-system'
SRC_URI[vpk180-es1-system.sha256sum] = '4604bf8fb2e054f485f19225f5afc4919f73ae8f81d36ca4908fe95f2e7e7560'

# system_wrapper.pdi
SYS_PATH[vpk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK180/system_wrapper.pdi;name=vpk180-system'
SRC_URI[vpk180-system.sha256sum] = '2e49b04cf909bc9be7427bc2a1574e312421a5dd8b9034030780582dfd87d916'

# versal_bit.elf
ELF_PATH[vpk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK180/versal_bit.elf;name=vpk180-elf'
SRC_URI[vpk180-elf.sha256sum] = '14f44abd363e74c9d5fd4d067e3b534d6650635e9fcfa33b465eb24d1e9926b5'

# vpk180.jpg
JPG_PATH[vpk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK180/vpk180.jpg;name=vpk180-jpg'
SRC_URI[vpk180-jpg.sha256sum] = '58c8c3742750f40c44e7013632c617ab8a5552e9b7d11ed521ad6dd9b947a224'

# VPK180.json
JSON_PATH[vpk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK180/VPK180.json;name=vpk180-json'
SRC_URI[vpk180-json.sha256sum] = '9568877d21d4a7e691bf5d29d3634602ca6c582289f8261acb2ac570d1302a1e'

# VPK180_home.png
PNG_PATH[vpk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK180/VPK180_home.png;name=vpk180-png'
SRC_URI[vpk180-png.sha256sum] = '9c94169377c50ebb5c68948e576ccb5e5e56cc24e3512c5d0053de2144a1cd5c'

# vpk180_strings.js
JS_PATH[vpk180] = 'https://petalinux.xilinx.com:443/petalinux/system-controller/sc_app_bsp/2023.2/2023.2_03052201/external/VPK180/vpk180_strings.js;name=vpk180-js'
SRC_URI[vpk180-js.sha256sum] = '1c1e7d3d888c8807d44d123eb1ec5914c69a2dff18c0d8690165598be59dbbf5'

