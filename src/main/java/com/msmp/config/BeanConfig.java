package com.msmp.config;

import java.util.UUID;

public interface BeanConfig {
    String Computer = "Computer";
    String Cpu = "Cpu";
    String CpuDynamic = "CpuDynamic";
    String DiskDynamic = "DiskDynamic";
    String Disk = "Disk";
    String JavaDynamic = "JavaDynamic";
    String Java = "Java";
    String Memory = "Memory";
    String Swap = "Swap";
    String NetDynamic = "NetDynamic";
    String Net = "Net";
    String Os = "Os";

    String msName = "ms" + UUID.randomUUID().toString().replaceAll("-","");
}
