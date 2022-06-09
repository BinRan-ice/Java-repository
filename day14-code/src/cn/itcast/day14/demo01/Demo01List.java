package cn.itcast.day14.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.list接口 extends Collection
    list接口的特点：
        1.有序的集合，存取元素和取出元素的顺序是一致的（存取123 取出123）
        2.有索引，包含了一些带索引的方法
        3.允许存储重复的元素

    list接口中带索引的方法（特有）
     void add(int index, E element) 在列表的指定位置插入指定元素（可选操作）。
      E remove(int index) 移除列表中指定位置的元素（可选操作）。
      E get(int index) 返回列表中指定位置的元素。
      E set(int index, E element) 用指定元素替换列表中指定位置的元素（可选操作）。
注意：
        操作索引的时候，一定要防止索引越界异常
*/
public class Demo01List {
    public static void main(String[] args) {
        //创建一个list集合对象
        List<String> list=new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);

        //void add(int index, E element) 在列表的指定位置插入指定元素（可选操作）。
        list.add(3,"3");

        //E remove(int index) 移除列表中指定位置的元素（可选操作）。
        //移除c元素
        String removeE = list.remove(2);
        System.out.println("被移除的元素"+removeE);
        System.out.println(list);

        //E set(int index, E element) 用指定元素替换列表中指定位置的元素（可选操作）。
        //把最后一个a替换为A
        String a = list.set(4, "A");
        System.out.println("被替换的元素"+a);
        System.out.println(list);

        //list集合遍历有三种方式
        //使用普通的for循环
        for(int i=0;i<list.size();i++){
            //E get(int index) 返回列表中指定位置的元素。
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("========================");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("========================");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
