package com.msmp.util.specific.net;

import com.msmp.bean.net.NetBean;
import com.msmp.bean.net.NetDynamicBean;
import com.msmp.bean.net.NetPackageBean;
import com.msmp.bean.net.NetStaticBean;
import com.msmp.util.specific.Sources;
import org.hyperic.sigar.NetFlags;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.NetInterfaceStat;
import org.hyperic.sigar.SigarException;

import java.util.HashMap;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 利用工厂模式获取系统数据，该对象为物理内存数据的使用情况
 * 需要传输一次
 * */
public class NetSources extends Sources {
    public NetSources() {
    }

    @Override
    public Object getSources() {
        NetBean bean = new NetBean();
        HashMap<String, NetPackageBean> map = new HashMap();
        try {
            String[] ifaces = sigar.getNetInterfaceList();
            for (int i = 0; i < ifaces.length; i++) {
                NetInterfaceConfig cfg = sigar.getNetInterfaceConfig(ifaces[i]);
                if (NetFlags.LOOPBACK_ADDRESS.equals(cfg.getAddress()) || (cfg.getFlags() & NetFlags.IFF_LOOPBACK) != 0
                        || NetFlags.NULL_HWADDR.equals(cfg.getHwaddr())) {
                    continue;
                }

                String netNames = ifaces[i];                // 网络设备名
                String netAddress = cfg.getAddress();       // IP地址
                String netBroadcast = cfg.getBroadcast();   // 网关广播地址
                String netHwaddr = cfg.getHwaddr();         // 网卡MAC地址
                String netMask = cfg.getNetmask();          // 子网掩码
                String netDescription = cfg.getDescription();// 网卡描述信息
                String netType = cfg.getType();             // 网卡类型

                NetStaticBean staticBean = new NetStaticBean(netNames,netAddress,netBroadcast,netHwaddr,netMask,netDescription,netType);

                NetInterfaceStat ifstat = sigar.getNetInterfaceStat(ifaces[i]);

                Long netRxPackets = ifstat.getRxPackets();      // 接收的总包裹数
                Long netTxPackets = ifstat.getTxPackets();      // 发送的总包裹数
                Long netRxBytes = ifstat.getRxBytes();          // 接收到的总字节数
                Long netTxBytes = ifstat.getTxBytes();          // 发送的总字节数
                Long netRxErrors = ifstat.getRxErrors();        // 接收到的错误包数
                Long netTxErrors = ifstat.getTxErrors();        // 发送数据包时的错误数
                Long netRxDropped = ifstat.getRxDropped();      // 接收时丢弃的包数
                Long netTxDropped = ifstat.getTxDropped();      // 发送时丢弃的包数

                NetDynamicBean dynamicBean = new NetDynamicBean(netRxPackets,netTxPackets,netRxBytes,netTxBytes,netRxErrors,netTxErrors,netRxDropped,netTxDropped);

                NetPackageBean packageBean = new NetPackageBean();
                packageBean.setStaticBean(staticBean);
                packageBean.setDynamicBean(dynamicBean);

                map.put(ifaces[i], packageBean);
            }

            bean.setNetInfos(map);
        } catch (SigarException e) {
            e.printStackTrace();
        }

        return bean;
    }
}
