package com.msmp.bean.net;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点每个网络设备传输的的对象类
 * */
public class NetPackageBean implements Serializable {
    private NetStaticBean staticBean;
    private NetDynamicBean dynamicBean;

    public NetPackageBean() {
    }

    public NetPackageBean(NetStaticBean staticBean, NetDynamicBean dynamicBean) {
        this.staticBean = staticBean;
        this.dynamicBean = dynamicBean;
    }

    public NetStaticBean getStaticBean() {
        return staticBean;
    }

    public void setStaticBean(NetStaticBean staticBean) {
        this.staticBean = staticBean;
    }

    public NetDynamicBean getDynamicBean() {
        return dynamicBean;
    }

    public void setDynamicBean(NetDynamicBean dynamicBean) {
        this.dynamicBean = dynamicBean;
    }
}
