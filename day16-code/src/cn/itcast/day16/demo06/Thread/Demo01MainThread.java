package cn.itcast.day16.demo06.Thread;
/*
    主线程：执行主（main）方法的线程
    单线程程序：java程序中只有一个线程
    程序从main方法开始，从上到下依次执行
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1=new Person("小强");
        p1.run();
        System.out.println(0/0);
        Person p2=new Person("旺财");
        p2.run();
    }
}
