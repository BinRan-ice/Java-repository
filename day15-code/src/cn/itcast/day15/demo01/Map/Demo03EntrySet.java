package cn.itcast.day15.demo01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合表里的第二种方式：使用Entry对象遍历

    Map集合中的方法：
         Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。
    实现步骤：
    1.使用Map集合中的方法entrySet（），把Map集合中多个Entry对象取出来，存储到一个Set集合中
    2.遍历Set集合，获取每一个Entry对象
    3.使用Entry对象中的方法getkey（）和getvalue（）获取键与值
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        //创建Map集合
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",160);

        //1.使用Map集合中的方法entrySet（），把Map集合中多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        //2.遍历Set集合，获取每一个Entry对象
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> next = it.next();
            //3.使用Entry对象中的方法getkey（）和getvalue（）获取键与值
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"="+value);
        }
    }
}
