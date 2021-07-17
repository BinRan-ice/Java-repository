package cn.itcast.day15.demo01.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarOutputStream;

/*
    java.util.Map<k,v>集合
    Map集合的特点：
        1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
        2.Map集合中的元素，key和value的数据元素可以相同，也可以不同
        3.Map集合中的元素，key是不允许重复的，value是可以重复的
        4.Map集合中的元素，key和value是一一对应的
    java.util.HashMap<k,v>集合 implements Map<k,v>
    HashMap特点：
            1.HashMap集合底层是哈希表，查询的速度特别快
            2.HashMap是一个无序的集合，存储元素和取出元素的顺序可能不一致
    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap的特点：
        1.linkedHashMap集合底层是哈希表+链表（保证迭代的顺序）;
        2.linkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
        show02();
    }

    /*
         boolean containsKey(Object key) 如果此映射包含指定键的映射关系，则返回 true。
            包含返回true，不包含返回false
     */
    private static void show04() {
        //创建map集合
        Map<String,Integer>map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",160);

        boolean b1 = map.containsKey("赵丽颖");
        System.out.println(b1);

        boolean b2 = map.containsKey("赵颖");
        System.out.println(b2);
    }

    /*
        V get(Object key) 返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
            返回值：
                Key存在，返回对应的value值
                key不存在，返回null
     */
    private static void show03() {
        //创建map集合
        Map<String,Integer>map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",160);

        Integer v1 = map.get("杨颖");
        System.out.println(v1);

        Integer v2 = map.get("马尔扎哈");
        System.out.println(v2);
    }

    /*
         V remove(Object key) 如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
            返回值：V
            key存在，v返回被删除的值
            key不存在，v返回null
     */
    private static void show02() {
        //创建map集合
        Map<String,Integer>map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",160);
        map.put("上面三个都是猪",177);
        System.out.println(map);

        Integer v1 = map.remove("林志玲");
        System.out.println(v1);

        System.out.println(map);

        //int v2 = map.remove("林志颖");//自动拆箱   NullPointerException
        Integer v2 = map.remove("林志颖");
        System.out.println(v2);
    }

    /*
         V put(K key, V value) 将指定的值与此映射中的指定键关联（可选操作）。
         返回值：v
            存储键值对的时候，key不重复，返回值v是null
            存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值
     */
    private static void show01() {
        //创建map集合对象
        Map<String,String>map=new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:"+v1);//v1:null

        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:"+v2);//v2:范冰冰1

        System.out.println(map);//{李晨=范冰冰2}

        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        map.put("尹志平","小龙女");
        System.out.println(map);
    }
}
