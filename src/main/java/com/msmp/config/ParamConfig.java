package com.msmp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "msmp")
public class ParamConfig {

    private String server = "http://localhost:8761";
    private String msname = BeanConfig.msName;


    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getMsname() {
        return msname;
    }

    public void setMsname(String msname) {
        this.msname = msname;
    }
}
