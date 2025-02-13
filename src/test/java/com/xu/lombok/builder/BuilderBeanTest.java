package com.xu.lombok.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class BuilderBeanTest {

    @Test
    public void builder() {
        final BuilderBean root = BuilderBean.builder()
                .id("1")
                .name("root")
                .build();
        Assertions.assertEquals("123456", root.getPassword());
        System.out.println("root = " + root);
    }
}