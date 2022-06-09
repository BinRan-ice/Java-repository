package cn.itcast.day14.demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
java.util.set接口 extends Collection接口
    set接口的特点：
        1.不允许存储重复元素
        2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
java.util.HashSet集合 implements Set 接口
    HashSet特点：
        1.不允许存储重复元素
        2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
        3.是一个无序的集合，存取元素的顺序可能不一致
        4.底层是一个哈希表结构（查询的速度非常的快）
 */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        //使用add方法往集合中添加元素
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        //使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //使用增强for遍历set集合
        System.out.println("===========================");
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }

}
