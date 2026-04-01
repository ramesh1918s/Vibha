package com.vibha.auth.controller;

import org.springframework.web.bind.annotation.*;
import com.vibha.auth.config.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/login")
    public String login(@RequestParam String username) {
        return jwtUtil.generateToken(username);
    }
}