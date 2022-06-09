package cn.itcast.day24.demo03.reflect;
/*
    获取class对象的方式：
        1.class.forname("全类名")：将字节码文件加载进内存，返回class对象（多用于配置文件）
        2.类名.class:通过类名的属性class获取（多用于参数传递）
        3.对象.getClass():getClass()方法在Object类中定义（多用于对象的获取字节码方式）
    结论：
        同一个字节码文件（*.class）在一次程序运行过程中，只会被卸载一次，不论通过哪一种方式获取的Class对象都是同一个
 */

import cn.itcast.day24.demo00.domain.Person;

public class Demo01reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.class.forname("全类名")：将字节码文件加载进内存，返回class对象
        Class cls1 = Class.forName("cn.itcast.day24.demo00.domain.Person");
        System.out.println(cls1);
        //2.类名.class:通过类名的属性class获取
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass():getClass()方法在Object类中定义
        Person person=new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);
    }
}
