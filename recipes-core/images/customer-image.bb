# Copyright (C) 2015 Urs Fässler <urs.fassler@bytesatwork.ch>
# Released under the MIT license (see COPYING.MIT for the terms)

##################################################
# ATTENTION:                                     #
# This image is for development purpose only.    #
# Please do not use in a production environment. #
##################################################


DESCRIPTION = "bytes at work AG customer image"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

IMAGE_INSTALL += "\
	packagegroup-core-boot \
	packagegroup-devbase-bytesatwork \
	"

IMAGE_LINGUAS = " "
IMAGE_FEATURES += "package-management"
DEBUG_BUILD = "1"

inherit core-image

