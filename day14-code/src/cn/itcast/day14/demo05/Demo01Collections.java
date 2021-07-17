package cn.itcast.day14.demo05;

import java.util.ArrayList;
import java.util.Collections;

/*
    static <T> boolean addAll(Collection<? super T> c, T... elements) 将所有指定元素添加到指定 collection 中。
    static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        //往集合中添加多个元素
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);

        //打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
