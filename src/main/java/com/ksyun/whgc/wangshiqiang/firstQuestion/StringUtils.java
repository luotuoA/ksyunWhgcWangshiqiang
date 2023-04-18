package com.ksyun.whgc.wangshiqiang.firstQuestion;

import java.util.*;

public class StringUtils {
    // 1.1 反转字符串参数，并作为方法结果返回
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}