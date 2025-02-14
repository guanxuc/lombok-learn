package com.xu.lombok.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@Builder
@Getter
@ToString
public class SingularBuilderBean {
    private String id;
    private String name;
    @Singular("addJob")
    private List<String> jobs;
}
