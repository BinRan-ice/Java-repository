package cn.itcast.day10.demo07;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    public void useDevice(USB usb){
        usb.open();//打开设备
        if (usb instanceof Mouse){
            Mouse mouse=(Mouse)usb;//向下转型
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard)usb;//向下转型
            keyboard.type();
        }
        usb.close();//关闭设备
    }
}
