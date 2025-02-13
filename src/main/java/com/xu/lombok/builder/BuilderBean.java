package com.xu.lombok.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@Builder
@Getter
@ToString
public class BuilderBean {
    private String id;
    private String name;
    @Builder.Default
    @ToString.Exclude
    private String password = "123456";
}
