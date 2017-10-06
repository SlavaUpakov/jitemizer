package com.jitemizer.domains;

import java.util.ArrayList;
import java.util.List;

/**
 * Main building block
 *
 */
public class JItem extends JItemCell {
    protected String name;

    protected List<JItemCell> cells = new ArrayList<>(); 

    protected List<JItemLabel> labels = new ArrayList<>(); 

    protected JItem() {
        super();
    }

    protected JItem(Builder builder) {
        
    }

    public JItem(final long id, final String name) {
        this(id, name, new ArrayList<JItemCell>());
    }

    public JItem(final long id, final String name, final List<? extends JItemCell> cells) {
        super(id, name, "");
        this.cells.addAll(cells);
    }

    public String getName() {
        return this.name;
    }

    public List<JItemCell> getCells() {
        return this.cells;
    }

    /**
     * 
     */
    public static class Builder {
        public Builder add(JItemCell cell) {
            return this;
        }

        public JItem build() {
            return new JItem(this);
        }
    }
}
