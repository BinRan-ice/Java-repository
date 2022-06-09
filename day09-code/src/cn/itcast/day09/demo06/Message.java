package cn.itcast.day09.demo06;

import java.util.ArrayList;

public class Message {
    public static ArrayList<String> getlist(){
        ArrayList<String>list=new ArrayList<>();
        list.add("0:北京");
        list.add("1:沈阳");
        list.add("2:银川");
        list.add("3:上海");
        list.add("4:澳门");
        list.add("5:成都");
        return list;
    }
    public static ArrayList<String> destlist(){
        ArrayList<String >list1=new ArrayList<>();
        list1.add("0:南京");
        list1.add("1:大连");
        list1.add("2:哈尔滨");
        list1.add("3:长沙");
        list1.add("4:新疆");
        list1.add("5:海口");
        return list1;
    }
    public static ArrayList<String> train(){
        ArrayList<String>list2=new ArrayList<>();
        list2.add("K111");
        list2.add("K222");
        list2.add("K333");
        list2.add("K444");
        list2.add("K555");
        return list2;
    }
    public static ArrayList<String> time(){
        ArrayList<String>list3=new ArrayList<>();
        list3.add("[0]11:30");
        list3.add("[1]24:30");
        list3.add("[2]15:00");
        list3.add("[3]08:40");
        list3.add("[4]02:10");
        list3.add("[5]06:20");
        return list3;
    }
}
