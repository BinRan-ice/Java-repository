package cn.itcast.day11.abstractfactory.Class;


import cn.itcast.day11.abstractfactory.interfaces.GC;

public class ExcellentGC implements GC {

    @Override

    public void gc() {

        System.out.println("配置高性能的显卡");

    }

}
