package cn.itcast.day12.demo01;

import java.util.Random;

/*
java.lang.Object
类object是类层次结构的根类
每个类都使用object作为超类
所有对象（包括数组）都是实现这个类的方法
*/
public class Demo01ToString {
    public static void main(String[] args) {
        //person类默认继承了object类，所以可以使用object类中的toString方法
        //String toString()返回该对象的字符串表示。
        Person person = new Person("张三", 18);
        String s = person.toString();
        System.out.println(s);//cn.itcast.day12.demo01.Person@b4c966a

        //直接打印对象的名字，其实就是调用对象的toString person=p.toString();
        System.out.println(person);//cn.itcast.day12.demo01.Person@b4c966a

        //看一个类是否重写了toString，直接打印这个类的对象即可，如果没有重写toString方法那么打印的是对象的地址值
        Random r=new Random();
        System.out.println(r);
    }
}
