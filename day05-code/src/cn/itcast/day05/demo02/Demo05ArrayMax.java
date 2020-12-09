package cn.itcast.day05.demo02;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array={5,15,35,60,93,24,51,8,10};
        int max=array[0];
        for (int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("最大值："+max);
    }
}
