package com.example.trainingdemo.service;

import com.example.trainingdemo.gateway.Gateway;
import com.example.trainingdemo.model.HelloMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    @Value("${hello.world.msg}")
    private String helloWorldMsg;

    @Autowired
    Gateway gateway;

    public HelloMessage sayHello(){
        HelloMessage message = new HelloMessage("Hello from","Sachin");
        return message;
    }
}
