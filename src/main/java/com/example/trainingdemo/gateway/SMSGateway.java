package com.example.trainingdemo.gateway;

public class SMSGateway implements  Gateway{
    @Override
    public void send() {
        System.out.println("Inside SMS Gateway");
    }
}
