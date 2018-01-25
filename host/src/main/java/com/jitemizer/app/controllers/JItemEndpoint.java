package com.jitemizer.app.controllers;

import com.jitemizer.core.domain.JItem;
import com.jitemizer.services.JItemService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller for JItemRequests
 *
 */
@RestController
@RequestMapping("/api/items")
public class JItemEndpoint {

    @Autowired
    private JItemService service;

    /**
     * gets an JItem's list
     *
     * @return
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization",
                    value = "Bearer access_token",
                    required = true,
                    dataType = "string",
                    paramType = "header"),
    })
    @GetMapping
    public List<JItem> getItems() {
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        // this.service.getItems();
        List<JItem> items = new ArrayList<>();
        return items;
    }

    @GetMapping(path = "/{id}")
    public JItem getItemById(@PathVariable long id) {
        JItem item = JItem.builder()
                .id(id)
                .name("")
                //.cell(new JItemCell(12, "", ""))
                //.label(new JItemLabel(12, "", "", ""))
                //.label(new JItemLabel(12, "", "", ""))
                .build();

        return item;
    }

    @PostMapping
	public JItem create(@RequestBody JItem item) {
        return item;
	}

    @PutMapping
            // (produces = APPLICATION_JSON_VALUE)
    public JItem update(@RequestBody JItem item) {
        if(item == null) {
            // throw new IllegalArgumentException("item");
        }

        return item;
    }

    @ExceptionHandler
    void handleIllegalArgumentException(
            IllegalArgumentException e,
            HttpServletResponse response)
            throws IOException {

        response.sendError(HttpStatus.BAD_REQUEST.value());
    }
}