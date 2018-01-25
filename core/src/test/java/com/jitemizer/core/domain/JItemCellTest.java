package com.jitemizer.core.domain;

import lombok.val;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class JItemCellTest {

    @Test
    public void should_build_cell() {
        val cell = JItemCell.builder()
                .id(123)
                .name("name")
                .value("value")
                .build();
        assertThat(cell.getId()).isEqualTo(123);
        assertThat(cell.getName()).isEqualTo("name");
        assertThat(cell.getValue()).isEqualTo("value");
    }

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