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

import java.lang.reflect.Field;

public class Demo02reflect {
    public static void main(String[] args) throws Exception {
        //获取person的class对象
        Class personClass = Person.class;
    /*
            1，获取成员变量们
                *Field[]getFields()
                *Field getField(string name)
                *Field[] getDeclaredFields()
                * Field getDeclaredField(string name)
    */
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("------------------");
        Field a = personClass.getField("a");
        /*
            Field:成员变量
                操作：
                    1.设置值
                        void set(Object obj,Object value)
                    2.获取值
                        get(Object obj)
         */
        //获取成员变量a的值
        Person p=new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p,"张三");
        System.out.println(p);

        //*Field[] getDeclaredFields():获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //* Field getDeclaredField(string name)
        Field name = personClass.getDeclaredField("name");
        //忽略访问权限修饰符的安全的检查
        name.setAccessible(true);//暴力反射
        Object value2 = name.get(p);
        System.out.println(value2);
    }
}
