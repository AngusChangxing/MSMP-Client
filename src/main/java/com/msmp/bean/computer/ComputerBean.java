package com.msmp.bean.computer;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点计算机的基本信息的对象类
 * */
public class ComputerBean implements Serializable {
    /** 获取当前（操作系统）信息，从jvm获取 **/
    private String sysUserName;     // 用户名
    private String sysComputerName; // 计算机名
    private String sysUserDomain;   // 计算机域名
    private String sysIp;           // 本地ip地址
    private String sysHostName;     // 本地主机名
    private String fileSeparator;   // 文件分隔符
    private String pathSeparator;   // 路径分隔符
    private String lineSeparator;   // 行分隔符
    private String userName;        // 用户的账户名称
    private String userHome;        // 用户的主目录
    private String userDir;         // 用户的当前工作目录

    public ComputerBean() {
    }

    public String getSysUserName() {
        return sysUserName;
    }

    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
    }

    public String getSysComputerName() {
        return sysComputerName;
    }

    public void setSysComputerName(String sysComputerName) {
        this.sysComputerName = sysComputerName;
    }

    public String getSysUserDomain() {
        return sysUserDomain;
    }

    public void setSysUserDomain(String sysUserDomain) {
        this.sysUserDomain = sysUserDomain;
    }

    public String getSysIp() {
        return sysIp;
    }

    public void setSysIp(String sysIp) {
        this.sysIp = sysIp;
    }

    public String getSysHostName() {
        return sysHostName;
    }

    public void setSysHostName(String sysHostName) {
        this.sysHostName = sysHostName;
    }

    public String getFileSeparator() {
        return fileSeparator;
    }

    public void setFileSeparator(String fileSeparator) {
        this.fileSeparator = fileSeparator;
    }

    public String getPathSeparator() {
        return pathSeparator;
    }

    public void setPathSeparator(String pathSeparator) {
        this.pathSeparator = pathSeparator;
    }

    public String getLineSeparator() {
        return lineSeparator;
    }

    public void setLineSeparator(String lineSeparator) {
        this.lineSeparator = lineSeparator;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHome() {
        return userHome;
    }

    public void setUserHome(String userHome) {
        this.userHome = userHome;
    }

    public String getUserDir() {
        return userDir;
    }

    public void setUserDir(String userDir) {
        this.userDir = userDir;
    }
}
