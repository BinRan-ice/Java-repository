package cn.itcast.day05.demo02;

public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        //遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============");

        for (int min=0,max=array.length-1;min<max;min++,max--){
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        }

        //再次打印遍历输出数组后来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
