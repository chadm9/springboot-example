package com.example.springbootexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/lazyhello")
  ResponseEntity<String> hello() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt();
    }
    return new ResponseEntity<>("yawn....hello", HttpStatus.OK);
  }

}
