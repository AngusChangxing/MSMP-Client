package com.msmp.bean;

import com.msmp.bean.cpu.CpuDPBean;
import com.msmp.bean.disk.DiskDPBean;
import com.msmp.bean.java.JvmDynamicBean;
import com.msmp.bean.mem.MemoryBean;
import com.msmp.bean.mem.SwapBean;
import com.msmp.bean.net.NetDPBean;
import com.msmp.bean.os.OsUserBean;
import com.msmp.util.factory.java.JavaDynamicFactory;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/8
 * @discription 用于封装服务节点发送的动态信息的对象类
 * */
public class MsDynamicBean implements Serializable {
    private Long msId;                  //信息ID——表示发送的信息的编号，也能有效的解决网络延迟造成的信息问题
    private String msName;              //服务名称

    private CpuDPBean cpuDPBean;
    private DiskDPBean diskDPBean;
    private JvmDynamicBean jvmDynamicBean;
    private MemoryBean memoryBean;
    private SwapBean swapBean;
    private NetDPBean netDPBean;

    public MsDynamicBean() {
    }

    public MsDynamicBean(Long msId,String msName, CpuDPBean cpuDPBean, DiskDPBean diskDPBean, JvmDynamicBean jvmDynamicBean, MemoryBean memoryBean, SwapBean swapBean, NetDPBean netDPBean) {
        this.msId = msId;
        this.msName = msName;
        this.cpuDPBean = cpuDPBean;
        this.diskDPBean = diskDPBean;
        this.jvmDynamicBean = jvmDynamicBean;
        this.memoryBean = memoryBean;
        this.swapBean = swapBean;
        this.netDPBean = netDPBean;
    }

    public String getMsName() {
        return msName;
    }

    public void setMsName(String msName) {
        this.msName = msName;
    }

    public Long getMsId() {
        return msId;
    }

    public void setMsId(Long msId) {
        this.msId = msId;
    }

    public CpuDPBean getCpuDPBean() {
        return cpuDPBean;
    }

    public void setCpuDPBean(CpuDPBean cpuDPBean) {
        this.cpuDPBean = cpuDPBean;
    }

    public DiskDPBean getDiskDPBean() {
        return diskDPBean;
    }

    public void setDiskDPBean(DiskDPBean diskDPBean) {
        this.diskDPBean = diskDPBean;
    }

    public JvmDynamicBean getJvmDynamicBean() {
        return jvmDynamicBean;
    }

    public void setJvmDynamicBean(JvmDynamicBean jvmDynamicBean) {
        this.jvmDynamicBean = jvmDynamicBean;
    }

    public MemoryBean getMemoryBean() {
        return memoryBean;
    }

    public void setMemoryBean(MemoryBean memoryBean) {
        this.memoryBean = memoryBean;
    }

    public SwapBean getSwapBean() {
        return swapBean;
    }

    public void setSwapBean(SwapBean swapBean) {
        this.swapBean = swapBean;
    }

    public NetDPBean getNetDPBean() {
        return netDPBean;
    }

    public void setNetDPBean(NetDPBean netDPBean) {
        this.netDPBean = netDPBean;
    }
}
