package com.xu.lombok.sync;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.Synchronized;

import java.util.concurrent.TimeUnit;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@NoArgsConstructor
public class SynchronizedBean {
    public int total = 1;

    @SneakyThrows
    public void sub() {
        if (total > 0) {
            TimeUnit.SECONDS.sleep(1);
            total--;
        }
    }

    @Synchronized
    @SneakyThrows
    public void subSync() {
        if (total > 0) {
            TimeUnit.SECONDS.sleep(1);
            total--;
        }
    }

}
