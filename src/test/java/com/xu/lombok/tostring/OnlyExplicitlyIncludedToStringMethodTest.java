package com.xu.lombok.tostring;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class OnlyExplicitlyIncludedToStringMethodTest {

    @Test
    public void testToString() {
        OnlyExplicitlyIncludedToStringMethod onlyExplicitlyIncludedToStringMethod = new OnlyExplicitlyIncludedToStringMethod("1", "root", "123456");
        final String toString = onlyExplicitlyIncludedToStringMethod.toString();
        System.out.println(toString);
    }
}