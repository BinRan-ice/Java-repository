package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
ArrayList当中常用的方法有：
public boolean add(E e):向集合当中添加元素，参数的类型和泛型一置
public E get(int index):从集合当中获取元素,参数是索引编号，返回值就是对应位置的元素
public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素
public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数
*/
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的动作是否成功" + success);

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        String str = list.get(2);
        System.out.println("第二号索引位置:" + str);

        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是谁:" + whoRemoved);
        System.out.println(list);

        int size=list.size();
        System.out.println("集合的长度是："+size);
    }
}
