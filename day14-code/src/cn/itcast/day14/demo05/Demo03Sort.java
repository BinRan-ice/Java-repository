package cn.itcast.day14.demo05;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    static <T> void sort(List<T> list, Comparator<? super T> c) 根据指定比较器产生的顺序对指定列表进行排序。

    Comparator和Comparable的区别：
        Comparable：自己（this)和别人（参数）比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
        Comparator：相当于找一个第三方的裁判，比较两个

    Comparator排序规则：
        o1-o2:升序
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);
        Collections.sort(list,(o1, o2) -> o1-o2);
        System.out.println(list);
    }
}
