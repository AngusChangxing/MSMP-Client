package com.msmp.util.specific.os;

import com.msmp.bean.os.OsBean;
import com.msmp.bean.os.OsUserBean;
import com.msmp.util.specific.Sources;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Who;

import java.util.ArrayList;
import java.util.List;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 利用工厂模式获取系统数据，该对象为操作系统数据操作类
 * */
public class OsSources extends Sources {
    public OsSources() {
    }

    @Override
    public Object getSources() {
        OsBean bean = new OsBean();

        OperatingSystem OS = OperatingSystem.getInstance();
        //操作系统内核类型
        String osArch = OS.getArch();                       // 操作系统
        String osCpuEndian = OS.getCpuEndian();             // 操作系统CpuEndian
        String osDataModel = OS.getDataModel();             // 操作系统DataModel
        String osDescription = OS.getDescription();         // 操作系统的描述
        String osName = OS.getName();                       // 操作系统类型
        String osVendor = OS.getVendor();                   // 操作系统的卖主
        String osVendorCodeName = OS.getVendorCodeName();   // 操作系统的卖主名称
        String osVendorName = OS.getVendorName();           // 操作系统名称
        String osVendorVersion = OS.getVendorVersion();     // 操作系统卖主类型
        String osVersion = OS.getVersion();                 // 操作系统的版本号

        bean.setOsArch(osArch);
        bean.setOsCpuEndian(osCpuEndian);
        bean.setOsDataModel(osDataModel);
        bean.setOsDescription(osDescription);
        bean.setOsName(osName);
        bean.setOsVendor(osVendor);
        bean.setOsVendorCodeName(osVendorCodeName);
        bean.setOsVendorName(osVendorName);
        bean.setOsVendorVersion(osVendorVersion);
        bean.setOsVersion(osVersion);

        List<OsUserBean> osUsers = new ArrayList<>();// 统进程表中的用户信息

        // 取当前系统进程表中的用户信息
        try {
            Who who[] = sigar.getWhoList();
            if (who != null && who.length > 0) {
                for (int i = 0; i < who.length; i++) {
                    OsUserBean userBean = new OsUserBean();
                    Who info = who[i];

                    String osWhoDevice = info.getDevice();   // 用户控制台
                    String osWhoHost = info.getHost();     // 用户host
                    Long osWhoTime = info.getTime();     // 用户time
                    String osWhoUser = info.getUser();     // 当前系统进程表中的用户名

                    userBean.setOsWhoDevice(osWhoDevice);
                    userBean.setOsWhoHost(osWhoHost);
                    userBean.setOsWhoTime(osWhoTime);
                    userBean.setOsWhoUser(osWhoUser);

                    osUsers.add(userBean);
                }
            }

        } catch (SigarException e) {
            e.printStackTrace();
        }

        bean.setOsUsers(osUsers);

        return bean;
    }

}
