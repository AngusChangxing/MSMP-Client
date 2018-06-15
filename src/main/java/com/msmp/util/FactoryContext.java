package com.msmp.util;

import com.msmp.util.factory.IFactory;
import com.msmp.util.factory.computer.ComputerFactory;
import com.msmp.util.factory.cpu.CpuDynamicFactory;
import com.msmp.util.factory.cpu.CpuFactory;
import com.msmp.util.factory.disk.DiskDynamicFactory;
import com.msmp.util.factory.disk.DiskFactory;
import com.msmp.util.factory.java.JavaDynamicFactory;
import com.msmp.util.factory.java.JavaFactory;
import com.msmp.util.factory.mem.SwapFactory;
import com.msmp.util.factory.net.NetDynamicFactory;
import com.msmp.util.factory.net.NetFactory;
import com.msmp.util.factory.os.OsFactory;
import com.msmp.util.specific.Sources;
import com.msmp.config.BeanConfig;

/**
 * @author changxin
 * @version 1.0 2018/5/8
 * @discription 工厂模式管理类，用于返回最终的实际对象，对象内部由工厂创建
 * */
public class FactoryContext {

    public static Sources getter(String key) {
        IFactory factory = null;
        switch (key) {
            case BeanConfig.Computer : {
                factory = new ComputerFactory();
                break;
            }
            case BeanConfig.Cpu : {
                factory = new CpuFactory();
                break;
            }
            case BeanConfig.CpuDynamic : {
                factory = new CpuDynamicFactory();
                break;
            }
            case BeanConfig.Disk : {
                factory = new DiskFactory();
                break;
            }
            case BeanConfig.DiskDynamic : {
                factory = new DiskDynamicFactory();
                break;
            }
            case BeanConfig.Java : {
                factory = new JavaFactory();
                break;
            }
            case BeanConfig.JavaDynamic : {
                factory = new JavaDynamicFactory();
                break;
            }
            case BeanConfig.Memory : {
                factory = new ComputerFactory();
                break;
            }
            case BeanConfig.Swap : {
                factory = new SwapFactory();
                break;
            }
            case BeanConfig.Net : {
                factory = new NetFactory();
                break;
            }
            case BeanConfig.NetDynamic: {
                factory = new NetDynamicFactory();
                break;
            }
            case BeanConfig.Os: {
                factory = new OsFactory();
                break;
            }
            default: {
                return null;
            }
        }
        return factory.createSources();
    }
}
