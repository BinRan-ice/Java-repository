package cn.itcast.day15.demo02.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的：
        作为key的元素，必须重写hashcode方法和equals方法，以保证key唯一
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    /*
         HashMap存储自定义类型键值
         Key:Person类
            person类就必须重写hashcode和equals方法，以保证key唯一
         value:String
            可以重复
     */
    private static void show02() {
        //创建hashmap集合
        HashMap<Person,String>map=new HashMap<>();
        //往集合中添加元素
        map.put(new Person("张三",12),"兰州");
        map.put(new Person("李四",23),"日本");
        map.put(new Person("王五",11),"广州");
        map.put(new Person("赵六",45),"四川");
        map.put(new Person("张三",12),"贵州");
        //使用entrySet和增强for遍历map集合
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }

    /*
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashcode方法和equals方法，可以保证key唯一
        value:Person类型
            value可以重复（同名同年龄的人视为同一个人）
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String,Person>map=new HashMap<>();
        //往集合中添加元素
        map.put("北京",new Person("薛志广",18));
        map.put("南京",new Person("王玉辉",23));
        map.put("上海",new Person("佐助",15));
        map.put("日本",new Person("王思聪",14));
        map.put("银川",new Person("小黑",87));
        //使用keyset、增强for遍历map集合
        Set<String> set = map.keySet();
        for (String s : set) {
            Person person = map.get(s);
            System.out.println(s+"="+person);
        }
    }
}
