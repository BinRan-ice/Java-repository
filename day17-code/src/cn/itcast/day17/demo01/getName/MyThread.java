package cn.itcast.day17.demo01.getName;
/*
    获取线程的名称：
        1.使用Thread类中的方法getName()
            String getName() 返回该线程的名称。
        2.可以先获取到当前正在执行的线程，使用线程中的方法getName（）获取线程的名称
            static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
//定义一个thread类的子类
public class MyThread extends Thread{
    //重写Thread类中的run方法，设置线程任务

    @Override
    public void run() {
        //获取线程的名称
        //String name = getName();
        //System.out.println(name);

        Thread thread = MyThread.currentThread();
        System.out.println(thread);
        System.out.println(MyThread.currentThread().getName());
    }
}
