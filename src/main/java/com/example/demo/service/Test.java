package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {
    
    @GetMapping("/ok")
    public ResponseEntity<String> getBal() {
        return ResponseEntity.ok("ok");
    }
}