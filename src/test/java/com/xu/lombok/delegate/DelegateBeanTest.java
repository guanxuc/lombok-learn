package com.xu.lombok.delegate;

import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/15
 */
public class DelegateBeanTest {

    @Test
    public void delegate() {
        final DelegateBean delegateBean = new DelegateBean();
        delegateBean.setName("root");
        final String upperCase = delegateBean.toUpperCase();
        System.out.println(delegateBean);
        System.out.println(upperCase);
    }
}