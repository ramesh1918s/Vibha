package com.vibha.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public String home() {
        return "Auth Service Running ✅";
    }

    @GetMapping("/login")
    public String login() {
        return "Login API Working 🔐";
    }
}
