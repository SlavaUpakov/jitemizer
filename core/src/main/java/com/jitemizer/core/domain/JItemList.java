package com.jitemizer.core.domain;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

/**
 * Main building block to support items grouping in lists
 *
 */
@Value
@Builder
public class JItemList {
    private final long id;
    private final String name;
    @Singular private List<JItem> items;
}
