package com.msmp.bean.cpu;

import java.util.HashMap;

public class CpuAllBean {
    /** CPU的总量（单位：HZ）及CPU的相关信息 **/
    private int cpuSize;                    // CPU数量（单位：个）
    private HashMap<String,CpuAllBean> cpuInfos;  // CPU信息列表
}
