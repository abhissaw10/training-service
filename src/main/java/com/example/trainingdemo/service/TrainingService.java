package com.example.trainingdemo.service;

import com.example.trainingdemo.model.HelloMessageResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    @Value("${hello.world.msg}")
    private String helloWorldMsg;

    public HelloMessageResponse sayHello(){
        HelloMessageResponse helloMessageResponse = new HelloMessageResponse(helloWorldMsg,"Mohit");
        return helloMessageResponse;
    }
}
