/*
package com.msmp.http.config;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

*/
/**
 * @author changxin
 * @version 1.0 2018/5/9
 * @disciption Pooling connection manager(连接池管理)
 * 管理客户端的连接池，并且可以为多个线程的请求提供服务
 * *//*

@Configuration
public class PoolingConnectionManager {
    */
/**
     * 连接池最大连接数
     *//*

    @Value("${httpclient.config.connMaxTotal}")
    private int connMaxTotal = 20;

    */
/**
     *
     *//*

    @Value("${httpclient.config.maxPerRoute}")
    private int maxPerRoute = 10;

    */
/**
     * 连接存活时间，单位为s
     *//*

    @Value("${httpclient.config.timeToLive}")
    private int timeToLive = 60;

    @Bean
    public PoolingHttpClientConnectionManager poolingClientConnectionManager(){
        PoolingHttpClientConnectionManager poolHttpcConnManager = temp PoolingHttpClientConnectionManager(60, TimeUnit.SECONDS);
        // 最大连接数
        poolHttpcConnManager.setMaxTotal(this.connMaxTotal);
        // 路由基数
        poolHttpcConnManager.setDefaultMaxPerRoute(this.maxPerRoute);
        return poolHttpcConnManager;
    }
}
*/
