package com.msmp.util.specific.cpu;

import com.msmp.bean.cpu.CpuBean;
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
 * @discription 利用工厂模式获取系统数据，该对象为cpu数据的实际操作类,返回cpu的所有数据
 * */
public class CpuSources extends Sources{

    public CpuSources() {
    }

    @Override
    public Object getSources() {
        /**用于封装所有的cpu数据bean*/
        CpuBean bean = new CpuBean();
        HashMap<String, CpuPackageBean> cpuInfos = new HashMap<>();  // CPU信息列表

        try {
            int cpuSize = sigar.getCpuInfoList().length; // CPU数量（单位：个）

            /**查询每个cpu的数据*/
            CpuInfo infos[] = sigar.getCpuInfoList();
            CpuPerc[] cpuList = sigar.getCpuPercList();
            for (int i = 0; i < infos.length; i++) {// 不管是单块CPU还是多CPU都适用
                CpuPackageBean packageBean = new CpuPackageBean();
                CpuInfo info = infos[i];
                CpuPerc cpuPercs = cpuList[i];
                DecimalFormat df = new DecimalFormat("######0.00");

                /**查询每个cpu的基本数据*/
                CpuStaticBean staticBean = new CpuStaticBean();

                int cpuMHz = info.getMhz();             // 每个CPU的总量MHz（单位：HZ）
                String cpuVendor = info.getVendor();       // 获得CPU的卖主，如：Intel
                String cpuType = info.getModel();         // 获得CPU的类别，如：Celeron
                long cpuCacheSize = info.getCacheSize();       // 缓冲存储器数量

                staticBean.setCpuMHz(cpuMHz);
                staticBean.setCpuVendor(cpuVendor);
                staticBean.setCpuType(cpuType);
                staticBean.setCpuCacheSize(cpuCacheSize);

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

                /**向package中填充基本信息*/
                packageBean.setStaticBean(staticBean);
                packageBean.setDynamicBean(dynamicBean);

                /**将package填充如list，用于加入cpubean*/
                cpuInfos.put("cpu"+(i+1),packageBean);
            }

            bean.setCpuSize(cpuSize);
            bean.setCpuInfos(cpuInfos);

        } catch (SigarException e) {
            e.printStackTrace();
        }

        return bean;
    }

}
