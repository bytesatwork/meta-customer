# Copyright (C) 2016 Daniel Ammann <daniel.ammann@bytesatwork.ch>
# Released under the MIT license (see COPYING.MIT for the terms)

COMPATIBLE_MACHINE += "|customer-machine"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-ti-staging:"

SRC_URI += " \
	file://0011-ARM-dts-bytepanel-et10-adjust-timing-and-enable-lvds.patch \
	file://0012-Input-ft5x0x-import-FocalTech-ft5x0x-touch-screen-dr.patch \
	file://0013-bytepanel-enable-ft5x0x-driver-in-defconfig-and-dts.patch \
"
