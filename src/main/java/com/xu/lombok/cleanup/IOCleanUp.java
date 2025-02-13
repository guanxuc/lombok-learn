package com.xu.lombok.cleanup;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author xuguan
 * @since 2025/2/13
 */
public class IOCleanUp {

    @SneakyThrows
    public static void clean() {
        final String dir = System.getProperty("user.dir");
        final String path = dir + File.separator
                + "src" + File.separator + "main" + File.separator + "java" + File.separator
                + IOCleanUp.class.getCanonicalName().replace(".", File.separator) + ".java";
        @Cleanup
        final InputStream is = Files.newInputStream(Paths.get(path));
        StringBuilder sb = new StringBuilder(is.available());
        byte[] buffer = new byte[1024];
        int len = 0;
        while (-1 != (len = is.read(buffer))) {
            sb.append(new String(buffer, 0, len));
        }
        System.out.println(sb);
    }
}
