package com.msmp.util.specific.mem;

import com.msmp.bean.mem.MemoryBean;
import com.msmp.util.specific.Sources;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.SigarException;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 利用工厂模式获取系统数据，该对象为物理内存数据的使用情况
 * 需要每次传递
 * */
public class MemorySources extends Sources {

    public MemorySources() {
    }

    @Override
    public Object getSources() {
        MemoryBean memoryBean = new MemoryBean();
        // 物理内存信息
        try {
            Mem mem = sigar.getMem();

            Long memTotal = mem.getTotal();          // 内存总量
            Long memUsed = mem.getUsed();           // 当前内存使用量
            Long memFree = mem.getFree();           // 当前内存剩余量

            memoryBean.setMemTotal(memTotal);
            memoryBean.setMemUsed(memUsed);
            memoryBean.setMemFree(memFree);

        } catch (SigarException e) {
            e.printStackTrace();
        }

        return memoryBean;
    }
}
