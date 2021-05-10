package cn.itcast.day12.demo01;

import java.util.ArrayList;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
            person person默认继承了object类，所以可以使用object类的equals方法
            equals(Object obj) 指示其他某个对象是否与此对象“相等”。
            ==比较运算符，返回的是一个布尔值 false true
            基本数据类型：比较的是值
            引用数据类型：比较的是两个对象的地址值
         */
        Person p1=new Person("迪丽热巴",18);
        Person p2=new Person("古力娜扎",19);
        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);

        //p1=p2;//把p2的地址值赋值给p1
        ArrayList<String>list =new ArrayList<>();
        boolean b = p1.equals(list);
        System.out.println(b);
    }
}
