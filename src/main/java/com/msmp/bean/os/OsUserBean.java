package com.msmp.bean.os;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点操作系统中用户的信息的对象类
 * */
public class OsUserBean implements Serializable {
    /** 当前系统进程表中的用户信息的相关信息 **/
    private String osWhoDevice;   // 用户控制台
    private String osWhoHost;     // 用户host
    private Long osWhoTime;     // 用户time
    private String osWhoUser;     // 当前系统进程表中的用户名

    public OsUserBean() {
    }

    public String getOsWhoDevice() {
        return osWhoDevice;
    }

    public void setOsWhoDevice(String osWhoDevice) {
        this.osWhoDevice = osWhoDevice;
    }

    public String getOsWhoHost() {
        return osWhoHost;
    }

    public void setOsWhoHost(String osWhoHost) {
        this.osWhoHost = osWhoHost;
    }

    public Long getOsWhoTime() {
        return osWhoTime;
    }

    public void setOsWhoTime(Long osWhoTime) {
        this.osWhoTime = osWhoTime;
    }

    public String getOsWhoUser() {
        return osWhoUser;
    }

    public void setOsWhoUser(String osWhoUser) {
        this.osWhoUser = osWhoUser;
    }
}
