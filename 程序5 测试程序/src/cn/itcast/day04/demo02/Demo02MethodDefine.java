package cn.itcast.day04.demo02;


public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        Sum(10, 20);
        System.out.println("===========");

        //打印调用
        System.out.println(Sum(10, 20));
        System.out.println("===========");

        //赋值调用
        int number = Sum(15, 25);
        System.out.println("变量的值为："+number);
    }

    public static int Sum(int a, int b) {
        System.out.println("方法执行了！！！");
        int sum = a + b;
        return sum;
    }
}