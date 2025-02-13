package com.xu.lombok.tostring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class CallSuperToStringMethodTest {

    @Test
    public void testToString() {
        final CallSuperToStringMethod callSuperToStringMethod = new CallSuperToStringMethod("xiaoming");
        callSuperToStringMethod.setName("root");
        System.out.println(callSuperToStringMethod);
    }
}