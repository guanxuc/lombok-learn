package com.xu.lombok.extensionmethod;

import org.junit.jupiter.api.Test;

/**
 * @author xuguan
 * @since 2025/2/15
 */
public class TheExtensionMethodBeanTest {

    @Test
    public void extension(){
        final ExtensionMethodBean bean = new ExtensionMethodBean();
        bean.extension();
    }

}