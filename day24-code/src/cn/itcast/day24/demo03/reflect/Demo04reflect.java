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
import java.lang.reflect.Method;

public class Demo04reflect {
    public static void main(String[] args) throws Exception {
        //获取person的class对象
        Class personClass = Person.class;
    /*
            3．获取成员方法们:
                *Method[] getMethods()
                *Method getMethod(string name，类<?>... parameterTypes)
                *Method[]getDeclaredMethods()
                *Method getDeclaredMethod(string name，类<?>... parameterTypes)
    */

       //获取指定名称的方法
        Method eat = personClass.getMethod("eat");
        /*
            Method:方法对象
                执行方法：
                    Object invoke(Object obj,Object...args)
                获取方法的名称：
                    String getName
         */
        Person person=new Person();
        //执行方法
        eat.invoke(person);

        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(person,"吃饭");
        System.out.println("---------------------");

        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        //获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}
