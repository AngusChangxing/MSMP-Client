package com.msmp.bean.net;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点网络设备信息的对象类
 * */
public class NetBean implements Serializable {
    private HashMap<String, NetPackageBean> netInfos;

    public NetBean() {
    }

    public HashMap<String, NetPackageBean> getNetInfos() {
        return netInfos;
    }

    public void setNetInfos(HashMap<String, NetPackageBean> netInfos) {
        this.netInfos = netInfos;
    }
}
