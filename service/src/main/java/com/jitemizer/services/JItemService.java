package com.jitemizer.services;

import org.springframework.stereotype.Component;

@Component
public class JItemService {
    private final String message;
    
    public JItemService(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
