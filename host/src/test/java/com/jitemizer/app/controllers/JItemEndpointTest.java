package com.jitemizer.app.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jitemizer.core.domain.JItem;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

// import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.MediaType;

// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.ResultActions;
// import org.springframework.web.context.WebApplicationContext;

// import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class JItemEndpointTest
{
    private final ObjectMapper mapper = new ObjectMapper();
    private final MediaType MEDIA_TYPE = MediaType.APPLICATION_JSON_UTF8;
    private final String requestBody = "{\"name\":\"cell\"}";

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void shouldReturnAllCurrentAvailableItems() throws Exception
    {
        final MockHttpServletRequestBuilder request = get("/api/items")
            .contentType(MEDIA_TYPE)
            .content("");
        final ResultActions actions = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().contentType(MEDIA_TYPE));

        final String response = actions.andReturn().getResponse().getContentAsString();
        final JItem[] data = mapper.readValue(response, JItem[].class);
        final List<JItem> items = Arrays.asList(data);

        assertThat(items).isNotNull();
        // todo: add real test here
        assertThat(items.size()).isEqualTo(0);
    }
}