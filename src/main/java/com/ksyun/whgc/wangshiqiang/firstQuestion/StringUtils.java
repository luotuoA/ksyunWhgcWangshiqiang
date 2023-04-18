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
    // 1.3 打印出现次数最多的字母及其次数
    public static void printMostFrequentChar(String str) {
        Map<Character, Integer> map = countOccurrences(str);
        int max = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
                maxChar = entry.getKey();
            }
        }
        System.out.printf("Most frequent char: %c (%d times)\n", maxChar, max);
    }


}