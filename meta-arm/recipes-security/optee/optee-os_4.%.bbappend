# Include Trusted Services Secure Partitions
require recipes-security/optee/optee-os-ts.inc

# Conditionally include platform specific Trusted Services related OPTEE build parameters
EXTRA_OEMAKE:append:qemuarm64-secureboot = "${@oe.utils.conditional('SP_PATHS', '', '', ' CFG_CORE_HEAP_SIZE=131072 CFG_TEE_BENCHMARK=n CFG_TEE_CORE_LOG_LEVEL=4 CFG_CORE_SEL1_SPMC=y ', d)}"

#CAN ID TA를 위한 추가
SRC_URI += "file://0001-Add-CAN-ID-TA.patch"

do_install:append() {
    install -m 444 ${B}/ta/can_id/*.ta ${D}${nonarch_base_libdir}/optee_armtz || true
}