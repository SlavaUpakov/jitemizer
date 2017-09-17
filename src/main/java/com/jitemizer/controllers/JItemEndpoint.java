/*
 * JItemizer
 *
 * Copyright (c) 2017 - Slava Upakov
 */

package com.jitemizer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jitemizer.models.JItemRequest;
import com.jitemizer.models.JItemResponse;
import com.jitemizer.services.JItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Controller for JItemRequests
 *
 */
@RestController
@RequestMapping("/items")
public class JItemEndpoint
{

    @Autowired
    private JItemService jItemService;

    /**
     * gets an JItem instance
     *
     * @param name a desired jitem name
     * @return
     */
    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<JItemResponse> getItem(@PathVariable String name)
    {
        final JItemResponse item = jItemService.getJItem(name);
        return new ResponseEntity<JItemResponse>(item, HttpStatus.OK);
    }
}