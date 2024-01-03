package com.ruxi.springclouddubbosampleprovider.service;

import org.apache.dubbo.config.annotation.Service;
import org.example.ISayHelloService;

@Service
public class SayHelloServiceImpl implements ISayHelloService {


    @Override
    public String sayHello(String msg) {
        return "Hello ruxi";
    }
}
