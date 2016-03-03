DESCRIPTION = "bytepanel Linux Kernel"
SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel

require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/setup-defconfig.inc

# Pull in the devicetree files into the rootfs
RDEPENDS_kernel-base += "kernel-devicetree"

# Add a run-time dependency for the PM firmware to be installed
# on the target file system.
#RDEPENDS_kernel-base += "am33x-cm3"

RDEPENDS_kernel-base += " \
	kernel-modules \
	libgles2 \
	"

PROVIDES += "linux"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

COMPATIBLE_MACHINE = "ti33x|omap3"

S = "${WORKDIR}/git"

BRANCH = "ti-linux-3.14.y"

SRCREV = "9626278da60728f6505087f2f476a56c531784bc"
PV = "3.14.20"

# Append to the MACHINE_KERNEL_PR so that a new SRCREV will cause a rebuild
MACHINE_KERNEL_PR_append = "a+gitr${SRCPV}"
PR = "${MACHINE_KERNEL_PR}"

SRC_URI = " \
	git://git.ti.com/ti-linux-kernel/ti-linux-kernel.git;protocol=git;branch=${BRANCH} \
	file://0001-device-tree-support-for-m2-bytepanel-and-bytepanel.patch \
	file://0002-edt-ft5x06-add-property-in-device-tree-to-overwrite-.patch \
	file://0003-bytepanel-et10-add-definitions-for-EDT-10.1-display.patch \
	file://0004-bytePANEL-EDT-10.1-display-correct-muxing.patch \
	file://0005-bytePANEL-Enable-CAN.patch \
	file://defconfig \
	\
	file://0001-kernel-use-the-gnu89-standard-explicitly.patch \
	"

