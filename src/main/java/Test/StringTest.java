package Test;



import com.ksyun.whgc.wangshiqiang.firstQuestion.StringUtils;

import java.util.Map;

public class StringTest {
    public static void main(String[] args) {
        String str = "hello world";

        // 1.1 反转字符串参数，并作为方法结果返回
        System.out.println(StringUtils.reverse(str));
        // 输出：dlrowolleh

        // 1.2 统计字符串中每个字母出现的次数，以Map结构返回
        Map<Character, Integer> map = StringUtils.countOccurrences(str);
        System.out.println(map);
        // 输出：{ =1, r=1, d=1, e=1, w=1, h=1, l=3, o=2} 包含空格

        // 1.3 打印出现次数最多的字母及其次数
        StringUtils.printMostFrequentChar(str);
        // 输出：Most frequent char: l (3 times)

        // 1.4 返回不含有重复字符的最长子串
        String substring = StringUtils.longestSubstringWithoutDuplicates(str);
        System.out.println(substring);

        // 输出： world
    }
}