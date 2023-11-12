package com.example.beanmethod.config;

public class MyService {

    private final MyBean myBean;

    public MyService(MyBean myBean) {
        this.myBean = myBean;
    }

    public String usMyBean(){
        return myBean.sayHello();
    }
}
