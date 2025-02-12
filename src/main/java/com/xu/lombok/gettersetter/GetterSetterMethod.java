package com.xu.lombok.gettersetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author xuguan
 * @since 2025/2/12
 */
@RequiredArgsConstructor
@Getter
@Setter
public class GetterSetterMethod {

    private String id;
    private String name;
    @Getter(value = AccessLevel.PROTECTED)
    @Setter(value = AccessLevel.PROTECTED)
    private String password;
}
