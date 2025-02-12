package com.xu.lombok.constructor;


import com.xu.lombok.LombokApplication;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author xuguan
 * @since 2025/2/12
 */
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
@SpringBootTest(classes = LombokApplication.class)
public class AutowiredConstructorTest {
    private final AutowiredConstructor autowiredConstructor;

    @Test
    public void printBeanDefinitionNames() {
        autowiredConstructor.printBeanDefinitionNames();
    }
}