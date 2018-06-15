package com.msmp.util.specific.net;

import com.msmp.bean.net.NetDPBean;
import com.msmp.bean.net.NetDynamicBean;
import com.msmp.util.specific.Sources;
import org.hyperic.sigar.NetInterfaceStat;
import org.hyperic.sigar.SigarException;

import java.util.HashMap;

public class NetDynamicSources extends Sources {
    public NetDynamicSources() {
    }

    @Override
    public Object getSources() {
        NetDPBean bean = new NetDPBean();
        HashMap<String, NetDynamicBean> map = new HashMap();
        try {
            String[] ifaces = sigar.getNetInterfaceList();
            for (int i = 0; i < ifaces.length; i++) {
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
                map.put(ifaces[i],dynamicBean);
            }
            bean.setNetInfos(map);
        } catch (SigarException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
