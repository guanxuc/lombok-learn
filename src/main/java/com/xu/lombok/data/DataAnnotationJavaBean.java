package com.xu.lombok.data;

import lombok.Data;
import lombok.ToString;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@Data
public class DataAnnotationJavaBean {
    private String id;
    private String name;
    @ToString.Exclude
    private String password;
}
