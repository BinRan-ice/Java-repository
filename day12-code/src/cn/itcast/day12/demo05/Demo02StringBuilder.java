package cn.itcast.day12.demo05;
/*
StringBuilder的常用方法：
    public StringBuilder append(...):添加任意类型数据的字符串形式，并返回当前对象自身。
*/
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建StrungBuilder对象
        StringBuilder bu1 = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，调用方法的对象bu1，this==bu1
        StringBuilder bu2 = bu1.append(123);//把bu1的地址赋值给了bu2
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1==bu2);

        //使用append方法无需接收返回值
        bu1.append("123456");
        System.out.println(bu1);

        /*
        链式编程：方法返回值是一个对象，可以继续调用方法
        */
        bu1.append("abc").append(1).append(true);
        System.out.println(bu1);
    }
}
