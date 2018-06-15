package com.msmp.service;

import com.google.gson.Gson;
import com.msmp.bean.MsBaseBean;
import com.msmp.bean.MsDynamicBean;
import com.msmp.bean.computer.ComputerBean;
import com.msmp.bean.cpu.CpuBean;
import com.msmp.bean.cpu.CpuDPBean;
import com.msmp.bean.disk.DiskBean;
import com.msmp.bean.disk.DiskDPBean;
import com.msmp.bean.java.JavaBean;
import com.msmp.bean.java.JvmDynamicBean;
import com.msmp.bean.mem.MemoryBean;
import com.msmp.bean.mem.SwapBean;
import com.msmp.bean.net.NetBean;
import com.msmp.bean.net.NetDPBean;
import com.msmp.bean.os.OsBean;
import com.msmp.config.BeanConfig;
import com.msmp.config.ParamConfig;
import com.msmp.util.FactoryContext;
import com.msmp.util.factory.IFactory;
import org.hyperic.sigar.Sigar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 用于获取系统的不同信息
 * */

@Service
public class MsInfoService {
    private Gson gson = new Gson();

    @Autowired
    private ParamConfig config;

    /** 获取服务的所有信息*/
    public String getMSInformation() {
        CpuBean cpuBean = (CpuBean) FactoryContext.getter(BeanConfig.Cpu).getSources();
        MemoryBean memoryBean = (MemoryBean) FactoryContext.getter(BeanConfig.Memory).getSources();
        SwapBean swapBean = (SwapBean) FactoryContext.getter(BeanConfig.Swap).getSources();
        DiskBean diskBean = (DiskBean) FactoryContext.getter(BeanConfig.Disk).getSources();
        NetBean netBean = (NetBean) FactoryContext.getter(BeanConfig.Net).getSources();
        OsBean osBean = (OsBean) FactoryContext.getter(BeanConfig.Os).getSources();
        ComputerBean computerBean = (ComputerBean) FactoryContext.getter(BeanConfig.Computer).getSources();
        JavaBean javaBean = (JavaBean) FactoryContext.getter(BeanConfig.Java).getSources();
        Date date = new Date();

        MsBaseBean bean =
                new MsBaseBean(date.getTime(),config.getMsname(), cpuBean,memoryBean,swapBean,diskBean,netBean,osBean,computerBean,javaBean);

        return gson.toJson(bean);
    }

    /** 获取服务的会动态变化的信息*/
    public String getDynamicInformation() {
        CpuDPBean cpuDPBean = (CpuDPBean) FactoryContext.getter(BeanConfig.CpuDynamic).getSources();
        DiskDPBean diskDPBean = (DiskDPBean) FactoryContext.getter(BeanConfig.DiskDynamic).getSources();
        JvmDynamicBean jvmDynamicBean = (JvmDynamicBean) FactoryContext.getter(BeanConfig.JavaDynamic).getSources();
        MemoryBean memoryBean = (MemoryBean) FactoryContext.getter(BeanConfig.Memory).getSources();
        SwapBean swapBean = (SwapBean) FactoryContext.getter(BeanConfig.Swap).getSources();
        NetDPBean netDPBean = (NetDPBean) FactoryContext.getter(BeanConfig.NetDynamic).getSources();

        Date date = new Date();

        MsDynamicBean msDynamicBean =
                new MsDynamicBean(date.getTime(),config.getMsname(),cpuDPBean,diskDPBean,jvmDynamicBean,memoryBean,swapBean,netDPBean);

        return gson.toJson(msDynamicBean);
    }

}
