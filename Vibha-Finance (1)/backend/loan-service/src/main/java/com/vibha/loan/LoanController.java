package com.vibha.loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/")
    public String home() {
        return "Loan Service Running ✅";
    }

    @GetMapping("/loan")
    public String loan() {
        return "Loan API Working 💸";
    }

    @GetMapping("/loan/apply")
    public String applyLoan() {
        return "Loan Application Submitted 🚀";
    }
}
