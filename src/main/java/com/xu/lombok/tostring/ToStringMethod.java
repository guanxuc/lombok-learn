package com.xu.lombok.tostring;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author xuguan
 * @since 2025/2/12
 */
@AllArgsConstructor
@ToString(exclude = "password")
public class ToStringMethod {
    private String id;
    private String name;
    private String password;
}
