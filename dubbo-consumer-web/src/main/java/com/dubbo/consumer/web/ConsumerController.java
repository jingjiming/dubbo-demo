package com.dubbo.consumer.web;

import com.dubbo.api.DubboRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("dubbo/service")
public class ConsumerController {

    @Resource
    DubboRemoteService dubboRemoteService;


    @RequestMapping("sayHello")
    public void sayHello(String name) {
        dubboRemoteService.sayHello(name);
    }
}
