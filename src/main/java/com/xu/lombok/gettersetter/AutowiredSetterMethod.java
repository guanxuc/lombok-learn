package com.xu.lombok.gettersetter;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author xuguan
 * @since 2025/2/12
 */
@Component
public class AutowiredSetterMethod {
    @Setter(onMethod_ = {@Autowired})
    private ApplicationContext applicationContext;

    public void printBeanDefinitionNames() {
        final String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
    }
}
