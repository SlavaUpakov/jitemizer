package com.jitemizer.services;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(JItemServiceProps.class)
public class JItemServiceConfiguration {
    @Bean
    public JItemService service(JItemServiceProps properties) {

        return new JItemService(properties.getMessage());
    }
}