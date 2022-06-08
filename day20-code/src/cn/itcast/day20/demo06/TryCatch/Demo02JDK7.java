package cn.itcast.day20.demo06.TryCatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7的新特性
    在try的后边可以增加一个（），在括号中可以定义流对象
    那么这个流对象的作用域就在try（）中有效
    try中的代码执行完毕，会自动的把流对象释放，不用写finally
    格式：
        try(定义流对象；定义流对象...){
            可能会产生异常的代码
        }catch(异常类型 变量名){
            异常处理逻辑
        }
 */
public class Demo02JDK7 {
    public static void main(String[] args) {
        try (//1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
             FileInputStream fis = new FileInputStream("E:\\景点地图.jpg");
             //2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
             FileOutputStream fos = new FileOutputStream("E:\\JAVA\\景点地图.jpg");) {

            //3.使用字节输入流对象中的方法read读取文件
            int len = 0;
            while ((len = fis.read()) != -1) {
                //4.使用字节输出流中的方法write，把读取的字节写入到目的地的文件中
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

