package com.vibha.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("/")
    public String home() {
        return "Payment Service Running ✅";
    }

    @GetMapping("/payment")
    public String payment() {
        return "Payment API Working 💰";
    }
}
