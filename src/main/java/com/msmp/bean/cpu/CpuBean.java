package com.msmp.bean.cpu;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点cpu的信息的对象类
 * */
public class CpuBean implements Serializable {
    /** CPU的总量（单位：HZ）及CPU的相关信息,有几个cpu内核就有几个该类**/
    private int cpuMHz;             // 每个CPU的总量MHz（单位：HZ）
    private String cpuVendor;       // 获得CPU的卖主，如：Intel
    private Long cpuCacheSize;       // 缓冲存储器数量

    /** 每个CPU的用户使用量、系统使用剩余量、总的剩余量、总的使用占用量等（单位：100%） **/
    private double cpuUserRatio;    // 用户使用率
    private double cpuSysRatio;     // 系统使用率
    private double cpuWaitRatio;    // 当前等待率
    private double cpuNiceRatio;    // 当前错误率
    private double cpuIdleRatio;    // 当前空闲率
    private double cpuCombinedRatio;// 总的使用率

    public CpuBean() {
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

    public Long getCpuCacheSize() {
        return cpuCacheSize;
    }

    public void setCpuCacheSize(Long cpuCacheSize) {
        this.cpuCacheSize = cpuCacheSize;
    }

    public double getCpuUserRatio() {
        return cpuUserRatio;
    }

    public void setCpuUserRatio(double cpuUserRatio) {
        this.cpuUserRatio = cpuUserRatio;
    }

    public double getCpuSysRatio() {
        return cpuSysRatio;
    }

    public void setCpuSysRatio(double cpuSysRatio) {
        this.cpuSysRatio = cpuSysRatio;
    }

    public double getCpuWaitRatio() {
        return cpuWaitRatio;
    }

    public void setCpuWaitRatio(double cpuWaitRatio) {
        this.cpuWaitRatio = cpuWaitRatio;
    }

    public double getCpuNiceRatio() {
        return cpuNiceRatio;
    }

    public void setCpuNiceRatio(double cpuNiceRatio) {
        this.cpuNiceRatio = cpuNiceRatio;
    }

    public double getCpuIdleRatio() {
        return cpuIdleRatio;
    }

    public void setCpuIdleRatio(double cpuIdleRatio) {
        this.cpuIdleRatio = cpuIdleRatio;
    }

    public double getCpuCombinedRatio() {
        return cpuCombinedRatio;
    }

    public void setCpuCombinedRatio(double cpuCombinedRatio) {
        this.cpuCombinedRatio = cpuCombinedRatio;
    }

    @Override
    public String toString() {
        return "CpuBean{" +
                "cpuMHz=" + cpuMHz +
                ", cpuVendor='" + cpuVendor + '\'' +
                ", cpuCacheSize=" + cpuCacheSize +
                ", cpuUserRatio=" + cpuUserRatio +
                ", cpuSysRatio=" + cpuSysRatio +
                ", cpuWaitRatio=" + cpuWaitRatio +
                ", cpuNiceRatio=" + cpuNiceRatio +
                ", cpuIdleRatio=" + cpuIdleRatio +
                ", cpuCombinedRatio=" + cpuCombinedRatio +
                '}';
    }
}
