package cn.itcast.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个笔记本电脑
        Computer computer=new Computer();
        computer.powerOn();
        //准备一个鼠标，供电脑使用
        Mouse mouse=new Mouse();
        //首先进行向上转型
        USB usbmouse=mouse;
        computer.useDevice(usbmouse);

        //创建一个USB键盘
        Keyboard keyboard=new Keyboard();//没有使用多态写法
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);
        computer.useDevice(new Keyboard());
        computer.powerOff();
        System.out.println("====================");

        method(10.0);//double-->double
        method(10);//int-->double
    }

    public static void method(double num){
        System.out.println(num);
    }
}
