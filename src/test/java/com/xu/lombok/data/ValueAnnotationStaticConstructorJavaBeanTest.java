package com.xu.lombok.data;

import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class ValueAnnotationStaticConstructorJavaBeanTest {

    @Test
    public void value() {
        final ValueAnnotationStaticConstructorJavaBean root = ValueAnnotationStaticConstructorJavaBean.of("1", "root", "123456");
        System.out.println("root.getName() = " + root.getName());
        System.out.println(root);
    }
}