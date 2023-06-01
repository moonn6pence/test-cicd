package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String getDefault(){
        return "Hello CI/CD!";
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello Github Actions!";
    }
}
