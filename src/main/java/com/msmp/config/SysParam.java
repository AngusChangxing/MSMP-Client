package com.msmp.config;

/**
 * @author Angus
 * @version 1.0
 * @timw 2018/4/20
 *
 * 接口类
 * 用于提供工厂模式中需要生成对应实体的key值
 * */
public interface SysParam {

    //----java base参数----
    public final static String JAVA_HOME = "java.home";  //安装目录
    public final static String JAVA_CLASS_VERSION = "java.class.version";  //Java类格式版本号

    //----java runtime参数----
    public final static String JAVA_VERSION = "java.version";  //Java运行时环境版本
    public final static String JAVA_VENDOR = "java.vendor";  //Java运行时环境供应商
    public final static String JAVA_VENDOR_URL = "java.vendor.url";  //Java运行时环境供应商的URL
    public final static String JAVA_SPECIFICATION_VERSION = "java.specification.version";  //Java运行时环境规范版本
    public final static String JAVA_SPECIFICATION_VENDOR = "java.specification.vendor";  //Java运行时环境规范供应商
    public final static String JAVA_SPECIFICATION_NAME = "java.specification.name";  //Java运行时环境规范名称
    public final static String JAVA_LIBRARY_PATH = "java.library.path";  //Java加载库时搜索的路径列表
    public final static String JAVA_COMPILER = "java.compiler";  //Java编译器的名称


    //----java vm参数----
    public final static String JAVA_VM_SPECIFICATION_VERSION = "java.vm.specification.version";  //Java虚拟机规范版本
    public final static String JAVA_VM_SPECIFICATION_VENDOR = "java.vm.specification.vendor";  //Java虚拟机规范供应商
    public final static String JAVA_VM_SPECIFICATION_NAME = "java.vm.specification.name";  //Java虚拟机规范名称
    public final static String JAVA_VM_VERSION = "java.vm.version";  //Java虚拟机实现版本
    public final static String JAVA_VM_VENDOR = "java.vm.vendor";  //Java虚拟机实现供应商
    public final static String JAVA_VM_NAME = "java.vm.name";  //Java虚拟机实现名称




    //----计算机----
    public final static String USERNAME = "USERNAME";  //用户名
    public final static String COMPUTERNAME = "COMPUTERNAME";  //计算机名
    public final static String USERDOMAIN = "USERDOMAIN";  //获取计算机域名
    public final static String FILE_SEPARATOR = "file.separator";  //文件分隔符--系统中是“/”）
    public final static String PATH_SEPARATOR = "path.separator";  //路径分隔符--系统中是“:”）
    public final static String LINE_SEPARATOR = "line.separator";  //行分隔符--系统中是“/n”）
    public final static String USER_NAME = "user.name";  //用户的账户名称
    public final static String USER_HOME = "user.home";  //用户的主目录
    public final static String USER_DIR = "user.dir";  //用户的当前工作目录

    //----返回判定-----
    public final static String TRUE = "true";
    public final static String FALSE = "false";
}
