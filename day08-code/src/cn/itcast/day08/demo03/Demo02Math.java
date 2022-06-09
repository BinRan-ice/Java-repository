package cn.itcast.day08.demo03;
/*
public static double abs(double num):获取绝对值
Public static double ceil(double num):向上取整
public static double floor(double num):向下取整
public static long round(double num):四舍五入
Math.PI代表近似的圆周率常量
*/
public class Demo02Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(-2.5));
        System.out.println("===============");

        //向上取整
        System.out.println(Math.ceil(3.9));

        //向下取整
        System.out.println(Math.floor(3.9));

        //四舍五入
        System.out.println(Math.round(20.4));
    }
}
