package com.example.trainingdemo.controller;


import com.example.trainingdemo.model.HelloMessageResponse;
import com.example.trainingdemo.service.TrainingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TrainingController {
    final
    TrainingService trainingService;

    @GetMapping(value = "/v1/hello")
    public HelloMessageResponse hello(){
        return trainingService.sayHello();
    }

}
