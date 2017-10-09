package com.jitemizer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Import(JItemServiceConfiguration.class)
@Service
@Component
public class JItemService {
    private final String message;

    // @Autowired 
    // private JItemEntityRepository repository; 
    
    public JItemService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
