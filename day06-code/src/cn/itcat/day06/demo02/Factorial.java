package cn.itcat.day06.demo02;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int a,n;
        int sum = 0,sum1=1;
        System.out.println("计算数字的阶乘(1~10)");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        if (a < 1 || a > 10) {
            System.out.println("输入范围不合法退出程序！");
           return;
        }
        else {
            sum = fact(a);
            System.out.println(a + "的阶乘为：" + sum);
            System.out.println("请输入一个整数n");
            Scanner sc2 = new Scanner(System.in);
            n = sc1.nextInt();
            for (int i = 0; i < n; i++) {
                sum1 *=a;
            }
            System.out.println(a+"的"+n+"次方是："+sum1);
        }

    }
    public static int fact(int a) {
        if ( a == 1) {
            return 1;
        } else {
            return fact(a - 1) * a;
        }
    }
}
