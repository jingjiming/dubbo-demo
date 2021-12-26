package com.dubbo.api;

import org.springframework.stereotype.Service;

@Service("dubboRemoteService")
public class DubboRemoteServiceImpl implements DubboRemoteService {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
