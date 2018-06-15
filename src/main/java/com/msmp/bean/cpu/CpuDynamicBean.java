package com.msmp.bean.cpu;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 用于封装服务节点cpu中一些需要定时传送的数据的对象类
 * */
public class CpuDynamicBean implements Serializable {

    /** 每个CPU的用户使用量、系统使用剩余量、总的剩余量、总的使用占用量等（单位：100%） **/
    private double cpuUserRatio;    // 用户使用率
    private double cpuSysRatio;     // 系统使用率
    private double cpuWaitRatio;    // 当前等待率
    private double cpuNiceRatio;    // 当前错误率
    private double cpuIdleRatio;    // 当前空闲率
    private double cpuCombinedRatio;// 总的使用率

    public CpuDynamicBean() {
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
}
