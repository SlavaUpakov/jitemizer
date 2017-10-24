package com.jitemizer.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@AllArgsConstructor
@Builder
public class JItemCell {
    private final long id;
    private final String name;
    private final String value;
}
