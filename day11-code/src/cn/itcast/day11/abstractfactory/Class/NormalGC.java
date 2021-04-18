package cn.itcast.day11.abstractfactory.Class;


import cn.itcast.day11.abstractfactory.interfaces.GC;

public class NormalGC implements GC {

    @Override

    public void gc() {

        System.out.println("配置性能一般的显卡");

    }

}
