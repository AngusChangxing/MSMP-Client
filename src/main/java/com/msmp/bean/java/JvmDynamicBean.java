package com.msmp.bean.java;

import java.io.Serializable;

/**
 * @author changxin
 * @version 1.0 2018/5/6
 * @discription 用于封装服务节点中jvm中变动的动态信息的对象类
 * */
public class JvmDynamicBean implements Serializable {
    private Long jvmTotalMemory;    // JVM可以使用的总内存
    private Long jvmFreeMemory;     // JVM可以使用的剩余内存
    private Integer jvmAvailableProcessors;// JVM可以使用的处理器个数

    public JvmDynamicBean() {
    }

    public JvmDynamicBean(Long jvmTotalMemory, Long jvmFreeMemory, Integer jvmAvailableProcessors) {
        this.jvmTotalMemory = jvmTotalMemory;
        this.jvmFreeMemory = jvmFreeMemory;
        this.jvmAvailableProcessors = jvmAvailableProcessors;
    }

    public Long getJvmTotalMemory() {
        return jvmTotalMemory;
    }

    public void setJvmTotalMemory(Long jvmTotalMemory) {
        this.jvmTotalMemory = jvmTotalMemory;
    }

    public Long getJvmFreeMemory() {
        return jvmFreeMemory;
    }

    public void setJvmFreeMemory(Long jvmFreeMemory) {
        this.jvmFreeMemory = jvmFreeMemory;
    }

    public Integer getJvmAvailableProcessors() {
        return jvmAvailableProcessors;
    }

    public void setJvmAvailableProcessors(Integer jvmAvailableProcessors) {
        this.jvmAvailableProcessors = jvmAvailableProcessors;
    }
}
