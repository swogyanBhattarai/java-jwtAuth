package com.example.auth.controller;

import com.example.auth.security.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final JwtUtil jwtUtil;

    public TestController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login() {
        return jwtUtil.generateToken();
    }

    @GetMapping("/protected")
    public String protectedApi() {
        return "You accessed a protected endpoint";
    }
}

