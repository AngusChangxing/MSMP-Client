package com.msmp.bean.mem;

import com.msmp.config.MemoryUnit;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点内存的信息的对象类
 * */
public class MemoryBean implements Serializable {
    private Long value = 1024L;
    private MemoryUnit unit = MemoryUnit.KB;

    /** 物理内存的相关信息 **/
    private Long memTotal;          // 内存总量
    private Long memUsed;           // 当前内存使用量
    private Long memFree;           // 当前内存剩余量

    public MemoryBean() {
    }

    public MemoryBean(MemoryUnit unit) {
        this.unit = unit;
        this.unit(unit);
    }

    public Long getMemTotal() {
        return memTotal;
    }

    public void setMemTotal(Long memTotal) {
        this.memTotal = memTotal / this.value;
    }

    public Long getMemUsed() {
        return memUsed;
    }

    public void setMemUsed(Long memUsed) {
        this.memUsed = memUsed / this.value;
    }

    public Long getMemFree() {
        return memFree;
    }

    public void setMemFree(Long memFree) {
        this.memFree = memFree / this.value;
    }

    private void unit(MemoryUnit unit) {
        switch (unit) {
            case B: {
                this.value = 1L;
                break;
            }
            case KB: {
                this.value = (long)(1<<10);
                break;
            }
            case MB: {
                this.value = (long)(1<<20);
                break;
            }
            case GB: {
                this.value = (long)(1<<30);
                break;
            }
            case TB: {
                this.value = (long)(1<<40);
                break;
            }
            case PB: {
                this.value = (long)(1<<50);
                break;
            }
            case EB: {
                this.value = (long)(1<<60);
                break;
            }
            default: {
                this.value = 1024L;
                this.unit = MemoryUnit.KB;
                break;
            }
        }
    }
}
