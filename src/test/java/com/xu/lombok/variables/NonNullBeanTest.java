package com.xu.lombok.variables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class NonNullBeanTest {

    @Test
    public void check() {
        Assertions.assertThrows(NullPointerException.class, () -> new NonNullBean(null));

        Assertions.assertThrows(NullPointerException.class, () -> {
            final NonNullBean nonNullBean = new NonNullBean("1");
            nonNullBean.check(null);
        });
    }
}