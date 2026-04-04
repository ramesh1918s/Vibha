package com.vibha.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String home() {
        return "User Service Running ✅";
    }

    @GetMapping("/user")
    public String user() {
        return "User API Working 🚀";
    }
}
