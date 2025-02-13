package com.xu.lombok.data;

import lombok.Data;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@Data(staticConstructor = "of")
public class DataAnnotationStaticConstructorJavaBean {
    private String id;
    private String name;
    private String password;
}
