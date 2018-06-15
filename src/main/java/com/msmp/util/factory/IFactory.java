package com.msmp.util.factory;

import com.msmp.util.specific.Sources;

/**
 * @author changxin
 * @version 1.0 2018/5/7
 * @discription 利用工厂模式获取系统数据，
 * 该接口是所有数据工厂中的接口类
 * */
public interface IFactory {

    /**
     * @type 创建实际执行工厂的接口
     * @function 用于提供给访问接口所需要的实际操作类
     * @return Sources 一个公共父类，可以根据实际情况，返回不同的数据实体
     * */
    Sources createSources();
}
