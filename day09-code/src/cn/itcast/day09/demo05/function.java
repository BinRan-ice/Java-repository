package cn.itcast.day09.demo05;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        int x;
        double r,r1,l,w,s1,s2,s3;
        String str1,str2,str3;
        System.out.println("1.圆形");
        System.out.println("2.三角形");
        System.out.println("3.矩形");
        System.out.println("4.结束程序");
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        while (true){
            System.out.println("请选择你要计算的图形：");
            x=sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("请输入一个圆（半径）");
                    r=sc.nextDouble();
                    Circle cl=new Circle(r);
                    str1=cl.toString();
                    System.out.println(str1);
                    cl.Area();
                    cl.Lang();
                    System.out.println("请再输入一个圆的半径：");
                    r1=sc.nextDouble();
                    Circle cl2=new Circle(r1);
                    str1=cl2.toString();
                    System.out.println(str1);
                    cl2.Area();
                    cl2.Lang();
                    System.out.println("两个圆的面积大小为：");
                    break;
                case 2:
                    System.out.println("请输入一个三角形（边，边，边）");
                    s1=sc.nextDouble();
                    s2=sc1.nextDouble();
                    s3=sc2.nextDouble();
                    triangle tri=new triangle(s1,s2,s3);
                    str2=tri.toString();
                    System.out.println(str2);
                    tri.Area();
                    tri.Lang();
                    break;
                case 3:
                    System.out.println("请输入一个矩形（长，宽）");
                    l=sc.nextDouble();
                    w=sc.nextDouble();
                    Rectangle rect=new Rectangle(l,w);
                    str3= rect.toString();
                    System.out.println(str3);
                    rect.Area();
                    rect.Lang();
                    break;
                default:
                    return;
            }
        }
    }
}
