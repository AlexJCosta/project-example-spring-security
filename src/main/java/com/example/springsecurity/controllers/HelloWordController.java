package com.example.springsecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWordController {
	
	@GetMapping
	public ResponseEntity<?> getHelloWord() {
		return ResponseEntity.ok("Hello World!");
	}
	
	@GetMapping("/hello")
	public ResponseEntity<?> getHello() {
		return ResponseEntity.ok("Hello User!");
	}

}
