package com.msmp.util.specific.mem;

import com.msmp.bean.mem.SwapBean;
import com.msmp.util.specific.Sources;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Swap;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 利用工厂模式获取系统数据，该对象为交换区数据的使用情况
 * 需要每次传递
 * */
public class SwapSources extends Sources {
    public SwapSources() {
    }

    @Override
    public Object getSources() {
        SwapBean swapBean = new SwapBean();

        try {
            Swap swap = sigar.getSwap();

            Long swapTotal = swap.getTotal();        // 交换区总量
            Long swapUsed = swap.getUsed();          // 当前交换区使用量
            Long swapFree = swap.getFree();          // 当前交换区剩余量

            swapBean.setSwapTotal(swapTotal);
            swapBean.setSwapUsed(swapUsed);
            swapBean.setSwapFree(swapFree);

        } catch (SigarException e) {
            e.printStackTrace();
        }


        return swapBean;
    }
}
