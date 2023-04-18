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
    // 1.4 返回不含有重复字符的最长子串
    public static String longestSubstringWithoutDuplicates(String s) {
        int n = s.length();
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        String longestSubstring = "";

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
            if (set.size() > longestSubstring.length()) {
                longestSubstring = s.substring(left, right);
            }
        }
        return longestSubstring;
    }

}