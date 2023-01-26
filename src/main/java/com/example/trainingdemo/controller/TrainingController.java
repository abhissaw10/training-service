package com.example.trainingdemo.controller;


import com.example.trainingdemo.model.HelloMessage;
import com.example.trainingdemo.service.TrainingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {

    final
    TrainingService trainingService;

    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @GetMapping(value = "/v1/hello")
    public HelloMessage hello(){
        return trainingService.sayHello();
    }

}
