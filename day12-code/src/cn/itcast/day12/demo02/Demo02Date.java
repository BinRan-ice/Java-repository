package cn.itcast.day12.demo02;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
    }

    /*
    long gettime()  把日期转换为毫秒
        返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
    */
    private static void demo03() {
        Date date=new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    /*
    Date类的带参数构造方法
    Date(long date):传递毫秒值，把毫秒值转换成为Date日期
    */
    private static void demo02() {
        Date date=new Date(0l);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970

        date=new Date(1605074956402l);
        System.out.println(date);
    }

    /*
    Date类的空参数构造方法
    Date()获取当前系统的日期和时间
    */
    private static void demo01() {
        Date date=new Date();
        System.out.println(date);
    }
}
