package cn.itcast.day05.demo01;

public class Demo03Array {
    public static void main(String[] args) {
        //省略格式静态初始化
        int[] arrayA={1,2,3};
        //静态初始化的标准格式，可以拆分成为两个步骤
        int[] arrayB;
        arrayB=new int[] {1,2,3};

        //动态初始化也可以拆分为两个步骤
        int[] arrayC;
        arrayC =new int [5];
    }
}
