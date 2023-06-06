package com.heapsteep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Spring Boot 3 Security !!";
    }
    @GetMapping("/api1")
    public String api1() {
        return "api1 !!";
    }
    @GetMapping("/api2")
    public String api2() {
        return "api2 !!";
    }
}
