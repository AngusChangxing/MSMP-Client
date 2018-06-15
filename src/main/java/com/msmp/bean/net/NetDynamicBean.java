package com.msmp.bean.net;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点每个网络设备动态信息（每次都传）的对象类
 * */
public class NetDynamicBean implements Serializable {
    /** 获取网络流量等信息 **/
    private Long netRxPackets;    // 接收的总包裹数
    private Long netTxPackets;    // 发送的总包裹数
    private Long netRxBytes;      // 接收到的总字节数
    private Long netTxBytes;      // 发送的总字节数
    private Long netRxErrors;     // 接收到的错误包数
    private Long netTxErrors;     // 发送数据包时的错误数
    private Long netRxDropped;    // 接收时丢弃的包数
    private Long netTxDropped;    // 发送时丢弃的包数

    public NetDynamicBean() {
    }

    public NetDynamicBean(Long netRxPackets, Long netTxPackets, Long netRxBytes, Long netTxBytes, Long netRxErrors, Long netTxErrors, Long netRxDropped, Long netTxDropped) {
        this.netRxPackets = netRxPackets;
        this.netTxPackets = netTxPackets;
        this.netRxBytes = netRxBytes;
        this.netTxBytes = netTxBytes;
        this.netRxErrors = netRxErrors;
        this.netTxErrors = netTxErrors;
        this.netRxDropped = netRxDropped;
        this.netTxDropped = netTxDropped;
    }

    public Long getNetRxPackets() {
        return netRxPackets;
    }

    public void setNetRxPackets(Long netRxPackets) {
        this.netRxPackets = netRxPackets;
    }

    public Long getNetTxPackets() {
        return netTxPackets;
    }

    public void setNetTxPackets(Long netTxPackets) {
        this.netTxPackets = netTxPackets;
    }

    public Long getNetRxBytes() {
        return netRxBytes;
    }

    public void setNetRxBytes(Long netRxBytes) {
        this.netRxBytes = netRxBytes;
    }

    public Long getNetTxBytes() {
        return netTxBytes;
    }

    public void setNetTxBytes(Long netTxBytes) {
        this.netTxBytes = netTxBytes;
    }

    public Long getNetRxErrors() {
        return netRxErrors;
    }

    public void setNetRxErrors(Long netRxErrors) {
        this.netRxErrors = netRxErrors;
    }

    public Long getNetTxErrors() {
        return netTxErrors;
    }

    public void setNetTxErrors(Long netTxErrors) {
        this.netTxErrors = netTxErrors;
    }

    public Long getNetRxDropped() {
        return netRxDropped;
    }

    public void setNetRxDropped(Long netRxDropped) {
        this.netRxDropped = netRxDropped;
    }

    public Long getNetTxDropped() {
        return netTxDropped;
    }

    public void setNetTxDropped(Long netTxDropped) {
        this.netTxDropped = netTxDropped;
    }
}
