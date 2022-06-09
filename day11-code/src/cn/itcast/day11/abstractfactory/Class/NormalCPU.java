package cn.itcast.day11.abstractfactory.Class;


import cn.itcast.day11.abstractfactory.interfaces.CPU;

public class NormalCPU implements CPU {

    public void cpu(){

        System.out.println("配置性能一般的CPU");

    }

}
