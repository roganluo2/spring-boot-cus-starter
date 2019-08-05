package com.learning;

/**
 *
 * Created by 召君王 on 2019/4/13.
 */
public class HelloService {

    private String msg;


    public String sayHello(){
        return "hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
