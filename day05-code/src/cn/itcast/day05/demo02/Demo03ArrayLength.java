package cn.itcast.day05.demo02;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA=new int[3];
        int[] arrayB={1,2,3,4,5,6,7,8,9,10};
        System.out.println(arrayB.length);
        System.out.println("==============");

        int[] arrayC= new int[3];
        System.out.println(arrayC.length);
        arrayC=new int[5];
        System.out.println(arrayC.length);
    }
}
