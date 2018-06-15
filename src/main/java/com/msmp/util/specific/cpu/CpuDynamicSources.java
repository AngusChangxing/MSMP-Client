package com.msmp.util.specific.cpu;

import com.msmp.bean.cpu.CpuDPBean;
import com.msmp.bean.cpu.CpuDynamicBean;
import com.msmp.bean.cpu.CpuPackageBean;
import com.msmp.bean.cpu.CpuStaticBean;
import com.msmp.util.specific.Sources;
import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.SigarException;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 利用工厂模式获取系统数据，该对象为cpu数据的实际操作类,返回cpu发生变化的参数数据
 * */
public class CpuDynamicSources extends Sources {

    public CpuDynamicSources() {
    }

    @Override
    public Object getSources() {
        CpuDPBean bean = new CpuDPBean();
        HashMap<String, CpuDynamicBean> cpuInfos = new HashMap<>();  // CPU信息列表
        try {
            /**查询每个cpu的数据*/
            CpuPerc[] cpuList = sigar.getCpuPercList();
            for (int i = 0; i < cpuList.length; i++) {// 不管是单块CPU还是多CPU都适用
                CpuPerc cpuPercs = cpuList[i];
                DecimalFormat df = new DecimalFormat("######0.00");

                /**查询每个cpu的动态数据*/
                CpuDynamicBean dynamicBean = new CpuDynamicBean();

                double cpuUserRatio = Double.parseDouble(df.format(cpuPercs.getUser() * 100));    // 用户使用率
                double cpuSysRatio = Double.parseDouble(df.format(cpuPercs.getSys() * 100));      //系统使用率
                double cpuWaitRatio = Double.parseDouble(df.format(cpuPercs.getWait() * 100));    // 当前等待率
                double cpuNiceRatio = Double.parseDouble(df.format(cpuPercs.getNice() * 100));    // 当前错误率
                double cpuIdleRatio = Double.parseDouble(df.format(cpuPercs.getIdle() * 100));    // 当前空闲率
                double cpuCombinedRatio = Double.parseDouble(df.format(cpuPercs.getCombined() * 100));// 总的使用率

                dynamicBean.setCpuUserRatio(cpuUserRatio);
                dynamicBean.setCpuSysRatio(cpuSysRatio);
                dynamicBean.setCpuWaitRatio(cpuWaitRatio);
                dynamicBean.setCpuNiceRatio(cpuNiceRatio);
                dynamicBean.setCpuIdleRatio(cpuIdleRatio);
                dynamicBean.setCpuCombinedRatio(cpuCombinedRatio);

                /**将package填充如list，用于加入cpubean*/
                cpuInfos.put("cpu"+(i+1),dynamicBean);
            }

            bean.setCpuInfos(cpuInfos);

        } catch (SigarException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
