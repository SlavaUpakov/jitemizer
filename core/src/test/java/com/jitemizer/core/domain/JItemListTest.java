package com.jitemizer.core.domain;

import lombok.val;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class JItemListTest {

    @Test
    public void builder() {
        val list = JItemList.builder()
                .id(12)
                .name("list")
                .item(JItem.builder().id(12).build())
                .build();

        assertThat(list.getId()).isEqualTo(12);
        assertThat(list.getName()).isEqualTo("list");
        assertThat(list.getItems().size()).isEqualTo(1);
    }
}