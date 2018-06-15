package com.msmp.bean.disk;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点中每个磁盘的具体信息对象类
 * */
public class DiskPackageBean implements Serializable {
    private DiskStaticBean staticBean;
    private DiskDynamicBean dynamicBean;

    public DiskPackageBean() {
    }

    public DiskStaticBean getStaticBean() {
        return staticBean;
    }

    public void setStaticBean(DiskStaticBean staticBean) {
        this.staticBean = staticBean;
    }

    public DiskDynamicBean getDynamicBean() {
        return dynamicBean;
    }

    public void setDynamicBean(DiskDynamicBean dynamicBean) {
        this.dynamicBean = dynamicBean;
    }
}
