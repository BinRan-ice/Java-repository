package cn.itcast.day10.demo04;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default  void methodDefault(){
        System.out.println("BBB");
    }
}
