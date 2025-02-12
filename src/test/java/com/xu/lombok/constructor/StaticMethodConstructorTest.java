package com.xu.lombok.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xuguan
 * @since 2025/2/12
 */
public class StaticMethodConstructorTest {

    @Test
    public void of() {
        final StaticMethodConstructor staticMethodConstructor = StaticMethodConstructor.of();
    }
}