package com.jitemizer.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.jitemizer.domains.JItem;
import com.jitemizer.domains.JItemCell;
import com.jitemizer.models.JItemResponse;
import com.jitemizer.exceptions.JItemApplicationException;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * service that handles JItem related requests
 *
 */
@Import(ServiceConfiguration.class)
@Service
public class JItemService {
    private static List<JItem> items = new ArrayList<>();
    
    public JItemResponse getJItem(final String name) {
        return new JItemResponse(name);
    }

    public List<String> getJItemsByCell(final String name) {

        List<String> result = items.stream()
            .filter(item -> {
                return item.getCells().stream()
                    .filter(cell -> cell.getName() == name)
                    .map(JItemCell::getName)
                    .collect(Collectors.toList());
            })
            .map(JItem::getValue)
            .collect(Collectors.toList());

        return items;
    } 
}
