package cn.itcast.day12.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
练习：
使用日期相关的API，计算一个人已经出生了多少天
分析：
1.使用scanner类中的方法next，获取出生日期
2.使用DateFormat类中的方法parse，把字符串的出生日期，解析为Date格式的出生日期
3.把Date格式的出生日期转换为ms值
4.获取当前的日期，转换为毫秒值
5.使用当前日期的毫秒值-出生日期的毫秒值
6.把毫秒值转换为天
*/
public class Demo04Test {
    public static void main(String[] args) throws ParseException {
        String t;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的出生日期（格式：2000年12月1日）");
        t=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年M月d日");
        Date date = sdf.parse(t);
        long time = date.getTime();
        Date date1=new Date();
        long time1 = date1.getTime();
        long sub=(time1/86400000)-(time/86400000);
        System.out.println("你已经出生："+sub+"天");
    }

}
