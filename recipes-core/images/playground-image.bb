inherit core-image

SUMMARY = "A small image just capable of allowing a device to boot."

LICENSE = "MIT"

##########################################################################
# Adding Helloworld application
##########################################################################
IMAGE_INSTALL_append = " helloworld"
IMAGE_INSTALL_append = " kernel-module"
#####################################################################
#                          Features
#####################################################################
IMAGE_FEATURES += "dev-pkgs"


EXTRA_IMAGE_FEATURES ?= "debug-tweaks ssh-server-openssh"
