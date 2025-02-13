package com.xu.lombok.sneakythrows;

import lombok.SneakyThrows;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class ExceptionSneakyThrows {

    // catch Exception
    @SneakyThrows(value = Exception.class)
    public static void exception() {
        throw new Exception("exception");
    }
}
