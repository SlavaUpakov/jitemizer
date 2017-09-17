/*
 * jItemizer
 *
 * Copyright (c) 2017 - Slava Upakov
 */

package com.jitemizer.domains;

import java.util.ArrayList;
import java.util.List;

/**
 * Main building block
 *
 */
public class JItem extends JItemCell{
    protected String name;

    protected List<JItemCell> cells = new ArrayList<>(); 

    protected List<JItemLabel> labels = new ArrayList<>(); 

    protected JItem() {
        super();
    }

    public JItem(final String name, final List<? extends JItemCell> cells) {
        super(name, "");
        this.cells.addAll(cells);
    }

    public String getName() {
        return this.name;
    }

    public List<JItemCell> getCells() {
        return this.cells;
    }
}
