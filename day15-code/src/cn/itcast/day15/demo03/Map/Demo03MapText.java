package cn.itcast.day15.demo03.Map;

import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    练习：
        计算一个字符串中每个字符出现次数
    分析：
        1.使用Scanner获取用户输入的字符串
        2.创建Map集合，key是字符串中的字符，value是字符的个数
        3.遍历字符串，获取每一个字符
        4.使用获取到的字符串，去map集合判断key是否存在
        key存在：
            通过字符（key），获取value（字符个数）
            value++
            put(key,value)把新的value存储到map集合中
        key不存在:
            put(key,1)
        5.遍历map集合，输出结果
 */
public class Demo03MapText {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        //2.创建Map集合，key是字符串中的字符，value是字符的个数
        HashMap<Character, Integer> map = new HashMap<>();

        //3.遍历字符串，获取每一个字符
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            //4.使用获取到的字符串，去map集合判断key是否存在
            if (map.containsKey(aChar)) {
                //key存在
                Integer integer = map.get(aChar);
                integer++;
                map.put(aChar, integer);
            } else {
                map.put(aChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
