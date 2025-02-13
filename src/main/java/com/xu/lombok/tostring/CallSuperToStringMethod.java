package com.xu.lombok.tostring;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@AllArgsConstructor
@ToString(callSuper = true)
public class CallSuperToStringMethod extends ToStringMethod {
    private String subName;

    public String getSubName() {
        return "getter: " + subName;
    }
}
