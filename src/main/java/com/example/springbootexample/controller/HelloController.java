package com.example.springbootexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  ResponseEntity<String> hello() {
    return new ResponseEntity<>("world", HttpStatus.OK);
  }

}
