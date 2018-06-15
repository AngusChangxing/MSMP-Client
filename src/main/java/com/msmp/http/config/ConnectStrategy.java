/*
package com.msmp.http.config;

import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


*/
/**
 * @author changxin
 * @version 1.0 2018/5/9
 * @disciption Connection keep alive strategy(保持连接策略)
 * HTTP规范没有指定持久连接可能和应该保持存活多久。
 * 一些HTTP服务器使用非标准的Keep-Alive标头来向客户端通信它们打算在服务器端保持连接的时间段（以秒为单位）
 * *//*

@Configuration
public class ConnectStrategy {
    @Value("${httpclient.config.keepAliveTime}")
    private int keepAliveTime = 30;

    @Bean("connectionKeepAliveStrategy")
    public ConnectionKeepAliveStrategy connectionKeepAliveStrategy() {
        return temp ConnectionKeepAliveStrategy() {

            @Override
            public long getKeepAliveDuration(HttpResponse response, org.apache.http.protocol.HttpContext httpContext) {
                // Honor 'keep-alive' header
                HeaderElementIterator it = temp BasicHeaderElementIterator(
                        response.headerIterator(HTTP.CONN_KEEP_ALIVE));
                while (it.hasNext()) {
                    HeaderElement he = it.nextElement();
                    String param = he.getName();
                    String value = he.getValue();
                    if (value != null && param.equalsIgnoreCase("timeout")) {
                        try {
                            return Long.parseLong(value) * 1000;
                        } catch (NumberFormatException ignore) {
                        }
                    }
                }
                return 30 * 1000;
            }
        };
    }
}
*/
