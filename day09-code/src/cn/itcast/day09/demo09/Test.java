package cn.itcast.day09.demo09;

import java.util.Arrays;
public class Test
{
    public static void main(String[] args)
    {
        ComparableCircle b1=new ComparableCircle("圆形",5);
        ComparableCircle b2=new ComparableCircle("圆形",9);
        ComparableCircle b3=new ComparableCircle("圆形",7);
        ComparableTriangle c1=new ComparableTriangle("三角形",5,6,7);
        ComparableTriangle c2=new ComparableTriangle("三角形",3,4,5);
        ComparableTriangle c3=new ComparableTriangle("三角形",6,7,8);
        GeometricObject a1=new Circle("圆形",5);
        GeometricObject a2=new Circle("圆形",1);
        GeometricObject a3=new Rectangle("矩形",5,6);
        GeometricObject a4=new Rectangle("矩形",3,7);
        GeometricObject a5=new Triangle("三角形",3,4,5);
        GeometricObject a6=new Triangle("三角形",6,8,10);
        ComparableCircle[] Brr={b1,b2,b3};
        ComparableTriangle[] Crr={c1,c2,c3};
        GeometricObject[] Arr={a1,a2,a3,a4,a5,a6};
        System.out.println("--------------------Circle未排序------------------");
        for(int i=0;i<3;i++)
        {
            System.out.println(Brr[i].toString()+"      面积为："+Brr[i].getArea());
        }
        System.out.println("-------------------Circle已排序------------------------");
        Arrays.sort(Brr);
        for(int i=0;i<3;i++)
        {
            System.out.println(Brr[i].toString()+"      面积为："+Brr[i].getArea());
        }
        System.out.println("");
        System.out.println("-------------------Triangle未排序---------------------------");
        for(int i=0;i<3;i++)
        {
            System.out.println(Crr[i].toString()+"      面积为："+Crr[i].getArea());
        }
        System.out.println("-------------------Triangle已排序------------------------");
        Arrays.sort(Crr);
        for(int i=0;i<3;i++)
        {
            System.out.println(Crr[i].toString()+"      面积为："+Crr[i].getArea());
        }
        System.out.println("");
        System.out.println("------------------所有图形未排序-------------------------------");
        for(int i=0;i<6;i++)
        {
            System.out.println(Arr[i].toString()+"      面积为："+Arr[i].getArea());
        }
        System.out.println("-----------------所有图形已排序--------------------------");
        Arrays.sort(Arr,new AreaComparator());
        for(int i=0;i<6;i++)
        {
            System.out.println(Arr[i].toString()+"      面积为："+Arr[i].getArea());
        }

    }
}