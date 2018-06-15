package com.msmp.util.specific;

import com.msmp.config.SigarConfig;
import com.msmp.util.specific.universal.Common;
import org.hyperic.sigar.Sigar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 利用工厂模式获取系统数据，该对象为实际操作类的接口类，并且可以获取普通的系统资源
 * */
@Component
public class Sources {
    private String key = null;
    protected Sigar sigar = SigarConfig.sigar;

    public Sources() {
    }

    public Object getSources() {
        return null;
    }
}
