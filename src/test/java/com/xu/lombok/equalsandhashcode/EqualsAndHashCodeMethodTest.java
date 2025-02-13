package com.xu.lombok.equalsandhashcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class EqualsAndHashCodeMethodTest {

    @Test
    public void testEquals() {
        final EqualsAndHashCodeMethod root1 = new EqualsAndHashCodeMethod("1", "root", "123456");
        final EqualsAndHashCodeMethod root2 = new EqualsAndHashCodeMethod("1", "root", "123456");
        Assertions.assertEquals(root1, root2);
    }

    @Test
    public void canEqual() {
        final EqualsAndHashCodeMethod root1 = new EqualsAndHashCodeMethod("1", "root", "123456");
        final EqualsAndHashCodeMethod root2 = new EqualsAndHashCodeMethod("1", "root", "123456");
        Assertions.assertTrue(root1.canEqual(root2));
    }

    @Test
    public void testHashCode() {
        final EqualsAndHashCodeMethod root1 = new EqualsAndHashCodeMethod("1", "root", "123456");
        final EqualsAndHashCodeMethod root2 = new EqualsAndHashCodeMethod("1", "root", "123456");
        Assertions.assertEquals(root1.hashCode(), root2.hashCode());
    }
}