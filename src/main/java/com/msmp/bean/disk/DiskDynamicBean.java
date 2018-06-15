package com.msmp.bean.disk;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点中每个磁盘每次都要传输（动态）的信息的对象类
 * */
public class DiskDynamicBean implements Serializable {
    /** 硬盘已有的分区及其详细信息 单位kb**/
    private Long diskFree;      // 文件系统剩余大小
    private Long diskAvail;     // 文件系统可用大小
    private Long diskUsed;      // 文件系统已经使用量
    private Double diskUsePercent;// 文件系统资源的利用率 已经百分比
    private Long diskDiskReads;   // 分区的盘符读出
    private Long diskDiskWrites;  // 分区的盘符写入

    public DiskDynamicBean() {
    }

    public Long getDiskFree() {
        return diskFree;
    }

    public void setDiskFree(Long diskFree) {
        this.diskFree = diskFree;
    }

    public Long getDiskAvail() {
        return diskAvail;
    }

    public void setDiskAvail(Long diskAvail) {
        this.diskAvail = diskAvail;
    }

    public Long getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(Long diskUsed) {
        this.diskUsed = diskUsed;
    }

    public Double getDiskUsePercent() {
        return diskUsePercent;
    }

    public void setDiskUsePercent(Double diskUsePercent) {
        this.diskUsePercent = diskUsePercent;
    }

    public Long getDiskDiskReads() {
        return diskDiskReads;
    }

    public void setDiskDiskReads(Long diskDiskReads) {
        this.diskDiskReads = diskDiskReads;
    }

    public Long getDiskDiskWrites() {
        return diskDiskWrites;
    }

    public void setDiskDiskWrites(Long diskDiskWrites) {
        this.diskDiskWrites = diskDiskWrites;
    }
}
