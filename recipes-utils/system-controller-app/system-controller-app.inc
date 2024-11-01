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
JPG_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VCK190/vck190.jpg;name=vck190-jpg'
SRC_URI[vck190-jpg.sha256sum] = '6edd9e644435783d4f7c25ba337eb5ea34ad7aa4c151b920f3ae7290505a33e4'

# VCK190.json
JSON_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VCK190/VCK190.json;name=vck190-json'
SRC_URI[vck190-json.sha256sum] = '0241ec2951608df4ad2612afced841028f8e167cda5a78e92b7ea6da6165cb4e'

# VCK190_home.png
PNG_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VCK190/VCK190_home.png;name=vck190-png'
SRC_URI[vck190-png.sha256sum] = 'b781ed74f3d2f64e3c8b430271c2e671371a16abf41d3b46ebb54948a530fe0f'

# vck190_strings.js
JS_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VCK190/vck190_strings.js;name=vck190-js'
SRC_URI[vck190-js.sha256sum] = '72c40308f0b4dc657292e4e826fb141a495aa630acc3026c75e1b17223e1ee02'

# vck190_system_wrapper.pdi
SYS_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VCK190/vck190_system_wrapper.pdi;name=vck190-system'
SRC_URI[vck190-system.sha256sum] = '9685e5d6df4f31b1efaea0912be0420afe1f409797e5998367bb8dafdbfd7f89'

# vck190_versal_bit.elf
ELF_PATH[vck190] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VCK190/vck190_versal_bit.elf;name=vck190-elf'
SRC_URI[vck190-elf.sha256sum] = '40cc14435f3220117093211a6d5400d9e941a11b3cbdd50a016d8fa6c568db41'

# VEK280
# vek280.jpg
JPG_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VEK280/vek280.jpg;name=vek280-jpg'
SRC_URI[vek280-jpg.sha256sum] = '2ec075cf00e15d67dfa106c785f08f47ebea50897629e29d23e27a1ed9ff3848'

# VEK280.json
JSON_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VEK280/VEK280.json;name=vek280-json'
SRC_URI[vek280-json.sha256sum] = '5c8e1179d1cb52c0cb0de86a28d8fc6ac71c7b6007d3a4e62a8eae02ea75f253'

# vek280_es1_system_wrapper.pdi
ES1_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VEK280/vek280_es1_system_wrapper.pdi;name=vek280-es1-system'
SRC_URI[vek280-es1-system.sha256sum] = '1c2390bb0383c5af75a6f0afc6b710f153edbabed4e8aef16832929fbf9cbc22'

# VEK280_home.png
PNG_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VEK280/VEK280_home.png;name=vek280-png'
SRC_URI[vek280-png.sha256sum] = '9ce1208334fc5434d9bf0158aa2a525944439a1b69f4ea4796b278d4edcb7018'

# vek280_strings.js
JS_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VEK280/vek280_strings.js;name=vek280-js'
SRC_URI[vek280-js.sha256sum] = '3139f5484e51cecca07f29350d3da2e418fea8a630f44c68ae841793a7907a6a'

# vek280_system_wrapper.pdi
SYS_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VEK280/vek280_system_wrapper.pdi;name=vek280-system'
SRC_URI[vek280-system.sha256sum] = 'cffa7c42221ac2618c3cff34e9f965484e6c10ad098fa52561cc2b4536114e4d'

# vek280_versal_bit.elf
ELF_PATH[vek280] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VEK280/vek280_versal_bit.elf;name=vek280-elf'
SRC_URI[vek280-elf.sha256sum] = '39943e7fea112dcb50a5655ff2319e36c549594e1686114bf0a6692fe438d5c4'

# VHK158
# vhk158.jpg
JPG_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VHK158/vhk158.jpg;name=vhk158-jpg'
SRC_URI[vhk158-jpg.sha256sum] = '824d9ee61a31416b75d915dbb63a27af7b095e66565ca1cf3ea8945d3fbc3e58'

