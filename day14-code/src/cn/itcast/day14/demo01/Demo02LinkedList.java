package cn.itcast.day14.demo01;

import java.util.LinkedList;

/*
java.util.LinkedList 集合 implements List接口
    LinkedList集合的特点：
        1.底层是一个链表结构：查询慢，增删快
        2.里面包含了大量操作首位元素的方法
    注意：使用linkedlist集合特有的方法，不能使用多态

     void addFirst(E e) 将指定元素插入此列表的开头。
     void addLast(E e) 将指定元素添加到此列表的结尾。
     void push(E e) 将元素推入此列表所表示的堆栈。

     E getFirst() 返回此列表的第一个元素。
     E getLast() 返回此列表的最后一个元素。

     E removeFirst() 移除并返回此列表的第一个元素。
     E removeLast() 移除并返回此列表的最后一个元素。
     E pop() 从此列表所表示的堆栈处弹出一个元素。
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show03();
    }

    /*E removeFirst() 移除并返回此列表的第一个元素。
    E removeLast() 移除并返回此列表的最后一个元素。
    E pop() 从此列表所表示的堆栈处弹出一个元素。*/
    private static void show03() {
        //创建LinkList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //String first = linked.removeFirst();
        String first = linked.pop();
        String last = linked.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(linked);
    }

    /* E getFirst() 返回此列表的第一个元素。
     E getLast() 返回此列表的最后一个元素。*/
    private static void show02() {
        //创建LinkList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        //linked.clear();//清空集合中的元素 在获取集合中的元素会抛出NoSuchElementException

        if(!linked.isEmpty()){
            String first = linked.getFirst();
            String last = linked.getLast();
            System.out.println(first);
            System.out.println(last);
        }
    }

    /*void addFirst(E e) 将指定元素插入此列表的开头。
    void addLast(E e) 将指定元素添加到此列表的结尾。
    void push(E e) 将元素推入此列表所表示的堆栈。*/
    private static void show01() {
        //创建LinkList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //void addFirst(E e) 将指定元素插入此列表的开头。
        //linked.addFirst("ace");
        linked.push("ace");
        System.out.println(linked);

        linked.addLast("adc");
        System.out.println(linked);
    }
}

