package com.xu.lombok.accessors;

import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/15
 */
public class AccessorsPrefixBeanTest {

    @Test
    public void test(){
        AccessorsPrefixBean accessorsPrefixBean = new AccessorsPrefixBean();
        accessorsPrefixBean.setId("1").setName("root");
        System.out.println(accessorsPrefixBean);
    }

}