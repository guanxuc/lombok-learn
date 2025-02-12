package com.xu.lombok.gettersetter;

import com.xu.lombok.LombokApplication;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xuguan
 * @since 2025/2/12
 */
@SpringBootTest(classes = LombokApplication.class)
public class AutowiredSetterMethodTest {
    @Setter(onMethod_ = {@Autowired})
    private AutowiredSetterMethod autowiredSetterMethod;

    @Test
    void printBeanDefinitionNames() {
        autowiredSetterMethod.printBeanDefinitionNames();
    }
}