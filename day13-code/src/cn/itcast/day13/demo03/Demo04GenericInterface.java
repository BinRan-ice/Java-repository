package cn.itcast.day13.demo03;
/*
测试含有泛型的接口
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl对象
        GenericInterfaceImpl impl=new GenericInterfaceImpl();
        impl.method("我是一个字符串");

        //创建GenerInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> impl2=new GenericInterfaceImpl2();
        impl2.method(123456);
        GenericInterfaceImpl2<Double> impl3=new GenericInterfaceImpl2<>();
        impl3.method(12.34);
    }
}
