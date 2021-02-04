package cn.itcast.day10.demo03;

public interface MyInterfaceA {
    //错误写法，接口不能有静态代码块
    //static{

    //}

    //错误写法！接口不能有构造方法
    //public MyInterfaceA(){

    //}
    public abstract void methodA();
    public abstract void methodAbs();
}
