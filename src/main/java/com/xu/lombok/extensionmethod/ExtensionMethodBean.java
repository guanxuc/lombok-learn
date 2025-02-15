package com.xu.lombok.extensionmethod;

import lombok.experimental.ExtensionMethod;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuguan
 * @since 2025/2/15
 */
@ExtensionMethod({StringUtils.class, DigestUtils.class})
public class ExtensionMethodBean {

    public void extension() {
        final List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        final String commaDelimitedString = list.collectionToCommaDelimitedString();
        System.out.println(commaDelimitedString);

        final String md5Hex = commaDelimitedString.getBytes().md5DigestAsHex();
        System.out.println(md5Hex);
    }
}
