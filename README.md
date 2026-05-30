# meta-system-controller

This layer enables AMD ZynqMP and Versal system controller metadata
such as machine configuration files, boot firmware components, applications etc.

## Contributing & Maintainers

Please send any patches, comments or questions for this layer to
below mailing list with ['meta-system-controller'] in the subject:

        git_sysctrl@amd.com

When sending patches, please make sure the email subject line includes
`[meta-system-controller][<BRANCH_NAME>][PATCH]` and cc'ing the maintainers.


`git send-email --to git_sysctrl@amd.com *.patch`

> **Note:** When creating patches, please use below format. To follow best practice,
> if you have more than one patch use `--cover-letter` option while generating the
> patches. Edit the 0000-cover-letter.patch and change the title and top of the
> body as appropriate.

**Syntax:**
`git format-patch -s --subject-prefix="meta-system-controller][<BRANCH_NAME>][PATCH" -1`

**Example:**
`git format-patch -s --subject-prefix="meta-system-controller][rel-v2025.2-sc][PATCH" -1`


**Maintainers:**

	Swagath Gadde <swagath.gadde@amd.com>
	Nithish Kumar Naroju <nithishkumar.naroju@amd.com>
	Varalaxmi Bingi <varalaxmi.bingi@amd.com>
	
---
## Dependencies

This layer depends on:

	URI: https://git.yoctoproject.org/poky
	layers: meta, meta-poky
	branch: scarthgap

	URI: https://git.openembedded.org/meta-openembedded
	layers: meta-oe
	branch: scarthgap

	URI:
        https://git.yoctoproject.org/meta-xilinx (official version)
        https://github.com/Xilinx/meta-xilinx (development and AMD release)
	layers: meta-xilinx-microblaze, meta-xilinx-core
	branch: scarthgap or AMD release version (e.g. rel-v2025.2)

	URI: https://git.yoctoproject.org/meta-arm
	layers: meta-arm, meta-arm-toolchain
	branch: scarthgap
