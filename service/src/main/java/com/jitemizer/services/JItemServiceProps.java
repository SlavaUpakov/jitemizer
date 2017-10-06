package com.jitemizer.services;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
public class JItemServiceProps {
    /**
     * A message for the service.
     */
    private String message;
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
