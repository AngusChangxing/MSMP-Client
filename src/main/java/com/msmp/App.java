package com.msmp;

import com.msmp.annotation.type.EnableMsmpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.msmp")
@EnableMsmpClient
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
