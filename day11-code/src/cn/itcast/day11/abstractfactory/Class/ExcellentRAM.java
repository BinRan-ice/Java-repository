package cn.itcast.day11.abstractfactory.Class;


import cn.itcast.day11.abstractfactory.interfaces.RAM;

public class ExcellentRAM implements RAM {

    @Override

    public void ram() {

        System.out.println("配置高性能的内存");

    }

}