package com.msmp.bean.os;

import java.io.Serializable;
import java.util.List;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点操作系统的信息的对象类
 * */
public class OsBean implements Serializable {
    //操作系统内核类型
    private String osArch;          // 操作系统
    private String osCpuEndian;     // 操作系统CpuEndian
    private String osDataModel;     // 操作系统DataModel
    private String osDescription;   // 操作系统的描述
    private String osName;          // 操作系统类型
    private String osVendor;        // 操作系统的卖主
    private String osVendorCodeName;// 操作系统的卖主名称
    private String osVendorName;    // 操作系统名称
    private String osVendorVersion; // 操作系统卖主类型
    private String osVersion;       // 操作系统的版本号

    private List<OsUserBean> osUsers;// 统进程表中的用户信息

    public OsBean() {
    }

    public String getOsArch() {
        return osArch;
    }

    public void setOsArch(String osArch) {
        this.osArch = osArch;
    }

    public String getOsCpuEndian() {
        return osCpuEndian;
    }

    public void setOsCpuEndian(String osCpuEndian) {
        this.osCpuEndian = osCpuEndian;
    }

    public String getOsDataModel() {
        return osDataModel;
    }

    public void setOsDataModel(String osDataModel) {
        this.osDataModel = osDataModel;
    }

    public String getOsDescription() {
        return osDescription;
    }

    public void setOsDescription(String osDescription) {
        this.osDescription = osDescription;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVendor() {
        return osVendor;
    }

    public void setOsVendor(String osVendor) {
        this.osVendor = osVendor;
    }

    public String getOsVendorCodeName() {
        return osVendorCodeName;
    }

    public void setOsVendorCodeName(String osVendorCodeName) {
        this.osVendorCodeName = osVendorCodeName;
    }

    public String getOsVendorName() {
        return osVendorName;
    }

    public void setOsVendorName(String osVendorName) {
        this.osVendorName = osVendorName;
    }

    public String getOsVendorVersion() {
        return osVendorVersion;
    }

    public void setOsVendorVersion(String osVendorVersion) {
        this.osVendorVersion = osVendorVersion;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public List<OsUserBean> getOsUsers() {
        return osUsers;
    }

    public void setOsUsers(List<OsUserBean> osUsers) {
        this.osUsers = osUsers;
    }
}
