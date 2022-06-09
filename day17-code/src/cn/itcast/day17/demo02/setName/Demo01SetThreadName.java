package cn.itcast.day17.demo02.setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread thread=new MyThread();
        thread.setName("小强");
        thread.start();

        //开启多线程
        new MyThread("旺财").start();
    }
}
