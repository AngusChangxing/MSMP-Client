package com.msmp.bean.cpu;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点cpu的动态信息的对象类
 * */
public class CpuDPBean implements Serializable {
    private HashMap<String,CpuDynamicBean> cpuInfos;  // CPU信息列表

    public CpuDPBean() {
    }

    public HashMap<String, CpuDynamicBean> getCpuInfos() {
        return cpuInfos;
    }

    public void setCpuInfos(HashMap<String, CpuDynamicBean> cpuInfos) {
        this.cpuInfos = cpuInfos;
    }
}
