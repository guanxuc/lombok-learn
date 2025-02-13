package com.xu.lombok.with;

import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class WithBeanTest {

    @Test
    public void withId() {
        WithBean root = new WithBean("1", "root");
        System.out.println(root.hashCode());
        root = root.withId("1");
        System.out.println(root.hashCode());
        root = root.withId("2");
        System.out.println(root.hashCode());
    }
}