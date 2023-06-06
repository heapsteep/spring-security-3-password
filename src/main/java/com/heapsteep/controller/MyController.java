package com.heapsteep.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String welcome() {
        return "Home page";
    }
    @GetMapping("/api1")
    public String api1() {
        return "api1 !!";
    }
    @GetMapping("/api2")
    public String api2() {
        return "api2 !!";
    }
    @GetMapping("/api3")
    public String api3() {
        return "api3 !!";
    }
}
