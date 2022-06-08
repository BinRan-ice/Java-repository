package cn.itcast.day21.demo04.ReverseStream;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Objects;

/*
    FileReader可以读取默认编码格式（UTF-8）的文件
    FileReader读取系统默认编码（中文GBK）会产生乱码
 */
public class Demo01FileReader {
    public static void main(String[] args) {
        /*Integer i1=new Integer(100);
        Integer j1=new Integer(100);
        System.out.println(i1.hashCode());
        System.out.println(j1.hashCode());
        System.out.println(i1==j1);//false

        Integer i2=new Integer(100);
        int j2=100;
        System.out.println(i2==j2);//true

        Integer i3=new Integer(100);
        Integer j3=100;
        System.out.println(i3==j3);//false

        Integer i4=127;
        Integer j4=127;
        System.out.println(i4==j4);//true*/

        /*char c0='a';
        Character c1=new Character('a');
        Character c2=new Character('a');
        System.out.println(c1==c2);
        System.out.println(c0==c1);
        String s1=String.valueOf(c0);
        String s2=String.valueOf(c1);
        int code=(int)c0;
        System.out.println(s1+","+s2+","+code);*/

        /*Boolean t1=new Boolean(false);
        Boolean t2=new Boolean("false");
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));*/

        /*System.out.println('9'=='3'+'6');
        System.out.println(foo()+6+4);
        System.out.println(6+4+foo());
        System.out.println('0'==0);
        System.out.println(6+4+(int)'A');*/

        /*int[] array=new int[]{1,3,2,4};
        changeArray(array);
        System.out.println(Arrays.toString(array));*/

        Object[] o2={0,2,4,3};
        System.out.println((Integer) o2[3]);
    }

    private static void changeArray(int[] array) {
        outter:
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < 2; i1++) {
                if(i<2&&i>=0){
                    array[i]*=2;
                }else{
                    break outter;
                }
            }
        }
    }

    public static String foo(){
        return "foo";
    }
}
