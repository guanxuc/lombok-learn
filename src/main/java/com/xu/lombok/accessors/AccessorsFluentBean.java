package com.xu.lombok.accessors;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author xuguan
 * @since 2025/2/15
 */
@Accessors(fluent = true)
@Data
public class AccessorsFluentBean {
    private String id;
    private String name;
}
