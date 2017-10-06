package com.jitemizer.domains;

import java.util.ArrayList;
import java.util.List;

/**
 * Main building block to support items grouping in lists
 *
 */
public class JItemList extends JItem {
    protected List<JItem> items = new ArrayList<>();

    protected JItemList () {
        super();
    }

    public JItemList(final long id, final String name, final List<? extends JItemCell> cells, final List<? extends JItem> items) {
        super(id, name, cells);
        this.items.addAll(items);
    }

    public List<? extends JItem> getItems() {
        return this.items;
    }
}
