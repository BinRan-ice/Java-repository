package cn.itcast.day10.demo07;
//键盘就是一个usb设备
public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
