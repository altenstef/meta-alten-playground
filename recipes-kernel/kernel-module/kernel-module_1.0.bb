SUMMARY = "Dummy simple kernel module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://github.com/altenstef/kernel-module.git;branch=${PV};protocol=https"

SRCREV="${AUTOREV}"

S = "${WORKDIR}/git"