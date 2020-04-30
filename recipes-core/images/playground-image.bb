inherit core-image

SUMMARY = "A small image just capable of allowing a device to boot."

LICENSE = "MIT"

##########################################################################
# Adding Helloworld  application
##########################################################################
IMAGE_INSTALL_append = " helloworld"

##########################################################################
# Adding simple kernel-module
##########################################################################
IMAGE_INSTALL_append = " kernel-module"

##########################################################################
# Adding simple systemd startup script to fix the IP address
##########################################################################
IMAGE_INSTALL_append = " network-settings-alten"

#####################################################################
#                          Features
#####################################################################
IMAGE_FEATURES += "dev-pkgs"
EXTRA_IMAGE_FEATURES ?= "debug-tweaks ssh-server-openssh"
