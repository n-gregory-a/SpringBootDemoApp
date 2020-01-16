package com.nga.SpringBootDemoApp.rest;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    // expose "/" that return "Hello World"
    @GetMapping
    public String sayHello() {
        return "Hello World! Time on server is " + LocalDateTime.now();
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
