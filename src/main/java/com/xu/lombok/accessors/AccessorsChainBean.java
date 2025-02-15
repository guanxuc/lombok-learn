package com.xu.lombok.accessors;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author xuguan
 * @since 2025/2/15
 */
@Accessors(chain = true)
@Data
public class AccessorsChainBean {
    private String id;
    private String name;
}
