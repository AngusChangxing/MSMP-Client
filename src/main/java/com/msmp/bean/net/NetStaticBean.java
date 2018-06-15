package com.msmp.bean.net;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点每个网络设备静态信息（传一次）的对象类
 * */
public class NetStaticBean implements Serializable {
    private String netNames;      // 网络设备名
    private String netAddress;    // IP地址
    private String netBroadcast;  // 网关广播地址
    private String netHwaddr;     // 网卡MAC地址
    private String netMask;       // 子网掩码
    private String netDescription;// 网卡描述信息
    private String netType;       // 网卡类型

    public NetStaticBean() {
    }

    public NetStaticBean(String netNames, String netAddress, String netBroadcast, String netHwaddr, String netMask, String netDescription, String netType) {
        this.netNames = netNames;
        this.netAddress = netAddress;
        this.netBroadcast = netBroadcast;
        this.netHwaddr = netHwaddr;
        this.netMask = netMask;
        this.netDescription = netDescription;
        this.netType = netType;
    }

    public String getNetNames() {
        return netNames;
    }

    public void setNetNames(String netNames) {
        this.netNames = netNames;
    }

    public String getNetAddress() {
        return netAddress;
    }

    public void setNetAddress(String netAddress) {
        this.netAddress = netAddress;
    }

    public String getNetBroadcast() {
        return netBroadcast;
    }

    public void setNetBroadcast(String netBroadcast) {
        this.netBroadcast = netBroadcast;
    }

    public String getNetHwaddr() {
        return netHwaddr;
    }

    public void setNetHwaddr(String netHwaddr) {
        this.netHwaddr = netHwaddr;
    }

    public String getNetMask() {
        return netMask;
    }

    public void setNetMask(String netMask) {
        this.netMask = netMask;
    }

    public String getNetDescription() {
        return netDescription;
    }

    public void setNetDescription(String netDescription) {
        this.netDescription = netDescription;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }
}
