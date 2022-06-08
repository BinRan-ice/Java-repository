package cn.itcast.day16.demo04.Exception;

import java.util.List;

/*
    异常的注意事项
 */
public class Demo01Exception {
    /*
        多个异常使用捕获该如何处理呢？
            1.多个异常分别处理
            2.多个异常一次捕获，多次处理
            3.多个异常一次捕获一次处理
     */
    public static void main(String[] args) {
        //1.多个异常分布处理
        /*try {
            int[] arr={1,2,3};
            System.out.println(arr[3]);//.ArrayIndexOutOfBoundsException: Index 3
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        try{
            List<Integer> integers = List.of(1, 2, 3);
            System.out.println(integers.get(3));//ArrayIndexOutOfBoundsException: Index 3
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }*/

        //2.多个异常一次捕获，多次处理
      /*  try {
            int[] arr={1,2,3};
            System.out.println(arr[3]);//.ArrayIndexOutOfBoundsException: Index 3
            List<Integer> integers = List.of(1, 2, 3);
            System.out.println(integers.get(3));//ArrayIndexOutOfBoundsException: Index 3
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }*/
        /*
            一个try多个catch注意事项：
                1.catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面，否则就会报错
         */

        //多个异常一次捕获一次处理
        try {
            int[] arr={1,2,3};
            System.out.println(arr[3]);//.ArrayIndexOutOfBoundsException: Index 3
            List<Integer> integers = List.of(1, 2, 3);
            System.out.println(integers.get(3));//ArrayIndexOutOfBoundsException: Index 3
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
