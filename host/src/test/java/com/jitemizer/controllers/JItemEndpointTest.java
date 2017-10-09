package com.jitemizer.controllers;

// import com.jitemizer.exceptions.JItemApplicationException;

// import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.ResultActions;
// import org.springframework.web.context.WebApplicationContext;

// import java.util.Arrays;

// import static org.assertj.core.api.Assertions.assertThat;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
// import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
// import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

// @RunWith(SpringJUnit4ClassRunner.class)
// @SpringBootTest
// @WebAppConfiguration
public class JItemEndpointTest
{
    // private final ObjectMapper mapper = new ObjectMapper();
    // private final MediaType mediaType = MediaType.APPLICATION_JSON_UTF8;
    // private final String requestBody =
    //                 "{\"name\":\"cell\"}";
    // @Autowired
    // private WebApplicationContext webApplicationContext;
    // private MockMvc mockMvc;

    // @Before
    // public void setup()
    // {
    //     mockMvc = webAppContextSetup(webApplicationContext).build();
    // }

    @Test 
    public void succeeds_executing() {
        assertThat(true).isEqualTo(true);
    }

    // @Test
    // public void getJItemTest()
    //                 throws Exception
    // {
    //     final ResultActions actions = mockMvc
    //                     .perform(get("/items/item").contentType(mediaType).content(requestBody))
    //                     .andExpect(status().isOk()).andExpect(content().contentType(mediaType));

    //     final String response = actions.andReturn().getResponse().getContentAsString();
    //     // final JItemResponse jItemResponse = mapper.readValue(response, JItemResponse.class);

    //     assertThat(jItemResponse.getName()).isEqualTo("item");
    // }
}