package cn.itcat.day06.demo02;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        float x;
        double y;
        double sum;
        Scanner sc1=new Scanner(System.in);
        x=sc1.nextFloat();
        Scanner sc2=new Scanner(System.in);
        y=sc2.nextDouble();
        sum=x+y;
        System.out.println(String.format("%.2f",sum));

    }
}
