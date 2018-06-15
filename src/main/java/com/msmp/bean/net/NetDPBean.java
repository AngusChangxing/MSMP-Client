package com.msmp.bean.net;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点cpu的动态信息的对象类
 * */
public class NetDPBean implements Serializable {
    private HashMap<String, NetDynamicBean> netInfos;

    public NetDPBean() {
    }

    public HashMap<String, NetDynamicBean> getNetInfos() {
        return netInfos;
    }

    public void setNetInfos(HashMap<String, NetDynamicBean> netInfos) {
        this.netInfos = netInfos;
    }
}
