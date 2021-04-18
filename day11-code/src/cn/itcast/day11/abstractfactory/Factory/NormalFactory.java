package cn.itcast.day11.abstractfactory.Factory;


import cn.itcast.day11.abstractfactory.Class.*;
import cn.itcast.day11.abstractfactory.Class.NormalCPU;
import cn.itcast.day11.abstractfactory.Class.NormalGC;
import cn.itcast.day11.abstractfactory.Class.NormalRAM;
import cn.itcast.day11.abstractfactory.interfaces.CPU;
import cn.itcast.day11.abstractfactory.interfaces.GC;
import cn.itcast.day11.abstractfactory.interfaces.RAM;


public class NormalFactory extends ComputerFactory {

    @Override

    public CPU createCPU() {

        return new NormalCPU();

    }



    @Override

    public RAM createRAM() {

        return new NormalRAM();

    }



    @Override

    public GC createGC() {

        return new NormalGC();

    }

}