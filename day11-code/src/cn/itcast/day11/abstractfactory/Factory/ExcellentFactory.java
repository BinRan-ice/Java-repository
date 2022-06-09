package cn.itcast.day11.abstractfactory.Factory;

import cn.itcast.day11.abstractfactory.Class.ExcellentCPU;
import cn.itcast.day11.abstractfactory.Class.ExcellentGC;
import cn.itcast.day11.abstractfactory.Class.ExcellentRAM;
import cn.itcast.day11.abstractfactory.interfaces.CPU;
import cn.itcast.day11.abstractfactory.interfaces.GC;
import cn.itcast.day11.abstractfactory.interfaces.RAM;


public class ExcellentFactory extends ComputerFactory {

    @Override

    public CPU createCPU() {

        return new ExcellentCPU();

    }



    @Override

    public RAM createRAM() {

        return new ExcellentRAM();

    }



    @Override

    public GC createGC() {

        return new ExcellentGC();

    }

}