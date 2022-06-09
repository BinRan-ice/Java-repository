package cn.itcast.day17.demo01.getName;
/*
    线程的名称：
        主线程：main
        新线程：Thread-0，Thread-1...
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建thread类的子类对象
        MyThread thread=new MyThread();
        //调用start方法，开启新的线程，执行run方法
        thread.start();
    }
}
