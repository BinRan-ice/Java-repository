package cn.itcast.day14.demo03;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/（红黑树））+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo04LinkedHahSet {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);//[abc, www, itcast]无序，不允许重复

        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("www");
        set1.add("abc");
        set1.add("abc");
        set1.add("itcast");
        System.out.println(set1);//[www, abc, itcast]有序，不允许重复
    }
}
