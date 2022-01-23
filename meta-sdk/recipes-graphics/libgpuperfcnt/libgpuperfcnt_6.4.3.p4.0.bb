DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e4098ac4459cb81b07d3f0c22b3e8370"

SRC_URI[arm-fb.md5sum] = "32f09b0b95182e97d79f19fbb9231d68"
SRC_URI[arm-fb.sha256sum] = "f27ac3cd2e08c31206156957c42fd733bbbe93aaf31b28cf3e710b9daa19e4af"

SRC_URI[arm-wayland.md5sum] = "f1603b651a2fe948aaff726e6b47a7a5"
SRC_URI[arm-wayland.sha256sum] = "3ca6d4eb33e12de5f59cfc86754ad914a41e910b10db06a6132a5e3f975f31aa"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "87163a5e983e9016c5c4811ecfc190fb"
SRC_URI[aarch64-fb.sha256sum] = "9ef818398077493551185925974fced3b81aff5bf15e77942a232557229c881e"

SRC_URI[aarch64-wayland.md5sum] = "ae56691172cf2dbfef2e558457f07a8f"
SRC_URI[aarch64-wayland.sha256sum] = "1a7226078095973d07790675c4dc98a8287c35a1ea4aee2b6ff96fc3b0dbd690"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS:${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE:imxgpu = "${MACHINE}"