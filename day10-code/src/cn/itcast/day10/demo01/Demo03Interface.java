package cn.itcast.day10.demo01;
/*
注意：不能通过接口实现类的对象调用接口当中的静态方法。
正确方法：通过接口名称，直接调用其中的静态方法
格式：
接口名称.静态方法名（参数）;
*/
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl=new MyInterfaceStaticImpl();
        //错误写法
        //impl.methodStatic();

        //直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
