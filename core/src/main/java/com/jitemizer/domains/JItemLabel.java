/*
 * jItemizer
 *
 * Copyright (c) 2017 - Slava Upakov
 */

package com.jitemizer.domains;

/**
 * JItemLabel defines and implements a labeling solution applying
 * - color
 * - name
 * - icon ?
 *
 */
public class JItemLabel extends JItem {
    public JItemLabel(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