# VHK158.json
JSON_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VHK158/VHK158.json;name=vhk158-json'
SRC_URI[vhk158-json.sha256sum] = '0f17e818498340b4c7d35cd98c4ec673e4b5ccf606f37947f7dae068a9b59d83'

# vhk158_es1_system_wrapper.pdi
ES1_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VHK158/vhk158_es1_system_wrapper.pdi;name=vhk158-es1-system'
SRC_URI[vhk158-es1-system.sha256sum] = 'bee9e6be013dd01c336a692133b7aa97c3d3e9e63070fcd37176a29aaac2ab73'

# VHK158_home.png
PNG_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VHK158/VHK158_home.png;name=vhk158-png'
SRC_URI[vhk158-png.sha256sum] = 'a7ac77696a8c659741c9c078709a94de2b2f5bfc58812d17c852187de91d0713'

# vhk158_strings.js
JS_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VHK158/vhk158_strings.js;name=vhk158-js'
SRC_URI[vhk158-js.sha256sum] = '6b8e3b3ed0985a6b80499af05349ea31939a21af597b3e402028f39749294e3e'

# vhk158_system_wrapper.pdi
SYS_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VHK158/vhk158_system_wrapper.pdi;name=vhk158-system'
SRC_URI[vhk158-system.sha256sum] = 'f0180ba75570c9d41289200cec3bc270a52d3220a217246c0258b37f65df3e36'

# vhk158_versal_bit.elf
ELF_PATH[vhk158] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VHK158/vhk158_versal_bit.elf;name=vhk158-elf'
SRC_URI[vhk158-elf.sha256sum] = 'cf7a2313e8e276ecdebb99d36bfccae1835799807c1332a62cc66c66f26a6431'

# VM-P-M1369-00
# VM-P-M1369-00.json
JSON_PATH[vm-p-m1369-00] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VM-P-M1369-00/VM-P-M1369-00.json;name=vm-p-m1369-00-json'
SRC_URI[vm-p-m1369-00-json.sha256sum] = 'af087f1cca9f5635423296c2175e0bbe6892d99145ea87f2657e80a7921eb331'

# VMK180
# vmk180.jpg
JPG_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VMK180/vmk180.jpg;name=vmk180-jpg'
SRC_URI[vmk180-jpg.sha256sum] = '1da64085afe80d403f7586c54cea343fc2b5f3a64ed082e090588494877b8568'

# VMK180.json
JSON_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VMK180/VMK180.json;name=vmk180-json'
SRC_URI[vmk180-json.sha256sum] = '15b78fd02f247d7bdd3eacf01a4a0f1f543d4e87cdcdbd674ae1d9c9465c792a'

# VMK180_home.png
PNG_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VMK180/VMK180_home.png;name=vmk180-png'
SRC_URI[vmk180-png.sha256sum] = 'b781ed74f3d2f64e3c8b430271c2e671371a16abf41d3b46ebb54948a530fe0f'

# vmk180_strings.js
JS_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VMK180/vmk180_strings.js;name=vmk180-js'
SRC_URI[vmk180-js.sha256sum] = '53e670a56367d74377784b2542718e0faadc62db8ddd2e627bbf715f3953e54b'

# vmk180_system_wrapper.pdi
SYS_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VMK180/vmk180_system_wrapper.pdi;name=vmk180-system'
SRC_URI[vmk180-system.sha256sum] = '18ea2497911ffec3b9a269879233829421a8d566d9a67c94f5f05032d28a2160'

