package com.xu.lombok.constructor;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 常和spring @Autowired配合使用
 *
 * @author xuguan
 * @since 2025/2/12
 */
@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class AutowiredConstructor {
    private final ApplicationContext applicationContext;

    public void printBeanDefinitionNames() {
        final String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
    }
}
