package com.xu.lombok.data;

import lombok.Data;
import lombok.ToString;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@Data(staticConstructor = "of")
public class DataAnnotationStaticConstructorJavaBean {
    private String id;
    private String name;
    @ToString.Exclude
    private String password;
}
