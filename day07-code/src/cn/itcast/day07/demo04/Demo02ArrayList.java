package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是List，里面装的全是String字符串类型的数据
        ArrayList<String> List=new ArrayList<>();
        System.out.println(List);
        List.add("赵丽颖");
        System.out.println(List);
    }
}
