package com.dubbo.consumer.web;

import com.dubbo.api.DubboRemoteService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-consumer.xml"});

        DubboRemoteService dubboRemoteService = (DubboRemoteService) context.getBean("dubboRemoteService");
        dubboRemoteService.sayHello("Dubbo");
    }
}
