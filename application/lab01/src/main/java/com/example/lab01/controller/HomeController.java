package com.example.lab01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
//    @Value("${test.username}")
//    private String adminName;

    @Autowired
    Environment env;

    @RequestMapping("/")
    public ResponseEntity<EnvValue> home() {
        System.out.println(env);
        System.out.println(env.getProperty("spring.profiles.service"));
        EnvValue test = new EnvValue(env.getActiveProfiles()[0], env.getProperty("spring.profiles.service"));
        return ResponseEntity.ok(test);
    }
}
