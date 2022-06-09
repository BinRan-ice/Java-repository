package cn.itcast.day15.demo04.JDK9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    JDK9的新特性：
        list接口，set接口，map接口，里面增加了一个静态的方法of，可以给集合一次性添加多个元素
        static <E> list<E> of(E...elements)
        使用前提：
            当集合中存取的元素的个数已经确定了，不在改变时使用
        注意：
            1.of方法只适用于list接口，set接口，map接口（不适用于接口的实现类）
            2.of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常
            3.set接口和map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常
 */
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> a = List.of("a", "b", "c");
        System.out.println(a);//[a, b, c]
        //a.add("w");//UnsupportedOperationException

        //Set<String> a1 = Set.of("a", "b", "a", "c", "d");//IllegalArgumentException 非法参数异常，有重复的元素
        Set<String> a1 = Set.of("a", "b","c", "d");
        System.out.println(a1);

        Map<String, Integer> a2 = Map.of("张三", 18, "李四", 15, "王五", 19);
        System.out.println(a2);
    }
}
