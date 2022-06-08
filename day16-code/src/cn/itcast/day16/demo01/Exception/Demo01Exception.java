package cn.itcast.day16.demo01.Exception;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类是 Java 语言中所有错误或异常的超类。
        Exception:编译期异常，进行编译java程序出现的异常
        RuntimeException：运行期异常，java程序运行过程中出现的异常
            异常就相当于程序的了一个小毛病（感冒，发烧)把异常处理掉，程序可以继续执行
        Error:错误
            错误就相当于程序得了一个无法自愈的毛病（艾滋病），必须修改源代码，程序才能继续执行

 */
public class Demo01Exception {
    public static void main(String[] args){
        /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//格式化日期
        Date date = null;//把字符串格式的日期解析为date格式的日期
        try {
            date = sdf.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/

        // RuntimeException：运行期异常，java程序运行过程中出现的异常
        int[] array={1,2,3};
        try{
            //可能会出现的异常代码
            System.out.println(array[3]);
        }catch (Exception e){
            //异常的处理逻辑
            System.out.println(e);
        }
        System.out.println(array[0]);
        System.out.println("后续代码");

        //Error:错误
        //必须修改代码，才能解决问题
        //int[] arr=new int[1024*1024*1024];//OutOfMemoryError 内存溢出的错误
    }
}
