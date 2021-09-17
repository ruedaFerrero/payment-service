package com.payment.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/version")
    public String getVersion() {
        return "1.0";
    }
}