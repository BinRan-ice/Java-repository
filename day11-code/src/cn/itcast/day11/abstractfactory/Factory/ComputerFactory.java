package cn.itcast.day11.abstractfactory.Factory;


import cn.itcast.day11.abstractfactory.interfaces.CPU;
import cn.itcast.day11.abstractfactory.interfaces.GC;
import cn.itcast.day11.abstractfactory.interfaces.RAM;

public abstract class ComputerFactory {

    //配置CPU

    public abstract CPU createCPU();

    //配置内存

    public abstract RAM createRAM();

    //配置显卡

    public abstract GC createGC();

}
