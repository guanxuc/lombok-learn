package com.xu.lombok.data;

import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class DataAnnotationStaticConstructorJavaBeanTest {

    @Test
    public void data() {
        final DataAnnotationStaticConstructorJavaBean staticConstructorJavaBean = DataAnnotationStaticConstructorJavaBean.of();
        final DataAnnotationStaticConstructorJavaBean staticConstructorJavaBean2 = DataAnnotationStaticConstructorJavaBean.of();
        staticConstructorJavaBean.setId("1");
        staticConstructorJavaBean.setName("root");
        staticConstructorJavaBean.setPassword("123456");
        System.out.println("staticConstructorJavaBean.getName() = " + staticConstructorJavaBean.getName());
        System.out.println("staticConstructorJavaBean.equals(staticConstructorJavaBean2) = " + staticConstructorJavaBean.equals(staticConstructorJavaBean2));
        System.out.println("staticConstructorJavaBean.hashCode() = " + staticConstructorJavaBean.hashCode());
        System.out.println("staticConstructorJavaBean.toString() = " + staticConstructorJavaBean.toString());
    }
}