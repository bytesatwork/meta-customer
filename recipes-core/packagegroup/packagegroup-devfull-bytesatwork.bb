# Copyright (C) 2014 Urs Fässler <urs.fassler@bytesatwork.ch>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "bytes at work AG collection of tools"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup
inherit allarch

RDEPENDS_${PN} = "\
	packagegroup-cli-tools \
	packagegroup-core-basic \
	packagegroup-core-ssh-openssh \
	packagegroup-core-tools-debug \
	packagegroup-core-tools-profile \
	packagegroup-devbase-bytesatwork \
	packagegroup-fonts-truetype \
	\
	apr \
	apr-util \
	bdwgc \
	boost \
	cppunit \
	dbus-wait \
	dtc \
	fbida \
	fbset \
	gnupg \
	gsl \
	keymaps \
	liba52 \
	libarchive \
	libart-lgpl \
	libbsd \
	libcgroup \
	libdaemon \
	liberation-fonts \
	libexif \
	libical \
	libid3tag \
	libidn \
	libmodbus \
	libmpc\
	librsvg \
	libsamplerate0 \
	libsoup-2.4 \
	libxslt \
	log4cxx \
	media-ctl \
	mtdev \
	portmap \
	proftpd \
	speex \
	sqlite \
	ttf-bitstream-vera \
	ttf-wqy-zenhei \
	"

