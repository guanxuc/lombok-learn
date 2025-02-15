package com.xu.lombok.accessors;

import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/15
 */
public class AccessorsChainBeanTest {

    @Test
    public void test(){
        AccessorsChainBean accessorsChainBean = new AccessorsChainBean();
        accessorsChainBean.setId("1").setName("root");
        System.out.println(accessorsChainBean);
    }

}