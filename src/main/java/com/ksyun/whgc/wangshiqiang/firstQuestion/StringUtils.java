package com.ksyun.whgc.wangshiqiang.firstQuestion;

import java.util.*;

public class StringUtils {
    // 1.1 反转字符串参数，并作为方法结果返回
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    // 1.2 统计字符串中每个字母出现的次数，以Map结构返回
    public static Map<Character, Integer> countOccurrences(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

}