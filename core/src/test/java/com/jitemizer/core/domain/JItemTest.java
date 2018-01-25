package com.jitemizer.core.domain;

import lombok.val;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JItemTest {

    @Test
    public void should_build_jitem() {
        val jitem = JItem.builder()
            .id(12)
            .name("name")
            .cell(new JItemCell(12, "", ""))
            .label(new JItemLabel(12, "", "", ""))
                .label(new JItemLabel(12, "", "", ""))
        .build();

        assertThat(jitem.getId()).isEqualTo(12);
        assertThat(jitem.getName()).isEqualTo("name");
        assertThat(jitem.getCells().size()).isEqualTo(1);
        assertThat(jitem.getLabels().size()).isEqualTo(2);
    }
}
