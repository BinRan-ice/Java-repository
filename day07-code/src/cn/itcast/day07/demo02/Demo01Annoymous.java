package cn.itcast.day07.demo02;

public class Demo01Annoymous {
    public static void main(String[] args) {
        Personal one=new Personal();
        one.name="高圆圆";
        one.showName();
        System.out.println("===============");

        new Personal().name="赵又廷";
        new Personal().showName();


    }
}
