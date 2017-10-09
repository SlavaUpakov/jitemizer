package com.jitemizer.domains;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class JItemCellTest {

    @Test
    public void succeeds_to_construct_with_id() {
        int expected = 1;
        JItemCell cell = new JItemCell(expected, "", "");
        assertThat(cell.getId()).isEqualTo(expected);
    }

    @Test
    public void succeeds_to_construct_with_name() {
        String expected = "expected name";
        JItemCell cell = new JItemCell(0, expected, "");
        assertThat(cell.getName()).isEqualTo(expected);
    }

    @Test
    public void succeeds_to_construct_with_value() {
        String expected = "expected name";
        JItemCell cell = new JItemCell(0, "", expected);
        assertThat(cell.getValue()).isEqualTo(expected);
    }
}