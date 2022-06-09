package cn.itcast.day16.demo01.Exception;
/*
    异常产生过程解析（分析异常是怎么产生的，如何处理异常）

 */
public class Demo02Exception {
    public static void main(String[] args) {
        //创建int类型的数组，并赋值
        int[] arr={1,2,3,4,5,6,7,8,2,4,2,4,4,54,5,56,56,5};
        int e=getElement(arr,0);
        System.out.println(e);
    }
    /*
        定义一个方法，获取指定索引处的元素
     */
    public static int getElement(int[] arr,int index){
        int ele=arr[index];
        return ele;
    }
}
