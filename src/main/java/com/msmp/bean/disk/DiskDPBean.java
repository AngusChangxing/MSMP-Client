package com.msmp.bean.disk;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点中磁盘动态信息的对象类
 * 每次都发送，因为磁盘有多个，所以需要封装
 * */
public class DiskDPBean implements Serializable {
    private HashMap<String, DiskDynamicBean> diskInfos; //磁盘信息列表

    public DiskDPBean() {
    }

    public DiskDPBean(HashMap<String, DiskDynamicBean> diskInfos) {
        this.diskInfos = diskInfos;
    }

    public HashMap<String, DiskDynamicBean> getDiskInfos() {
        return diskInfos;
    }

    public void setDiskInfos(HashMap<String, DiskDynamicBean> diskInfos) {
        this.diskInfos = diskInfos;
    }
}
