# Patch Guide: IMA + TEE Hook

## Files
- `0001-Apply-IMA-and-TEE-hook.patch`

## Steps
1. Clone meta-arm repository:
   git clone git@github.com:Min1222Ag/qemu-ima.git

2. Copy patch:
   cp 0001-*.patch meta-arm/meta-arm/recipes-kernel/linux/files/

3. Edit .bbappend:
   meta-arm/meta-arm/recipes-kernel/linux/linux-yocto_6.1.bbappend
   Add:
     FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
     SRC_URI += "file://0001-Apply-IMA-and-TEE-hook.patch"

4. Rebuild:
   bitbake virtual/kernel
