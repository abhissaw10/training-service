package com.example.trainingdemo.gateway;

public class EmailGateway implements Gateway{
    @Override
    public void send() {
        System.out.println("Inside Email Gateway");
    }
}
