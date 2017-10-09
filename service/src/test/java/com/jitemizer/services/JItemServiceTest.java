package com.jitemizer.services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// @SpringBootTest("service.message=Hello")
public class JItemServiceTest {

    // private @Autowired JItemService service;

    @Test
    public void contextLoads() {
        // assertThat(service.getMessage()).isNotNull();
    }

    // @SpringBootApplication
    // @Import(JItemServiceConfiguration.class)
    // static class TestConfiguration {
    // }
}
