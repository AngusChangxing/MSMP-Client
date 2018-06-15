package com.msmp.util.specific.disk;

import com.msmp.bean.disk.DiskBean;
import com.msmp.bean.disk.DiskDynamicBean;
import com.msmp.bean.disk.DiskPackageBean;
import com.msmp.bean.disk.DiskStaticBean;
import com.msmp.util.specific.Sources;
import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.SigarException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiskSources extends Sources {
    public DiskSources() {
    }

    @Override
    public Object getSources() {
        DiskBean bean = new DiskBean();
        HashMap<String, DiskPackageBean> packages = new HashMap<>();

        try {
            FileSystem fslist[] = sigar.getFileSystemList();

            for (int i = 0; i < fslist.length; i++) {
                FileSystem fs = fslist[i];

                DiskPackageBean packageBean = new DiskPackageBean();
                DiskStaticBean staticBean = new DiskStaticBean();
                DiskDynamicBean dynamicBean = new DiskDynamicBean();

                staticBean.setDiskDevName(fs.getDevName());     //分区的盘符名称
                staticBean.setDiskDirName(fs.getDirName());     //盘符路径
                staticBean.setDiskFlags(fs.getFlags());         //盘符标志
                staticBean.setDiskSysTypeName(fs.getSysTypeName());//盘符类型
                staticBean.setDiskTypeName(fs.getTypeName());   //文件系统类型名


                FileSystemUsage usage = sigar.getFileSystemUsage(fs.getDirName());
                switch (fs.getType()) {
                    case 0: // TYPE_UNKNOWN ：未知
                        staticBean.setDiskType("unknow");
                        break;
                    case 1: // TYPE_NONE
                        staticBean.setDiskType("NONE");
                        break;
                    case 2: // TYPE_LOCAL_DISK : 本地硬盘
                        staticBean.setDiskType("本地硬盘");
                        staticBean.setDiskTotal(usage.getTotal());  // 文件系统总大小

                        dynamicBean.setDiskFree(usage.getFree());   // 文件系统剩余大小
                        dynamicBean.setDiskAvail(usage.getAvail()); // 文件系统可用大小
                        dynamicBean.setDiskUsed(usage.getUsed());   // 文件系统已经使用量
                        dynamicBean.setDiskUsePercent(usage.getUsePercent() * 100D); // 文件系统资源的利用率

                        break;
                    case 3:// TYPE_NETWORK ：网络
                        staticBean.setDiskType("网络");
                        break;
                    case 4:// TYPE_RAM_DISK ：闪存
                        staticBean.setDiskType("闪存");
                        break;
                    case 5:// TYPE_CDROM ：光驱
                        staticBean.setDiskType("光驱");
                        break;
                    case 6:// TYPE_SWAP ：页面交换
                        staticBean.setDiskType("页面交换");
                        break;
                }
                dynamicBean.setDiskDiskReads(usage.getDiskReads());
                dynamicBean.setDiskDiskWrites(usage.getDiskWrites());

                packageBean.setStaticBean(staticBean);
                packageBean.setDynamicBean(dynamicBean);

                packages.put(fs.getDevName(),packageBean);
            }
            bean.setDiskInfos(packages);
        } catch (SigarException e) {
            e.printStackTrace();
        }


        return bean;
    }
}
