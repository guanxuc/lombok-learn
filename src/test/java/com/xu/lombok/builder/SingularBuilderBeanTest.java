package com.xu.lombok.builder;

import org.junit.Test;

/**
 * @author xuguan
 * @since 2025/2/14
 */
public class SingularBuilderBeanTest {

    @Test
    public void builder() {
        final SingularBuilderBean bean = SingularBuilderBean.builder()
                .id("1")
                .name("root")
                .addJob("java")
                .addJob("python")
                .addJob("c++")
                .build();
        System.out.println(bean);
    }
}