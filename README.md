meta-customer
================================


Introduction
-------------------------
This is an test layer for bytes at work AG with an extenal customer layer.

This layer depends on:

	URI: https://github.com/bytesatwork/meta-bytesatwork.git
	layer: meta-bytesatwork
	branch: jethro

	URI: git://git.openembedded.org/meta-openembedded
	layers: meta-webserver
	branch: jethro



BSP
-------------------------
This meta layer extends the public meta-bytesatwork with customer support. To do so,
this layer provides the new MACHINE 'customer-machine'.

Distro/Images
-------------------------
another DISTRO is provided, named 'poky-customer'.

Reporting bugs
-------------------------
Send pull requests, patches, comments or questions to yocto@bytesatwork.ch
