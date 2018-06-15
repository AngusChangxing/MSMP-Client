package com.msmp.bean.java;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点jvm的静态信息的对象类
 * */
public class JvmStaticBean implements Serializable {
    private String javaVmSpecificationVersion;  // Java的虚拟机规范版本
    private String javaVmSpecificationVendor;   // Java的虚拟机规范供应商
    private String javaVmSpecificationName;     // Java的虚拟机规范名称
    private String javaVmVersion;               // Java的虚拟机实现版本
    private String javaVmVendor;                // Java的虚拟机实现供应商
    private String javaVmName;                  // Java的虚拟机实现名称

    public JvmStaticBean() {
    }

    public JvmStaticBean(String javaVmSpecificationVersion, String javaVmSpecificationVendor, String javaVmSpecificationName, String javaVmVersion, String javaVmVendor, String javaVmName) {
        this.javaVmSpecificationVersion = javaVmSpecificationVersion;
        this.javaVmSpecificationVendor = javaVmSpecificationVendor;
        this.javaVmSpecificationName = javaVmSpecificationName;
        this.javaVmVersion = javaVmVersion;
        this.javaVmVendor = javaVmVendor;
        this.javaVmName = javaVmName;
    }

    public String getJavaVmSpecificationVersion() {
        return javaVmSpecificationVersion;
    }

    public void setJavaVmSpecificationVersion(String javaVmSpecificationVersion) {
        this.javaVmSpecificationVersion = javaVmSpecificationVersion;
    }

    public String getJavaVmSpecificationVendor() {
        return javaVmSpecificationVendor;
    }

    public void setJavaVmSpecificationVendor(String javaVmSpecificationVendor) {
        this.javaVmSpecificationVendor = javaVmSpecificationVendor;
    }

    public String getJavaVmSpecificationName() {
        return javaVmSpecificationName;
    }

    public void setJavaVmSpecificationName(String javaVmSpecificationName) {
        this.javaVmSpecificationName = javaVmSpecificationName;
    }

    public String getJavaVmVersion() {
        return javaVmVersion;
    }

    public void setJavaVmVersion(String javaVmVersion) {
        this.javaVmVersion = javaVmVersion;
    }

    public String getJavaVmVendor() {
        return javaVmVendor;
    }

    public void setJavaVmVendor(String javaVmVendor) {
        this.javaVmVendor = javaVmVendor;
    }

    public String getJavaVmName() {
        return javaVmName;
    }

    public void setJavaVmName(String javaVmName) {
        this.javaVmName = javaVmName;
    }
}
