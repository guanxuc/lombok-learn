package com.xu.lombok.with;

import lombok.With;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class WithBean {
    @With
    private final String id;
    private final String name;

    public WithBean(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
