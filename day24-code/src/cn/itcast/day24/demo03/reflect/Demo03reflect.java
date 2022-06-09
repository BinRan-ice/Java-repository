package cn.itcast.day24.demo03.reflect;
/*
    class对象功能∶
        *获取功能:
            1，获取成员变量们
                *Field[]getFields():获得所有public修饰的成员变量
                *Field getField(string name)：获得指定名称的public修饰的成员变量
                *Field[] getDeclaredFields()
                * Field getDeclaredField(string name)
            2．获取构造方法们
                *constructor<?>[]getconstructors()
                *Constructor<T>getconstructor(类<?>... parameterTypes)
                *constructor<T>getDeclaredConstructor(类<?>... parameterTypes)
                *constructor<?>[getDeclaredconstructors()
            3．获取成员方法们:
                *Method[] getMethods()
                *Method getMethod(string name，类<?>... parameterTypes)
                *Method[]getDeclaredMethods()
                *Method getDeclaredMethod(string name，类<?>... parameterTypes)
            4.获取类名
                *string getName()
 */

import cn.itcast.day24.demo00.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo03reflect {
    public static void main(String[] args) throws Exception {
        //获取person的class对象
        Class personClass = Person.class;
    /*
            2．获取构造方法们
                *constructor<?>[]getconstructors()
                *Constructor<T>getconstructor(类<?>... parameterTypes)
                *constructor<T>getDeclaredConstructor(类<?>... parameterTypes)
                *constructor<?>[getDeclaredconstructors()
    */

        //*Constructor<T>getconstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        /*
            Constructor:构造方法
                创建对象：
                     T newInstance(Object... initargs) 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
                     如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance
         */
        Object person = constructor.newInstance("张三", 18);
        System.out.println(person);
        Object o = personClass.newInstance();
        System.out.println(o);
    }
}
