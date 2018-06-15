package com.msmp.controller;

import com.msmp.service.MsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changxin
 * @version 1.0 2018/5/5
 * @discription 用于接收服务端发送来获取信息的请求
 * */

@RestController
public class AcceptController {

    @Autowired
    private MsInfoService service;

    /**
     * @function 用于接收微服务系统中，服务的所有信息，用于系统初始化
     * 具体包括两类数据，系统的基本数据以及用于图表化显示的动态数据
     *
     * @return 返回为json类型的数据，通过对对象进行gson序列化即可
     * */
    @RequestMapping(value = "/msInform", method = RequestMethod.POST)
    public String getMSInformation(){
        return service.getMSInformation();
    }

    /**
     * @function 用于接收微服务系统中，服务节点的动态信息
     * 例如服务的动态状态信息，例如内存使用率等等
     * 主要是为了减少传输过程中每次都传输系统的基本信息，增加系统的损耗
     *
     * @return 返回为json类型的数据，通过对对象进行gson序列化即可
     * */
    @RequestMapping(value = "/msDynamicInform", method = RequestMethod.POST)
    public String getDynamicMSInformation(){
        return service.getMSInformation();
    }
}
