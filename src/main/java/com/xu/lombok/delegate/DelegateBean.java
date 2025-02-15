package com.xu.lombok.delegate;

import lombok.Data;
import lombok.experimental.Delegate;

/**
 * @author xuguan
 * @since 2025/2/15
 */
@Data
public class DelegateBean {
    @Delegate
    private String name;
}
