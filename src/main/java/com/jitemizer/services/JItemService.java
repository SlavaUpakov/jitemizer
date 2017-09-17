/*
 * jItemizer
 *
 * Copyright (c) 2017 - Slava Upakov
 */

package com.jitemizer.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.jitemizer.domains.JItem;
import com.jitemizer.models.JItemResponse;
import com.jitemizer.exceptions.JItemApplicationException;

import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.Random;

/**
 * service that handles JItemRequests
 *
 */
@Service
public class JItemService {
    public JItemResponse getJItem(final String name) {
        return new JItemResponse(name);
    } 
}
