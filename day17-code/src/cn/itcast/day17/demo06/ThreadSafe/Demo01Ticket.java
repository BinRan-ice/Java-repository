package cn.itcast.day17.demo06.ThreadSafe;

import cn.itcast.day17.demo04.runnable.RunnableImpl;

/*
    模拟卖票案例
    创建三个线程，同时开启，对共享的票进行出售
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunableImpl runnable=new RunableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0=new Thread(runnable);
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        //调用start方法，开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
