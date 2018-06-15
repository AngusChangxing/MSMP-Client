package com.msmp.util.specific.java;

import com.msmp.bean.java.JvmDynamicBean;
import com.msmp.util.specific.Sources;

public class JavaDynamicSources extends Sources {
    public JavaDynamicSources() {
    }

    @Override
    public Object getSources() {
        Runtime r = Runtime.getRuntime();

        Long jvmTotalMemory = r.totalMemory();                      // JVM可以使用的总内存
        Long jvmFreeMemory = r.freeMemory();                        // JVM可以使用的剩余内存
        Integer jvmAvailableProcessors = r.availableProcessors();   // JVM可以使用的处理器个数

        JvmDynamicBean dynamicBean = new JvmDynamicBean(jvmTotalMemory,jvmFreeMemory,jvmAvailableProcessors);

        return dynamicBean;
    }
}
