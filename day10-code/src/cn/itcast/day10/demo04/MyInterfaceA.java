package cn.itcast.day10.demo04;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();
    public default  void methodDefault(){
        System.out.println("AAA");
    }
}
