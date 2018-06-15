package com.msmp.util.factory.cpu;

import com.msmp.util.factory.IFactory;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.cpu.CpuSources;

/**
 * @author changxin
 * @version 1.0 2018/5/7
 * @discription 利用工厂模式获取系统数据，
 * 该类是cpu数据的工厂类，用于返回实际的工厂数据对象
 * */
public class CpuFactory implements IFactory {
    @Override
    public Sources createSources() {
        return new CpuSources();
    }
}
