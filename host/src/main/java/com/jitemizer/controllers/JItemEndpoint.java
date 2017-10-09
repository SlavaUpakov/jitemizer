package com.jitemizer.controllers;

import com.jitemizer.domains.JItem;
import com.jitemizer.services.JItemService;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Controller for JItemRequests
 *
 */
@RestController
@RequestMapping("/items")
public class JItemEndpoint {

    @Autowired
    private JItemService service;

    /**
     * gets an JItem instance
     *
     * @param name a desired jitem name
     * @return
     */
    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    // public ResponseEntity<JItem> getItem(@PathVariable String name) {
    public @ResponseBody String getItem(@PathVariable String name) {
        final String item = service.getMessage();
        // return new ResponseEntity<JItemResponse>(item, HttpStatus.OK);
        return item;
    }

    @GetMapping(path="/add")
	public @ResponseBody String add(@RequestParam String name) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		// User n = new User();
		// n.setName(name);
		// n.setEmail(email);
		// userRepository.save(n);
        
        return "added";
	}

	// @GetMapping(path="/all")
	// public @ResponseBody Iterable<JItem> getAll() {
	// 	return service.findAll();
	// }
}