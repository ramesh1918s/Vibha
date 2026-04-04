package com.vibha.audit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditController {

    @GetMapping("/")
    public String home() {
        return "Audit Service Running ✅";
    }

    @GetMapping("/audit")
    public String audit() {
        return "Audit Logs Recorded 📊";
    }
}
