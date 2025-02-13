package com.xu.lombok.sync;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class SynchronizedBeanTest {

    @Test
    @SneakyThrows
    public void sub() {
        final SynchronizedBean bean = new SynchronizedBean();
        final Thread t1 = new Thread(() -> {
            bean.sub();
        });
        final Thread t2 = new Thread(() -> {
            bean.sub();
        });
        final Thread t3 = new Thread(() -> {
            bean.sub();
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(bean.total);
    }

    @Test
    @SneakyThrows
    public void subSync() {
        final SynchronizedBean bean = new SynchronizedBean();
        final Thread t1 = new Thread(() -> {
            bean.subSync();
        });
        final Thread t2 = new Thread(() -> {
            bean.subSync();
        });
        final Thread t3 = new Thread(() -> {
            bean.subSync();
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(bean.total);
        Assertions.assertEquals(0, bean.total);
    }
}