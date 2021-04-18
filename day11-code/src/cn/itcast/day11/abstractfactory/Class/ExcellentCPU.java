package cn.itcast.day11.abstractfactory.Class;


import cn.itcast.day11.abstractfactory.interfaces.CPU;

public class ExcellentCPU implements CPU {

    @Override

    public void cpu() {

        System.out.println("配置高性能的CPU");

    }

}
