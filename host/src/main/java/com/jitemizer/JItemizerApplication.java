package com.jitemizer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableAutoConfiguration
public class JItemizerApplication {

    /**
     * message value read from the ConfigFile or ConfigServer
     */
    // @Value("${message}")
    private String message;

    public static void main(final String[] args) {
        SpringApplication.run(JItemizerApplication.class, args);
    }

    // @Bean
    // public WebMvcConfigurer corsConfigurer() {
    //     return new WebMvcConfigurerAdapter() {
    //         @Override
    //         public void addCorsMappings(CorsRegistry registry) {
    //             registry.addMapping("/api")
    //                 .allowedOrigins("http://localhost:9000");
    //         }
    //     };
    // }

    @PostConstruct
    private void postConstruct() {
        System.out.format("STARTING: %s", message);
    }
}
