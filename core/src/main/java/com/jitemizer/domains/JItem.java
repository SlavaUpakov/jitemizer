package com.jitemizer.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

/**
 * Main framework building block
 *
 */
@Value
@AllArgsConstructor
@Builder
public class JItem {
    private final long id;
    private final String name;
    @Singular
    private List<JItemCell> cells;
    @Singular private List<JItemLabel> labels;
}
