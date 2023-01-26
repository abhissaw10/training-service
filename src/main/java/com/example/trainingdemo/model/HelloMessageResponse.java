package com.example.trainingdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloMessageResponse {
    private String message;
    private String name;
}
