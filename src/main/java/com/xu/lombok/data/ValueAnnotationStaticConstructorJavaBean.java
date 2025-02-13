package com.xu.lombok.data;

import lombok.ToString;
import lombok.Value;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@Value(staticConstructor = "of")
public class ValueAnnotationStaticConstructorJavaBean {
    String id;
    String name;
    @ToString.Exclude
    String password;
}
