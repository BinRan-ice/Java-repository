package cn.itcast.day14.demo05;

import java.util.ArrayList;
import java.util.Collections;

/*
    static <T extends Comparable<? super T>> void sort(List<T> list) 根据元素的自然顺序 对指定列表按升序进行排序。
    注意：
        sort（List<T>list）使用前提
            被排序的集合里边存储的元素，必须实现Comparable，重写接口中的方法compareTo定义排序规则

    Comparable接口的排序规则：
        自己（this）-参数：升序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Collections.addAll(list,12,23,75,24,78,54,1,90,54,67,27,13,87,13,68,31,1,2,35,67,53,21);
        Collections.sort(list);
        System.out.println(list);//[1, 1, 2, 12, 13, 13, 21, 23, 24, 27, 31, 35, 53, 54, 54, 67, 67, 68, 75, 78, 87, 90]

        ArrayList<Person>list1=new ArrayList<>();
        list1.add(new Person("张三",18));
        list1.add(new Person("李四",20));
        list1.add(new Person("王五",15));
        Collections.sort(list1);
        System.out.println(list1);
    }
}
