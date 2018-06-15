package com.msmp.annotation.type.config;

import com.msmp.annotation.type.run.ThreadMsmpClientRunner;
import com.msmp.annotation.type.thread.InitThread;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThreadMsmpAutoConfiguration {

    @Bean
    public InitThread initThread(){
        return new InitThread();
    }

    @Bean
    public ThreadMsmpClientRunner threadMsmpClientRunner(InitThread initThread) {
        return new ThreadMsmpClientRunner(initThread);
    }

}
