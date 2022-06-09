package cn.itcast.day15.demo01.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的·第一种遍历方式：通过键找值的方法
    Map集合中的方法：
         Set<K> keySet() 返回此映射中包含的键的 Set 视图。
    实现步骤：
        1.使用Map集合中的方法keyset（），把Map集合所有的键取出来，存取到一个set集合当中
        2.遍历set集合，获取Map集合中的每一个键
        3.通过Map集合中的方法get（Key），通过key找到value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        //创建Map集合
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",160);

        //1.使用Map集合中的方法keyset（），把Map集合所有的键取出来，存取到一个set集合当中
        Set<String> set = map.keySet();

        // 2.遍历set集合，获取Map集合中的每一个键
        for (String s : set) {
            //3.通过Map集合中的方法get（Key），通过key找到value
            Integer value = map.get(s);
            System.out.println(s+"="+value);
        }
    }
}
