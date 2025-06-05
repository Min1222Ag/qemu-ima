require recipes-security/optee/optee-examples.inc

SRCREV = "378dc0db2d5dd279f58a3b6cb3f78ffd6b165035"

SRC_URI += "git://github.com/linaro-swg/optee_examples.git;branch=master;protocol=https \
           git://github.com/linaro-swg/optee_examples.git;branch=master;protocol=https \
           git://github.com/linaro-swg/optee_examples.git;branch=master;protocol=https \
           git://github.com/linaro-swg/optee_examples.git;branch=master;protocol=https \
           file://0001-Add-can_id_ta-example.patch \
           file://0001-update-TA-UUID.patch \
           file://0001-fit-UUID-structure.patch \
           file://0001-re-struct-TA-UUID.patch \
           "
