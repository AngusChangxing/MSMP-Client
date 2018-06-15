package com.msmp.bean.disk;

import com.msmp.config.MemoryUnit;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点中每个磁盘静态信息的对象类
 * */
public class DiskStaticBean implements Serializable {

    /** 硬盘已有的分区及其详细信息 **/
    private String diskDevName;   // 分区的盘符名称
    private String diskDirName;   // 分区的盘符路径
    private Long diskFlags;     // 分区的盘符标志
    private String diskSysTypeName;// 文件系统类型，比如 FAT32、NTFS
    private String diskTypeName;  // 文件系统类型名，比如本地硬盘、光驱、网络文件系统等
    private String diskType;      // 文件系统类型
    private Long diskTotal;     // 文件系统总大小,单位kb

    public DiskStaticBean() {
    }

    public String getDiskDevName() {
        return diskDevName;
    }

    public void setDiskDevName(String diskDevName) {
        this.diskDevName = diskDevName;
    }

    public String getDiskDirName() {
        return diskDirName;
    }

    public void setDiskDirName(String diskDirName) {
        this.diskDirName = diskDirName;
    }

    public Long getDiskFlags() {
        return diskFlags;
    }

    public void setDiskFlags(Long diskFlags) {
        this.diskFlags = diskFlags;
    }

    public String getDiskSysTypeName() {
        return diskSysTypeName;
    }

    public void setDiskSysTypeName(String diskSysTypeName) {
        this.diskSysTypeName = diskSysTypeName;
    }

    public String getDiskTypeName() {
        return diskTypeName;
    }

    public void setDiskTypeName(String diskTypeName) {
        this.diskTypeName = diskTypeName;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public Long getDiskTotal() {
        return diskTotal;
    }

    public void setDiskTotal(Long diskTotal) {
        this.diskTotal = diskTotal;
    }
}
