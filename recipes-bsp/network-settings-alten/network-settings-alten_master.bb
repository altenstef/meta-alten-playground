SUMMARY = "Simple systemd init script for setting fixed IP"
SECTION = "base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/rc.network;md5=bcba5cf2be6d5af0bc002a9273247523"

inherit systemd

SRC_URI = "file://rc.network \
            file://network-settings-alten.service \
"

S = "${WORKDIR}/"

#increment on change to trigger rebuild.
PR="3"

#use files in this directory /subdirectory 
#(PN resolves to network-settings-alten so: ./network-settings-alten/* is searched)
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

#install the files into the rootfs at the right places
do_install () {
    echo "ls -lah ${S}" 
    ls -lah ${S}

    install -d ${D}${sbindir}
    install -d ${D}/${systemd_unitdir}/system/

    install -m 0755 ${S}/rc.network ${D}${sbindir}/
    install -m 0644 ${S}/network-settings-alten.service ${D}/${systemd_unitdir}/system/
}

#make sure the correct directories are packed to the package:
FILES_${PN}  =  "${sbindir}/*"
FILES_${PN} +=  "${systemd_unitdir}/*"

#tell SystemD to enable / ativate this service file
SYSTEMD_SERVICE_${PN} = "network-settings-alten.service"
