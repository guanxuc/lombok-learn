package com.xu.lombok.sneakythrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class ExceptionSneakyThrowsTest {

    @Test
    public void exception() {
        Assertions.assertThrows(Exception.class, () -> ExceptionSneakyThrows.exception());
    }
}