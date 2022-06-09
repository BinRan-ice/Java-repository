package cn.itcat.day06.demo02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重和身高");
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        System.out.println("BMI指数为:");
        System.out.println(BMI(w,h));
    }
    public static double BMI(double weight, double high) {
        return weight/(high*high);
    }

}