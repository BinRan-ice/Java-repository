package cn.itcast.day12.demo04;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }

    /*
    public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length):将数组中指定的数据拷贝到另一个数组中
    参数：
    src - 源数组。
    srcPos - 源数组中的起始位置。
    dest - 目标数组。
    destPos - 目标数据中的起始位置。
    length - 要复制的数组元素的数量。
    练习：
    将src数组中前三个元素，复制到dest数组的前三个位置上，复制元素前：
    src数组元素[1,2,3,4,5],dest数组元素[6,7,8,9,10]
    复制元素后:
    src数组元素[1,2,3,4,5,6]，dest数组元素[1,2,3,9,10]
    */
    private static void demo02() {
        //定义原数组
        int[] src={1,2,3,4,5};
        //定义目标数组
        int[] dest={6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(dest));
        //使用System类中的arraycopy把源数组的前三个元素复制到目标数组的前三个位置上
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));
    }

    /*
    public static long currentTimeMillis():返回以毫秒为单位的当前时间
    用来测试程序的效率
    验证for循环打印数字1-9999所需要的时间（ms）
    */
    private static void demo01() {
        //程序执行前获取一次毫秒值
        long s = System.currentTimeMillis();
        for (int i =1; i <= 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时"+(e-s)+"ms");
    }
}
