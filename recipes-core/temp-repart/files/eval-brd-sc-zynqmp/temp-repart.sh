#!/bin/sh
# Copyright (C) 2024, Advanced Micro Devices, Inc. All rights reserved.
# SPDX-License-Identifier: MIT

/bin/systemd-repart --dry-run=no --definitions=/etc/temp-repart.d
/lib/systemd/systemd-growfs /

cat /etc/fstab | grep "LABEL=data" > /dev/null
if [ $? -eq 1 ]; then
	echo "LABEL=data /data auto defaults 0 0" >> /etc/fstab
fi
mount -a
