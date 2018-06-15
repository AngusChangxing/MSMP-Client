package com.msmp.bean.mem;

import com.msmp.config.MemoryUnit;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点交换区的信息的对象类
 * */
public class SwapBean implements Serializable {
    private Long value = 1024L;
    private MemoryUnit unit = MemoryUnit.KB;

    /** 系统页面文件交换区信息 **/
    private Long swapTotal;         // 交换区总量
    private Long swapUsed;          // 当前交换区使用量
    private Long swapFree;          // 当前交换区剩余量

    public SwapBean() {
    }

    public SwapBean(MemoryUnit unit) {
        this.unit = unit;
        this.unit(unit);
    }

    public Long getSwapTotal() {
        return swapTotal;
    }

    public void setSwapTotal(Long swapTotal) {
        this.swapTotal = swapTotal / this.value;
    }

    public Long getSwapUsed() {
        return swapUsed;
    }

    public void setSwapUsed(Long swapUsed) {
        this.swapUsed = swapUsed / this.value;
    }

    public Long getSwapFree() {
        return swapFree;
    }

    public void setSwapFree(Long swapFree) {
        this.swapFree = swapFree / this.value;
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
