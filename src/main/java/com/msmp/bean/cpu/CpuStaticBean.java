package com.msmp.bean.cpu;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 用于封装服务节点cpu中一些不需要每次都传的数据的对象类
 * */

public class CpuStaticBean implements Serializable {
    /** CPU的总量（单位：HZ）及CPU的相关信息,有几个cpu内核就有几个该类**/
    private int cpuMHz;             // 每个CPU的总量MHz（单位：HZ）
    private String cpuVendor;       // 获得CPU的卖主，如：Intel
    private String cpuType;         // 获得CPU的类别，如：Celeron
    private Long cpuCacheSize;       // 缓冲存储器数量

    public CpuStaticBean() {
    }

    public int getCpuMHz() {
        return cpuMHz;
    }

    public void setCpuMHz(int cpuMHz) {
        this.cpuMHz = cpuMHz;
    }

    public String getCpuVendor() {
        return cpuVendor;
    }

    public void setCpuVendor(String cpuVendor) {
        this.cpuVendor = cpuVendor;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public Long getCpuCacheSize() {
        return cpuCacheSize;
    }

    public void setCpuCacheSize(Long cpuCacheSize) {
        this.cpuCacheSize = cpuCacheSize;
    }
}
