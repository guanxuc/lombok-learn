package com.xu.lombok.tostring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xuguan
 * @since 2025/2/12
 */
public class ToStringMethodTest {

    @Test
    public void testToString() {
        final ToStringMethod root = new ToStringMethod("1", "root", "123456");
        System.out.println(root);
    }
}