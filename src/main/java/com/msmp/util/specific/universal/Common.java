package com.msmp.util.specific.universal;

import com.msmp.util.specific.Sources;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 利用工厂模式获取系统数据，该对象为通用系统数据的实际操作类，通过properties获取资源
 * */
public class Common {
    private Properties properties = System.getProperties();

    public Common() {
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
