package com.msmp.bean;

import com.msmp.bean.computer.ComputerBean;
import com.msmp.bean.cpu.CpuBean;
import com.msmp.bean.disk.DiskBean;
import com.msmp.bean.java.JavaBean;
import com.msmp.bean.mem.MemoryBean;
import com.msmp.bean.mem.SwapBean;
import com.msmp.bean.net.NetBean;
import com.msmp.bean.os.OsBean;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 用于封装服务节点出去发送的所有信息的对象类
 * */

public class MsBaseBean implements Serializable {
    private Long msId;                  //信息ID——表示发送的信息的编号，也能有效的解决网络延迟造成的信息问题
    private String msName;              //服务名称

    private CpuBean cpuBean;            //cpuBean——用于存储cpu的所有信息
    private MemoryBean memoryBean;      //memoryBean——用于存储内存的所有信息
    private SwapBean swapBean;          //swapBean——用于存储交换区的所有信息
    private DiskBean diskBean;          //diskBean——用于存储磁盘的所有信息
    private NetBean netBean;            //netBean——用于存储网卡的所有信息
    private OsBean osBean;              //osBean——用于存储操作系统的所有信息
    private ComputerBean computerBean;  //computerBean——用于存储计算机的所有信息
    private JavaBean javaBean;          //javaBean——用于存储java的所有信息

    public MsBaseBean() {
    }

    public MsBaseBean(Long msId,String msName, CpuBean cpuBean, MemoryBean memoryBean, SwapBean swapBean, DiskBean diskBean, NetBean netBean, OsBean osBean, ComputerBean computerBean, JavaBean javaBean) {
        this.msId = msId;
        this.msName = msName;
        this.cpuBean = cpuBean;
        this.memoryBean = memoryBean;
        this.swapBean = swapBean;
        this.diskBean = diskBean;
        this.netBean = netBean;
        this.osBean = osBean;
        this.computerBean = computerBean;
        this.javaBean = javaBean;
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

    public CpuBean getCpuBean() {
        return cpuBean;
    }

    public void setCpuBean(CpuBean cpuBean) {
        this.cpuBean = cpuBean;
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

    public DiskBean getDiskBean() {
        return diskBean;
    }

    public void setDiskBean(DiskBean diskBean) {
        this.diskBean = diskBean;
    }

    public NetBean getNetBean() {
        return netBean;
    }

    public void setNetBean(NetBean netBean) {
        this.netBean = netBean;
    }

    public OsBean getOsBean() {
        return osBean;
    }

    public void setOsBean(OsBean osBean) {
        this.osBean = osBean;
    }

    public ComputerBean getComputerBean() {
        return computerBean;
    }

    public void setComputerBean(ComputerBean computerBean) {
        this.computerBean = computerBean;
    }

    public JavaBean getJavaBean() {
        return javaBean;
    }

    public void setJavaBean(JavaBean javaBean) {
        this.javaBean = javaBean;
    }
}
