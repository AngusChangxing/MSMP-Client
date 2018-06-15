package com.msmp.bean.cpu;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点中每个cpu的信息的对象类
 * */
public class CpuPackageBean implements Serializable {
    private CpuStaticBean staticBean;
    private CpuDynamicBean dynamicBean;

    public CpuPackageBean() {
    }

    public CpuPackageBean(CpuStaticBean staticBean, CpuDynamicBean dynamicBean) {
        this.staticBean = staticBean;
        this.dynamicBean = dynamicBean;
    }

    public CpuStaticBean getStaticBean() {
        return staticBean;
    }

    public void setStaticBean(CpuStaticBean staticBean) {
        this.staticBean = staticBean;
    }

    public CpuDynamicBean getDynamicBean() {
        return dynamicBean;
    }

    public void setDynamicBean(CpuDynamicBean dynamicBean) {
        this.dynamicBean = dynamicBean;
    }
}
