package cn.itcast.day13.demo03;

public class Demo03GenericMethod {
    public static void main(String[] args) {
            //创建一个GenericMethod对象
        GenericMethod gm=new GenericMethod();
        /*
        调用含有泛型的方法method
        传递什么类型，泛型就是什么类型
         */
        gm.method(10);
        gm.method(true);
        gm.method(8.8);

        gm.method2("静态方法不建议创建对象使用");

        //静态方法，通过类名.方法名（参数）可以直接使用
        GenericMethod.method2(123344);
    }
}
