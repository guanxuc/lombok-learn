package com.xu.lombok.accessors;

import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/15
 */
public class AccessorsFluentBeanTest {

    @Test
    public void test(){
        AccessorsFluentBean accessorsFluentBean = new AccessorsFluentBean();
        accessorsFluentBean.id("1").name("root");
        System.out.println("accessorsFluentBean.name() = " + accessorsFluentBean.name());
        System.out.println(accessorsFluentBean);
    }

}