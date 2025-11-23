package com.topdogs.training.controller;

import com.topdogs.training.providers.HelloMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {
    private final HelloMessageProvider messageProvider;

    protected HelloController(HelloMessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @GetMapping("/hello")
    public String hello() {
        return messageProvider.getMessage();
    }
}
