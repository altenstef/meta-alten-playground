inherit core-image

SUMMARY = "A small image just capable of allowing a device to boot."

LICENSE = "MIT"

##########################################################################
# Adding Helloworld application
##########################################################################
IMAGE_INSTALL_append = "helloworld"

#####################################################################
#                          Features
#####################################################################
IMAGE_FEATURES += "dev-pkgs"



