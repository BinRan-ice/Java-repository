package cn.itcast.day10.demo07;
//鼠标就是一个usb设备
public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("点击鼠标");
    }
}
