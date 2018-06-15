package com.msmp.bean.java;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点java的信息的对象类
 * */
public class JavaBean implements Serializable{
    private String javaVersion;                 // Java的运行环境版本
    private String javaHome;                    // Java的安装路径
    private String javaSpecificationVersion;    // Java运行时环境规范版本
    private String javaSpecificationVender;     // Java运行时环境规范供应商
    private String javaSpecificationName;       // Java运行时环境规范名称
    private String javaClassVersion;            // Java的类格式版本号
    private String javaCompiler;                // Java编译器的名称

    private JavaBasicBean basicBean;
    private JvmStaticBean staticBean;
    private JvmDynamicBean dynamicBean;

    public JavaBean() {
    }

    public JavaBasicBean getBasicBean() {
        return basicBean;
    }

    public void setBasicBean(JavaBasicBean basicBean) {
        this.basicBean = basicBean;
    }

    public JvmStaticBean getStaticBean() {
        return staticBean;
    }

    public void setStaticBean(JvmStaticBean staticBean) {
        this.staticBean = staticBean;
    }

    public JvmDynamicBean getDynamicBean() {
        return dynamicBean;
    }

    public void setDynamicBean(JvmDynamicBean dynamicBean) {
        this.dynamicBean = dynamicBean;
    }
}
