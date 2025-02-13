package com.xu.lombok.equalsandhashcode;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@AllArgsConstructor
@EqualsAndHashCode
public class EqualsAndHashCodeMethod {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Include
    private String name;
    @EqualsAndHashCode.Exclude
    private String password;
}
