package com.example.springbootexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Value("${version}")
  private String version;

  @GetMapping("/hello")
  ResponseEntity<String> hello() {

    return new ResponseEntity<>(String.format("Version: %s", version), HttpStatus.OK);
  }

}
