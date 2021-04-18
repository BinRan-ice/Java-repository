package cn.itcast.day11.abstractfactory.Class;


import cn.itcast.day11.abstractfactory.Factory.ComputerFactory;
import cn.itcast.day11.abstractfactory.Factory.ExcellentFactory;
import cn.itcast.day11.abstractfactory.Factory.NormalFactory;

public class Test {

    public static void main(String[] args) {

        //构造一个生产一般电脑的工厂

        ComputerFactory normal = new NormalFactory();

        System.out.println("配置性能一般的电脑。。。");

        normal.createCPU().cpu();

        normal.createRAM().ram();

        normal.createGC().gc();



        System.out.println("\n-----这是一条分割线-----\n");



        //构造一个生产高性能电脑的工厂

        System.out.println("配置高性能的电脑。。。");

        ComputerFactory excellent = new ExcellentFactory();

        excellent.createCPU().cpu();

        excellent.createRAM().ram();

        excellent.createGC().gc();

    }

}
