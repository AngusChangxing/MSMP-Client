package com.msmp.util.specific.java;

import com.msmp.bean.java.JavaBasicBean;
import com.msmp.bean.java.JavaBean;
import com.msmp.bean.java.JvmDynamicBean;
import com.msmp.bean.java.JvmStaticBean;
import com.msmp.config.SysParam;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.universal.Common;

public class JavaSources extends Sources {
    public JavaSources() {
    }

    @Override
    public Object getSources() {
        JavaBean bean = new JavaBean();

        Common common = new Common();
        Runtime r = Runtime.getRuntime();

        String javaVersion = common.getValue(SysParam.JAVA_VERSION);                            // Java的运行环境版本
        String javaVendor = common.getValue(SysParam.JAVA_VENDOR);                              // Java的运行环境供应商
        String javaVendorUrl = common.getValue(SysParam.JAVA_VENDOR_URL);                       // Java供应商的URL
        String javaHome = common.getValue(SysParam.JAVA_HOME);                                  // Java的安装路径
        String javaSpecificationVersion = common.getValue(SysParam.JAVA_SPECIFICATION_VERSION); // Java运行时环境规范版本
        String javaSpecificationVender = common.getValue(SysParam.JAVA_SPECIFICATION_VENDOR);   // Java运行时环境规范供应商
        String javaSpecificationName = common.getValue(SysParam.JAVA_SPECIFICATION_NAME);       // Java运行时环境规范名称
        String javaClassVersion = common.getValue(SysParam.JAVA_CLASS_VERSION);                 // Java的类格式版本号
        String javaCompiler = common.getValue(SysParam.JAVA_COMPILER);                          // Java编译器的名称

        JavaBasicBean basicBean = new JavaBasicBean(javaVersion,javaVendor,javaVendorUrl,javaHome,
                javaSpecificationVersion,javaSpecificationVender,javaSpecificationName,javaClassVersion,javaCompiler);

        String javaVmSpecificationVersion = common.getValue(SysParam.JAVA_VM_SPECIFICATION_VERSION);// Java的虚拟机规范版本
        String javaVmSpecificationVendor = common.getValue(SysParam.JAVA_VM_SPECIFICATION_VENDOR);  // Java的虚拟机规范供应商
        String javaVmSpecificationName = common.getValue(SysParam.JAVA_VM_SPECIFICATION_NAME);      // Java的虚拟机规范名称
        String javaVmVersion = common.getValue(SysParam.JAVA_VM_VERSION);                           // Java的虚拟机实现版本
        String javaVmVendor = common.getValue(SysParam.JAVA_VM_VENDOR);                             // Java的虚拟机实现供应商
        String javaVmName = common.getValue(SysParam.JAVA_VM_NAME);                                 // Java的虚拟机实现名称

        JvmStaticBean staticBean = new JvmStaticBean(javaVmSpecificationVersion,javaVmSpecificationVendor,
                javaVmSpecificationName,javaVmVersion,javaVmVendor,javaVmName);

        Long jvmTotalMemory = r.totalMemory();                      // JVM可以使用的总内存
        Long jvmFreeMemory = r.freeMemory();                        // JVM可以使用的剩余内存
        Integer jvmAvailableProcessors = r.availableProcessors();   // JVM可以使用的处理器个数

        JvmDynamicBean dynamicBean = new JvmDynamicBean(jvmTotalMemory,jvmFreeMemory,jvmAvailableProcessors);

        bean.setBasicBean(basicBean);
        bean.setStaticBean(staticBean);
        bean.setDynamicBean(dynamicBean);

        return bean;
    }
}
