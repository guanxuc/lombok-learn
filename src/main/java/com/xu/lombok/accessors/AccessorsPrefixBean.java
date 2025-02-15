package com.xu.lombok.accessors;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author xuguan
 * @since 2025/2/15
 */
@Accessors(chain = true, prefix = {"prefix", "pre"})
@Data
public class AccessorsPrefixBean {
    private String prefixId;
    private String preName;
}
