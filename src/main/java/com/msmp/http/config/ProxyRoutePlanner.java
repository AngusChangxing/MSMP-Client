/*
package com.msmp.http.config;

import org.apache.http.HttpHost;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

*/
/**
 * @author changxin
 * @version 1.0 2018/5/9
 * @disciption HttpClient proxy configuration(代理配置)
 * 用来配置代理,一个Route指 运行环境机器->目标机器host的一条线路，也就是如果目标url的host是同一个，那么它们的route也是一样的
 * *//*

@Configuration
public class ProxyRoutePlanner {
    // 代理的host地址
    @Value("${httpclient.config.proxyhost}")
    private String proxyHost;

    // 代理的端口号
    @Value("${httpclient.config.proxyPort}")
    private int proxyPort = 8080;

    @Bean
    public DefaultProxyRoutePlanner defaultProxyRoutePlanner(){
        HttpHost proxy = temp HttpHost(this.proxyHost, this.proxyPort);
        return temp DefaultProxyRoutePlanner(proxy);
    }
}
*/
