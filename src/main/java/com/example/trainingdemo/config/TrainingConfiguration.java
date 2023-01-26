package com.example.trainingdemo.config;

import com.example.trainingdemo.gateway.EmailGateway;
import com.example.trainingdemo.gateway.Gateway;
import com.example.trainingdemo.gateway.SMSGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TrainingConfiguration {

    @Bean
    @Profile("dev")
    public Gateway smsGateway(){
        return new SMSGateway();
    }

    @Bean
    @Profile("!dev")
    public Gateway emailGateway(){
        return new EmailGateway();
    }

}
