package com.example.day01;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Day 1 - Spring Boot Running ";
    }

    @GetMapping("/json")
    public Greeting jsonMessage(){
        return new Greeting("Spring Boot JSON Response ");
    }
}
