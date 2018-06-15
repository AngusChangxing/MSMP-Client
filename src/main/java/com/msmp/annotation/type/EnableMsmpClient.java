package com.msmp.annotation.type;

import com.msmp.annotation.type.config.ThreadMsmpAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ThreadMsmpAutoConfiguration.class)
public @interface EnableMsmpClient {

}
