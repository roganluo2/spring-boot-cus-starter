package com.learning;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 召君王 on 2019/4/13.
 */
@ConfigurationProperties(prefix = "spring.hello")
public class HelloServiceProperties {

    public HelloServiceProperties() {
        System.out.println("初始化hello");
    }

    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
