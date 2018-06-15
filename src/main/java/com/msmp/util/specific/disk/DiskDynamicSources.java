package com.msmp.util.specific.disk;

import com.msmp.bean.disk.DiskDPBean;
import com.msmp.bean.disk.DiskDynamicBean;
import com.msmp.util.specific.Sources;
import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.SigarException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiskDynamicSources extends Sources {
    public DiskDynamicSources() {
    }

    @Override
    public Object getSources() {
        DiskDPBean bean = new DiskDPBean();
        HashMap<String, DiskDynamicBean> map = new HashMap<>();

        try {
            FileSystem[] fslist = sigar.getFileSystemList();
            for (int i = 0; i < fslist.length; i++) {
                FileSystem fs = fslist[i];
                String diskName = fs.getDevName();
                FileSystemUsage usage = sigar.getFileSystemUsage(fs.getDirName());

                DiskDynamicBean dynamicBean = new DiskDynamicBean();

                switch (fs.getType()) {
                    case 0: // TYPE_UNKNOWN ：未知
                        break;
                    case 1: // TYPE_NONE
                        break;
                    case 2: // TYPE_LOCAL_DISK : 本地硬盘
                        dynamicBean.setDiskFree(usage.getFree());   // 文件系统剩余大小
                        dynamicBean.setDiskAvail(usage.getAvail()); // 文件系统可用大小
                        dynamicBean.setDiskUsed(usage.getUsed());   // 文件系统已经使用量
                        dynamicBean.setDiskUsePercent(usage.getUsePercent() * 100D); // 文件系统资源的利用率

                        break;
                    case 3:// TYPE_NETWORK ：网络
                        break;
                    case 4:// TYPE_RAM_DISK ：闪存
                        break;
                    case 5:// TYPE_CDROM ：光驱
                        break;
                    case 6:// TYPE_SWAP ：页面交换
                        break;
                }
                dynamicBean.setDiskDiskReads(usage.getDiskReads());
                dynamicBean.setDiskDiskWrites(usage.getDiskWrites());

                map.put(diskName,dynamicBean);
            }
            bean.setDiskInfos(map);
        } catch (SigarException e) {
            e.printStackTrace();
        }

        return bean;
    }
}
