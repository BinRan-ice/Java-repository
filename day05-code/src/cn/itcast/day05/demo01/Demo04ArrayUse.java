package cn.itcast.day05.demo01;

public class Demo04ArrayUse {
    public static void main(String[] args) {
        //直接打印数组名称，得到的是数组对应的，内存地址哈希值。
        int[] array={10,20,30};
        System.out.println(array);
        System.out.println(array[0]);

        int num=array[1];
        System.out.println(num);
    }
}
