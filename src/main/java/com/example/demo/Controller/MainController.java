package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String hello(){
        return "<div style=\"border: 1px solid #000; height: 500px;\" >Hello, Spring! Test Message :-)</div>";

    }
}