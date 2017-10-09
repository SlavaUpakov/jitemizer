package com.jitemizer.domains;

import lombok.Data;

public @Data class JItemCell {
    private long id;
    private String name;
    private String value;

    protected JItemCell() {
        this(0L, "", "");
    }

    public JItemCell(final long id, final String name, final String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    // public long getId() {
    //     return this.id;
    // }

    // public String getName() {
    //     return this.name;
    // }

    // public String getValue() {
    //     return this.value;
    // }
}
