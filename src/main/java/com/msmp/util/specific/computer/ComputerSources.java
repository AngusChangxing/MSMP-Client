package com.msmp.util.specific.computer;

import com.msmp.config.SysParam;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.universal.Common;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

public class ComputerSources extends Sources {
    public ComputerSources() {
    }

    @Override
    public Object getSources() {
        Map<String, String> map = System.getenv();
        Common common = new Common();

        try {
            String sysUserName = map.get(SysParam.USERNAME);                    // 用户名
            String sysComputerName = map.get(SysParam.COMPUTERNAME);            // 计算机名
            String sysUserDomain = map.get(SysParam.USERDOMAIN);                // 计算机域名
            String sysIp = InetAddress.getLocalHost().getHostAddress();         // 本地ip地址
            String sysHostName = InetAddress.getLocalHost().getHostName();      // 本地主机名
            String fileSeparator = common.getValue(SysParam.FILE_SEPARATOR);    // 文件分隔符
            String pathSeparator = common.getValue(SysParam.PATH_SEPARATOR);    // 路径分隔符
            String lineSeparator = common.getValue(SysParam.LINE_SEPARATOR);    // 行分隔符
            String userName = common.getValue(SysParam.USER_NAME);              // 用户的账户名称
            String userHome = common.getValue(SysParam.USER_HOME);              // 用户的主目录
            String userDir = common.getValue(SysParam.USER_DIR);                // 用户的当前工作目录
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return super.getSources();
    }
}
