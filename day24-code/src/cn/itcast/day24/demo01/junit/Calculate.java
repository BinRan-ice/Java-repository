package cn.itcast.day24.demo01.junit;

public class Calculate {
    public static void main(String[] args) {
        int add = add(2, 3);
        System.out.println(add);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
}
