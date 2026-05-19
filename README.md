# meta-system-controller

This layer enables AMD ZynqMP and Versal system controller metadata
such as machine configuration files, boot firmware components, applications etc.

## Contributing & Maintainers

Please submit contributions to this layer via Pull Requests on the GitHub repository:

- https://github.com/Xilinx/meta-system-controller

<!-- TODO: PR workflow details to be added after discussion -->

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
