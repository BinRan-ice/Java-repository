package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String >listA=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);
        int num = list.get(1);
        System.out.println("第一号元素是"+num);

    }
}
