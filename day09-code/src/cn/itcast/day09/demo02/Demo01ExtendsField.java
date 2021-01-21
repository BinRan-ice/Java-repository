package cn.itcast.day09.demo02;
/*
在子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：
直接通过子类对象访问成员变量
    等号左边是谁，就优先用谁，没有则向上找
间接通过成员方法访问成员变量
    该方法属于谁，就优先用谁，没有则向上找
*/
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu=new Fu();
        System.out.println(fu.numFu);//10
        System.out.println("=============");

        Zi zi=new Zi();
        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20
        System.out.println("=============");

        System.out.println(zi.num);//200
        System.out.println("=============");

        zi.methodZi();//200
        zi.methodFu();;//100
    }
}
