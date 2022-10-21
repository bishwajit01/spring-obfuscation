package com.vikram.bishwajit.obfuscation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class ObfuscationController {

    public static final String HEALTH_CHECK_RESPONSE = "OK";

    @GetMapping
    public String healthCheck() {
        System.out.println("Executing Health Check !!!!!!");
        return HEALTH_CHECK_RESPONSE;
    }
}
