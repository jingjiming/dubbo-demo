package com.dubbo.api;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProvider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-provider.xml"});

        System.out.println("begin");
        context.getBean("dubboRemoteService", DubboRemoteService.class).sayHello("Dubbo");
        Thread.currentThread().join();
    }
}
