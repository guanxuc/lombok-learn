package com.xu.lombok.data;

import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class DataAnnotationJavaBeanTest {

    @Test
    public void data() {
        final DataAnnotationJavaBean dataAnnotationJavaBean = new DataAnnotationJavaBean();
        final DataAnnotationJavaBean dataAnnotationJavaBean2 = new DataAnnotationJavaBean();
        dataAnnotationJavaBean.setId("1");
        dataAnnotationJavaBean.setName("root");
        dataAnnotationJavaBean.setPassword("123456");
        System.out.println("dataAnnotationJavaBean.getName() = " + dataAnnotationJavaBean.getName());
        System.out.println("dataAnnotationJavaBean.equals(dataAnnotationJavaBean2) = " + dataAnnotationJavaBean.equals(dataAnnotationJavaBean2));
        System.out.println("dataAnnotationJavaBean.hashCode() = " + dataAnnotationJavaBean.hashCode());
        System.out.println("dataAnnotationJavaBean.toString() = " + dataAnnotationJavaBean.toString());
    }
}