package com.xu.lombok.variables;

import lombok.Data;
import lombok.val;
import lombok.var;

/**
 * @author xuguan
 * @since 2025/2/13
 */
@Data
public class ValVarLocalVariable {

    public static void valvar() {
        val finalLocalVariable = 1;
        var localVariable = 1;
        for (int i = 0; i < 10; i++) {
            localVariable++;
        }
        System.out.println("finalLocalVariable = " + finalLocalVariable);
        System.out.println("localVariable = " + localVariable);
    }

}
