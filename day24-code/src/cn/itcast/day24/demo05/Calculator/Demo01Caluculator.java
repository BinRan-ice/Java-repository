package cn.itcast.day24.demo05.Calculator;
/**
 * 小明定义的计算器类
 */
public class Demo01Caluculator {
    //加法
    @Demo01Check
    public void add(){
        System.out.println("1+0="+(1+0));
    }
    //减法
    @Demo01Check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }
    //乘法
    @Demo01Check
    public void mul(){
        System.out.println("1*0="+(1*0));
    }
    //除法
    @Demo01Check
    public void div(){
        System.out.println("1/0="+(1/0));
    }

    public void show(){
        System.out.println("永无bug....");
    }
}
