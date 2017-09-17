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
public class JItemList extends JItem {
    protected List<JItem> items = new ArrayList<>();

    protected JItemList () {
        super();
    }

    public JItemList(final String name, final List<? extends JItemCell> cells, final List<? extends JItem> items) {
        super(name, cells);
        this.items.addAll(items);
    }

    public List<? extends JItem> getItems() {
        return this.items;
    }
}
