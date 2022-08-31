# meta-system-controller

This layer provides support for ZynqMP and Versal system controller specific configs, apps and packages.

## Maintainers, Patches/Submissions, Community

Please open pull requests for any changes.

For more details follow the OE community patch submission guidelines, as described in:

https://www.openembedded.org/wiki/Commit_Patch_Message_Guidelines
https://www.openembedded.org/wiki/How_to_submit_a_patch_to_OpenEmbedded

When creating patches, please use below format.

**Syntax:**
`git format-patch -s --subject "meta-system-controller][<release-version>][PATCH" -1`

**Example:**
`git format-patch -s --subject "meta-system-controller][rel-v2022.1][PATCH" -1`

**Maintainers:**

	Mark Hatle <mark.hatle@amd.com>
	Sandeep Gundlupet Raju <sandeep.gundlupet-raju@amd.com>
	John Toomey <john.toomey@amd.com>

## Dependencies

This layer depends on:

	URI: https://git.openembedded.org/bitbake

	URI: https://git.openembedded.org/openembedded-core
	layers: meta, meta-poky

	URI: https://git.yoctoproject.org/meta-xilinx
	layers: meta-xilinx-microblaze, meta-xilinx-bsp, meta-xilinx-core,
		meta-xilinx-pynq, meta-xilinx-contrib, meta-xilinx-standalone,
		meta-xilinx-vendor.

	URI: https://github.com/Xilinx/meta-petalinux

	branch: master or xilinx current release version (e.g. hosister)

