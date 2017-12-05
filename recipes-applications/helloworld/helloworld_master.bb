DESCRIPTION = "Hello world Demo Application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2855a9370700a7f2ee184e33f172a30a"

#Obtain automatic revision
SRCREV = "${AUTOREV}" 

#URL where to obtain the sources from (BPN resolves to: helloworld, PV resolves to master)
SRC_URI = "git://github.com/altenstef/${BPN}.git;branch=${PV};protocol=https"

SRC_URI[md5sum] = "2e81798a8ef3f713398a8a764718fd4a"
SRC_URI[sha256sum] = "788124a49e734a7dd979ad82ca68d74caf0658d52d51e04b49cd73b4897c5398"

#Set workdir for git projects
S = "${WORKDIR}/git"

#simple compile to helloworld binary
do_compile() {
         ${CC} main.c -o helloworld ${LDFLAGS}
}

#install in bindir on target
do_install() {
         install -d ${D}${bindir}
         install -m 0755 helloworld ${D}${bindir}
}
