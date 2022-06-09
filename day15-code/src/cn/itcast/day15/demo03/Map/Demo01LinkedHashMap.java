package cn.itcast.day15.demo03.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.linkedHashMap<k,v> extends HashMap<k,v>
        底层原理：
            哈希表+链表（记录元素的顺序）
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("d","d");
        System.out.println(map);//key不允许重复，无序

        LinkedHashMap<String,String>map1=new LinkedHashMap<>();
        map1.put("a","a");
        map1.put("c","c");
        map1.put("b","b");
        map1.put("d","d");
        System.out.println(map1);//key不允许重复，有序
    }

}
