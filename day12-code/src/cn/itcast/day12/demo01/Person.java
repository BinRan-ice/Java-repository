package cn.itcast.day12.demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    直接打印对象的值没有意义，需要重写object类中的toString方法
    打印对象的属性值（name,age）
    */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
    object类的equals方法，默认比较得是两个对象的地址值，没有意义
    所以我们要重写equals方法，比较两个对象的属性（name,age）
    */

    /*@Override
    public boolean equals(Object o) {
        //增加一个判断，传递的参数obj如果是this本身，直接返回true，提高程序的效率
        if (o==this){
            return true;
        }

        //增加一个判断，传递的参数obj如果是null，直接返回false，提高程序的效率
        if (o==null){
            return false;
        }
        //增加一个判断，防止类型转换一次classcastexception
        if (o instanceof Person){
            //使用向下转型，把o转换成为person类型
            Person person=(Person)o;
            //比较两个对象的属性，一个是this，一个是person
            boolean b=this.name.equals(person.name)&&this.age==person.age;
            return b;
        }
        return false;
    }*/

    //getClass() != o.getClass()使用反射技术判断o是否是person类型
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
