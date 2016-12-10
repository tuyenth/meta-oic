require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += " ssh-server-dropbear "

IMAGE_INSTALL += " packagegroup-iotivity "
IMAGE_INSTALL += " iotivity-dev "
IMAGE_INSTALL += " iotivity-example "
IMAGE_INSTALL += " os-release "
IMAGE_INSTALL += " screen "

