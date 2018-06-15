package com.msmp.bean.disk;

import java.util.HashMap;

/**
 * @author changxin
 * @version 1.0 2018/6/15
 * @discription 用于封装服务节点中磁盘获取到的信息
 * */
public class DiskAllBean {
    private HashMap<String, DiskPackageBean> diskInfos; //磁盘信息列表

    public DiskAllBean() {
    }

    public HashMap<String, DiskPackageBean> getDiskInfos() {
        return diskInfos;
    }

    public void setDiskInfos(HashMap<String, DiskPackageBean> diskInfos) {
        this.diskInfos = diskInfos;
    }


}