# vmk180_versal_bit.elf
ELF_PATH[vmk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VMK180/vmk180_versal_bit.elf;name=vmk180-elf'
SRC_URI[vmk180-elf.sha256sum] = 'b28ecb6c0c4e428504c413d592d5cba00ba1aebfc2a9f4fb6b1af48e8b0a7d70'

# VPK120
# vpk120.jpg
JPG_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK120/vpk120.jpg;name=vpk120-jpg'
SRC_URI[vpk120-jpg.sha256sum] = '6c2fcfe2352bf3b7cb90de92bf6bbbcd95f06f158536307687a9e6d9813b321f'

# VPK120.json
JSON_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK120/VPK120.json;name=vpk120-json'
SRC_URI[vpk120-json.sha256sum] = '477f8643709a32194dc3420c0c688c8289e10ba482129e7d608155c7eb6c47e9'

# vpk120_es1_system_wrapper.pdi
ES1_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK120/vpk120_es1_system_wrapper.pdi;name=vpk120-es1-system'
SRC_URI[vpk120-es1-system.sha256sum] = '6972f7ad498df1512279879c2922c1612b75eea67b9ebf72165d3bb07bd1709e'

# VPK120_home.png
PNG_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK120/VPK120_home.png;name=vpk120-png'
SRC_URI[vpk120-png.sha256sum] = '4764b6ad94b50de631808309c50935719d220300dbdbdeeb1a50d52d33687c93'

# vpk120_strings.js
JS_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK120/vpk120_strings.js;name=vpk120-js'
SRC_URI[vpk120-js.sha256sum] = 'e7677943337208224a6c2785f4ea05718d22722c9c29078d88c5acdfd13bf301'

# vpk120_system_wrapper.pdi
SYS_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK120/vpk120_system_wrapper.pdi;name=vpk120-system'
SRC_URI[vpk120-system.sha256sum] = 'd2d8696a6f9099bf3016c8604cb22c9d7ca0cbf9388e54a7c7a13521f87d873b'

# vpk120_versal_bit.elf
ELF_PATH[vpk120] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK120/vpk120_versal_bit.elf;name=vpk120-elf'
SRC_URI[vpk120-elf.sha256sum] = '130bf88d1701003415e8bd0cc65eb3ece0b80e950c7cbc0f457b5af318d95f12'

# VPK180
# vpk180.jpg
JPG_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK180/vpk180.jpg;name=vpk180-jpg'
SRC_URI[vpk180-jpg.sha256sum] = '58c8c3742750f40c44e7013632c617ab8a5552e9b7d11ed521ad6dd9b947a224'

# VPK180.json
JSON_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK180/VPK180.json;name=vpk180-json'
SRC_URI[vpk180-json.sha256sum] = '5121783a4df90ad0b55a4ae13e28b483a80f9b720f41b2f50be00f9dfa01d309'

# vpk180_es1_system_wrapper.pdi
ES1_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK180/vpk180_es1_system_wrapper.pdi;name=vpk180-es1-system'
SRC_URI[vpk180-es1-system.sha256sum] = '4604bf8fb2e054f485f19225f5afc4919f73ae8f81d36ca4908fe95f2e7e7560'

# VPK180_home.png
PNG_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK180/VPK180_home.png;name=vpk180-png'
SRC_URI[vpk180-png.sha256sum] = '9c94169377c50ebb5c68948e576ccb5e5e56cc24e3512c5d0053de2144a1cd5c'

# vpk180_strings.js
JS_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK180/vpk180_strings.js;name=vpk180-js'
SRC_URI[vpk180-js.sha256sum] = 'f1798c5189cf3afc53461e3d8b0fd449a8192fe0aaeeeb027b546e4433bc04dc'

# vpk180_system_wrapper.pdi
SYS_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK180/vpk180_system_wrapper.pdi;name=vpk180-system'
SRC_URI[vpk180-system.sha256sum] = '2e49b04cf909bc9be7427bc2a1574e312421a5dd8b9034030780582dfd87d916'

# vpk180_versal_bit.elf
ELF_PATH[vpk180] = 'https://petalinux.xilinx.com/sswreleases/rel-v2024/system-controller/sc_app_bsp/2024.2/2024.2_1024241744/external/VPK180/vpk180_versal_bit.elf;name=vpk180-elf'
SRC_URI[vpk180-elf.sha256sum] = '40f403d1024055b860660ed9054e5d001a2989cb12c1f1f35dc15825c10d2587'

