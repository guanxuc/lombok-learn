package com.xu.lombok.tostring;

import lombok.*;

/**
 * @author xuguan
 * @since 2025/2/12
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ToStringMethod {
    private String id;
    private String name;
    @ToString.Exclude
    private String password;
}
