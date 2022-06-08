package cn.itcast.day15.demo03.Map;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.HashTable<K,V>集合 implements Map<K,v>接口

    HashTable：底层也是一个哈希表，是一个线程安全的集合，是单线程的集合，速度慢
    HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快

    HashMap集合（之前学的所有集合）：可以存储null值，null值
    HashTable集合，不能存储null值，null键

    Hashtable和Vector集合一样，在jdk1.2版本之后被更先进的集合（hashmap，arraylist）取代了
    HashTable的子类properties依然活跃在历史的舞台
    properties集合是一个唯一和IO流相结合的集合
 */
public class Demo02HashTable {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}

        Hashtable<String,String>table=new Hashtable<>();
        //table.put(null,"a");//NullPointerException
        //table.put("b",null);//NullPointerException
        // table.put(null,null);//NullPointerException
    }
}
