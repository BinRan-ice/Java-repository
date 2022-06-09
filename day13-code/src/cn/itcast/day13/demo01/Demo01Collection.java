package cn.itcast.day13.demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
java.util.Collection接口
    所有单列集合的最顶层的接口，里边定义了所有单列结合共性的方法
    任意的单列集合都可以使用Collection接口中的方法

    共性的方法：
    public boolean add(E e):把给定的对象添加到当前集合中 。
    public void clear() :清空集合中所有的元素。
    public boolean remove(E e):把给定的对象在当前集合中删除。
    public boolean contains(E e): 判断当前集合中是否包含给定的对象。
    public boolean isEmpty(): 判断当前集合是否为空。
    public int size(): 返回集合中元素的个数。
    public object[] toArray(): 把集合中的元素，存储到数组中。
*/
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String>coll=new ArrayList<>();
        System.out.println(coll);//重写了toString方法 []

        boolean b1 = coll.add("张飞");
        System.out.println("b1:"+b1);
        System.out.println(coll);
        coll.add("李逵");
        coll.add("沙和尚");
        coll.add("狄仁杰");
        coll.add("武则天");
        System.out.println(coll);//[张飞, 李逵, 沙和尚, 狄仁杰, 武则天]

        boolean b2 = coll.remove("李逵");
        System.out.println("b2:"+b2);
        boolean b3 = coll.remove("张三");
        System.out.println("b3:"+b3);
        System.out.println(coll);

        boolean b4 = coll.contains("张飞");
        System.out.println("b4"+b4);
        boolean b5 = coll.contains("李四");
        System.out.println("b5"+b5);

        boolean b6 = coll.isEmpty();//判断当前集合是否为空。集合为空返回true，集合不为空返回false
        System.out.println("b6"+b6);

        int size = coll.size();
        System.out.println(size);

        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        coll.clear();//清空集合中的所有元素，但是不删除集合，集合还存在。
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}
