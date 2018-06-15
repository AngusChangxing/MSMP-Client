package com.msmp.annotation.type.thread;

import com.msmp.config.ParamConfig;
import com.msmp.config.SysParam;
import com.msmp.service.MsInfoService;
import com.msmp.annotation.type.http.SimpleHttpSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InitThread {
    public volatile static int flag = 0;

    @Autowired
    private SimpleHttpSend httpSend;

    @Autowired
    private MsInfoService service;

    @Autowired
    private ParamConfig config;

    public InitThread() {

    }

    public void execute(){
        new Init().start();
        new Continue().start();
    }

    //初始化线程类
    private class Init extends Thread {
        @Override
        public void run() {
            while (true) { //要定时探测，放置服务端奔溃以后一直发送数据造成系统性能下降
                try {
                    //发送Get请求,返回接口定好的结果
                    String result = httpSend.doGet(config.getServer() + "/test");
                    if (SysParam.TRUE.equals(result)) { //如果结果为true，则设定flag，因为是多线程，所以flag是volitile修饰的
                        InitThread.flag = 1;
                    }else {
                        InitThread.flag = 0;
                    }
                    System.out.println("测试接口---发送成功");
                    //设定以后，让线程睡眠一分钟，再次进行调用，因为这样可以保证数据服务端断掉以后能够不增加系统负担
                    Thread.sleep(60000);
                } catch (Exception e) {
                    try {
                        //如果出现异常，则表明get请求出现问题，比如说连接超时，那么就让系统休眠5s，然后在继续调用
                        InitThread.flag = 0;
                        System.out.println("测试接口---发送超时失败");
                        Thread.sleep(5000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    continue;
                }
            }
        }
    }

    private class Continue extends Thread {
        @Override
        public void run() {
            System.out.println(config.getServer());
            System.out.println(service.getMSInformation());
            while (true) {
                if (InitThread.flag == 1) {
                    // 1.获取数据
                    String basic = service.getMSInformation();

                    // 2.进行数据传输
                    Map<String,String> value = new HashMap<>();
                    value.put("bean",basic);

                    try {
                        httpSend.doPost(config.getServer() + "/initdata", value);
                        System.out.println("传输接口---发送成功");
                        Thread.sleep(20000); //每20s发送一次消息
                    } catch (Exception e) {
                        e.printStackTrace();
                        InitThread.flag = 0;
                        System.out.println("传输接口---发送超时失败");
                    }
                }
            }
        }
    }
}
