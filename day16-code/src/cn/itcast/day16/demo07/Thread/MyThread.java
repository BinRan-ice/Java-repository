package cn.itcast.day16.demo07.Thread;
//1.创建一个thread类的子类
public class MyThread extends Thread{
    //2.在thread类的子类中重写thread类中的run方法，设置线程任务（开启线程）
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }
    }
}
