package com.example.lab01.controller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
public class EnvValue {
    private String env;
    private String serviceName;
}
