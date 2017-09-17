/*
 * jItemizer
 *
 * Copyright (c) 2017 - Slava Upakov
 */

package com.jitemizer.domains;

/**
 * Main building block
 *
 */
public class JItemCell {
    private final String name;
    private final String value;

    protected JItemCell() {
        this("", "");
    }

    public JItemCell(final String name, final String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }
}
