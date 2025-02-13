package com.xu.lombok.tostring;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class OnlyExplicitlyIncludedToStringMethod {
    @ToString.Include
    private String id;
    @ToString.Include
    private String name;
    @ToString.Exclude
    private String password;
}
