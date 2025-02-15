package com.xu.lombok.sneakythrows;

import lombok.SneakyThrows;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class ThrowableSneakyThrows {

    // catch Throwable
    @SneakyThrows
    public static void throwable() {
        throw new Throwable("throwable");
    }
}
