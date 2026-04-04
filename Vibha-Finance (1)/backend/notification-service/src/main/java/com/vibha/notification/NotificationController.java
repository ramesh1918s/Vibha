package com.vibha.notification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @GetMapping("/")
    public String home() {
        return "Notification Service Running ✅";
    }

    @GetMapping("/notify")
    public String notifyUser() {
        return "Notification Sent 📩";
    }
}
