package com.msmp.bean.disk;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点中磁盘信息的对象类
 * */
public class DiskBean implements Serializable {

    /** 硬盘已有的分区及其详细信息 -could‘t change**/
    private String diskDevName;     // 分区的盘符名称
    private String diskTypeName;    // 文件系统类型名，比如本地硬盘、光驱、网络文件系统等
    private String diskType;        // 文件系统类型
    private Long diskTotal;         // 文件系统总大小,单位kb

    /** 硬盘已有的分区及其详细信息 单位kb -will be changes**/
    private Long diskFree;          // 文件系统剩余大小
    private Long diskAvail;         // 文件系统可用大小
    private Long diskUsed;          // 文件系统已经使用量
    private Double diskUsePercent;  // 文件系统资源的利用率 已经百分比
    private Long diskDiskReads;     // 分区的盘符读出
    private Long diskDiskWrites;    // 分区的盘符写入

    public DiskBean() {
    }

    public DiskBean(String diskDevName, String diskTypeName, String diskType, Long diskTotal, Long diskFree,
                       Long diskAvail, Long diskUsed, Double diskUsePercent, Long diskDiskReads, Long diskDiskWrites) {
        this.diskDevName = diskDevName;
        this.diskTypeName = diskTypeName;
        this.diskType = diskType;
        this.diskTotal = diskTotal;
        this.diskFree = diskFree;
        this.diskAvail = diskAvail;
        this.diskUsed = diskUsed;
        this.diskUsePercent = diskUsePercent;
        this.diskDiskReads = diskDiskReads;
        this.diskDiskWrites = diskDiskWrites;
    }

    public String getDiskDevName() {
        return diskDevName;
    }

    public void setDiskDevName(String diskDevName) {
        this.diskDevName = diskDevName;
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

    /** 由于经常会变动， 所以额外提供一个综合方法去对这个数值进行修改**/
    public void setDynamic(Long diskFree, Long diskAvail, Long diskUsed, Double diskUsePercent, Long diskDiskReads, Long diskDiskWrites) {
        this.diskFree = diskFree;
        this.diskAvail = diskAvail;
        this.diskUsed = diskUsed;
        this.diskUsePercent = diskUsePercent;
        this.diskDiskReads = diskDiskReads;
        this.diskDiskWrites = diskDiskWrites;
    }

    @Override
    public String toString() {
        return "DiskAllBean{" +
                "diskDevName='" + diskDevName + '\'' +
                ", diskTypeName='" + diskTypeName + '\'' +
                ", diskType='" + diskType + '\'' +
                ", diskTotal=" + diskTotal +
                ", diskFree=" + diskFree +
                ", diskAvail=" + diskAvail +
                ", diskUsed=" + diskUsed +
                ", diskUsePercent=" + diskUsePercent +
                ", diskDiskReads=" + diskDiskReads +
                ", diskDiskWrites=" + diskDiskWrites +
                '}';
    }
}
