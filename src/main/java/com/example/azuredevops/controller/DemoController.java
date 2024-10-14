package com.example.azuredevops.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final String message = "Welcome to azure DevOps pipeline";
    @GetMapping("/test")
    public ResponseEntity<String> sayHi() {
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
