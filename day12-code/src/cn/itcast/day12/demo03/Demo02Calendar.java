package cn.itcast.day12.demo03;

import java.util.Calendar;
import java.util.Date;

/*
Calendar类的常用成员方法:
public int get(int field) 返回给定日历字段的值。
public void set(int field, int value) 将给定的日历字段设置为给定值。
public abstract  void add(int field, int amount) 根据日历的规则，为给定的日历字段添加或减去指定的时间量。
public Date getTime() 返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
成员方法的参数：
int field:日历类的字段，可以使用Calendar类的静态成员变量获取

*/
public class Demo02Calendar {
    public static void main(String[] args) {
        demo04();
    }

    /*
     public Date getTime() 返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。
     把日历对象转换为日期对象
    */
    private static void demo04() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }

    /*
     public abstract  void add(int field, int amount) 根据日历的规则，为给定的日历字段添加或减去指定的时间量。
     把指定的字段增加\减少指定的值
     参数：
        int field：传递指定的日历字段（YEAR,MONTH...）
        int amount：增加\减少指定的值
            正数：增加
            负数：减少
    */
    private static void demo03() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        //把年增加两年
        c.add(Calendar.YEAR,2);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    /*
     public void set(int field, int value) 将给定的日历字段设置为给定值。
     参数：
        int field：传递指定的日历字段（YEAR,MONTH...）
        int value:给指定字段设置的值
    */
    private static void demo02() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        //设置年为9999年
        c.set(Calendar.YEAR,9999);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    /*
     public int get(int field) 返回给定日历字段的值。
     参数：传递指定的日历字段（YEAR,MONTH...）
     返回值：日历字段代表的具体的值
    */
    private static void demo01() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }
}
