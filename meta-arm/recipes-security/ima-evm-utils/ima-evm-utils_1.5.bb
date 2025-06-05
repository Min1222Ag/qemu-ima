DESCRIPTION = "EVM and IMA signature creation and verification utility"
HOMEPAGE = "https://github.com/linux-integrity/ima-evm-utils"
SECTION = "base"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/linux-integrity/ima-evm-utils.git;protocol=https;branch=master"

SRCREV = "dc5969360a0439d225a0df386aeb2f4ab9f0661a"

S = "${WORKDIR}/git"

DEPENDS = "openssl attr acl keyutils"

inherit autotools pkgconfig