package cn.itcast.day14.demo03;

import java.util.HashSet;
import java.util.Set;

/*
    set集合不允许存储重复元素的原理

 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<String>set=new HashSet<>();
        String s1=new String("abc");
        String s2=new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }
}
