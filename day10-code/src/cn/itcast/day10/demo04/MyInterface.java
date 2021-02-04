package cn.itcast.day10.demo04;
/*
这个子接口当中有几个方法？ 四个
methodA 来源于接口A
methodB 来源于接口B
methodCommon 同时来源于接口A和B
method 来源于我自己
*/
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
