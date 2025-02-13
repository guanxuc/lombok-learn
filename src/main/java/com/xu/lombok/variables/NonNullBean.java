package com.xu.lombok.variables;

import lombok.Data;
import lombok.NonNull;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@Data
public class NonNullBean {
    @NonNull
    private String id;

    @NonNull
    public String check(@NonNull String name) {
        return id + ": " + name;
    }
}
