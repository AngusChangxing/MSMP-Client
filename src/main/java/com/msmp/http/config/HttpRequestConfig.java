/*
package com.msmp.http.config;

import org.apache.http.client.config.RequestConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

*/
/**
 * @author changxin
 * @version 1.0 2018/5/9
 * @disciption HttpClient proxy configuration(代理配置)
 * 设置请求的各种配置,是对request的一些配置
 * 默认的情况下这三个超时时间都为0,也就意味着无限等待，很容易导致所有的请求阻塞在这个地方无限期等待
 * *//*

@Configuration
public class HttpRequestConfig {
    //connectionRequestTimeout—从连接池中取连接的超时时间
    @Value("${httpclient.config.connectTimeout}")
    private int connectTimeout = 2000;

    //connectTimeout—连接超时时间
    @Value("${httpclient.config.connectRequestTimeout}")
    private int connectRequestTimeout = 2000;

    //socketTimeout—请求超时时间
    @Value("${httpclient.config.socketTimeout}")
    private int socketTimeout = 2000;
    @Bean
    public RequestConfig config(){
        return RequestConfig.custom()
                .setConnectionRequestTimeout(this.connectRequestTimeout)
                .setConnectTimeout(this.connectTimeout)
                .setSocketTimeout(this.socketTimeout)
                .build();
    }
}
*/
