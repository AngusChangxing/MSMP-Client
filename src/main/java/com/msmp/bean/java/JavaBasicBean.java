package com.msmp.bean.java;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点java的基本信息的对象类
 * */
public class JavaBasicBean implements Serializable {
    private String javaVersion;     // Java的运行环境版本
    private String javaVendor;      // Java的运行环境供应商
    private String javaVendorUrl;   // Java供应商的URL
    private String javaHome;        // Java的安装路径
    private String javaSpecificationVersion;// Java运行时环境规范版本
    private String javaSpecificationVender; // Java运行时环境规范供应商
    private String javaSpecificationName;   // Java运行时环境规范名称
    private String javaClassVersion;        // Java的类格式版本号
    private String javaCompiler;    // Java编译器的名称

    public JavaBasicBean() {
    }

    public JavaBasicBean(String javaVersion, String javaVendor, String javaVendorUrl, String javaHome, String javaSpecificationVersion, String javaSpecificationVender, String javaSpecificationName, String javaClassVersion,  String javaCompiler) {
        this.javaVersion = javaVersion;
        this.javaVendor = javaVendor;
        this.javaVendorUrl = javaVendorUrl;
        this.javaHome = javaHome;
        this.javaSpecificationVersion = javaSpecificationVersion;
        this.javaSpecificationVender = javaSpecificationVender;
        this.javaSpecificationName = javaSpecificationName;
        this.javaClassVersion = javaClassVersion;
        this.javaCompiler = javaCompiler;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getJavaVendor() {
        return javaVendor;
    }

    public void setJavaVendor(String javaVendor) {
        this.javaVendor = javaVendor;
    }

    public String getJavaVendorUrl() {
        return javaVendorUrl;
    }

    public void setJavaVendorUrl(String javaVendorUrl) {
        this.javaVendorUrl = javaVendorUrl;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    public String getJavaSpecificationVersion() {
        return javaSpecificationVersion;
    }

    public void setJavaSpecificationVersion(String javaSpecificationVersion) {
        this.javaSpecificationVersion = javaSpecificationVersion;
    }

    public String getJavaSpecificationVender() {
        return javaSpecificationVender;
    }

    public void setJavaSpecificationVender(String javaSpecificationVender) {
        this.javaSpecificationVender = javaSpecificationVender;
    }

    public String getJavaSpecificationName() {
        return javaSpecificationName;
    }

    public void setJavaSpecificationName(String javaSpecificationName) {
        this.javaSpecificationName = javaSpecificationName;
    }

    public String getJavaClassVersion() {
        return javaClassVersion;
    }

    public void setJavaClassVersion(String javaClassVersion) {
        this.javaClassVersion = javaClassVersion;
    }

    public String getJavaCompiler() {
        return javaCompiler;
    }

    public void setJavaCompiler(String javaCompiler) {
        this.javaCompiler = javaCompiler;
    }
}
