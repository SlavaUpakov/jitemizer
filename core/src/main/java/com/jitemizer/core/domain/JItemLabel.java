package com.jitemizer.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

/**
 * JItemLabel defines and implements a labeling solution applying
 * - color
 * - name
 * - icon
 * - ?
 * - TODO: could we define those properties through cells ?
 */
@Value
@AllArgsConstructor
@Builder
public class JItemLabel {
    private final long id;
    private final String name;
    private final String color;
    private final String icon;
}
