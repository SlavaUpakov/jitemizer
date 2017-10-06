package com.jitemizer.domains;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Main building block
 *
 */
public class JItemCell {
    private final AtomicLong counter = new AtomicLong();
    
    private final long id;
    private final String name;
    private final String value;

    protected JItemCell() {
        // long id = counter.incrementAndGet();
        this(0L, "", "");
    }

    public JItemCell(final long id, final String name, final String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }
}
