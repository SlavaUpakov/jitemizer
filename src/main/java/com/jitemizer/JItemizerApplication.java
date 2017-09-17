/*
 * jItemizer
 *
 * Copyright (c) 2017 - Slava Upakov
 */

package com.jitemizer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * Application Starter
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class JItemizerApplication
{

    /**
     * message value read from the ConfigFile or ConfigServer
     */
    // @Value("${message}")
    private String message;

    public static void main(final String[] args)
    {
        SpringApplication.run(JItemizerApplication.class, args);
    }

    /**
     * prints the message read from configs to console, can be used
     * to check whether config was read from ConfigServer or from
     * default configuration
     */
    @PostConstruct
    private void postConstruct()
    {
        System.out.println(message);
    }
}
