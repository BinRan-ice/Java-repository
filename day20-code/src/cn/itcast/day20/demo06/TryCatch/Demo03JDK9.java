package cn.itcast.day20.demo06.TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK9新特性
    try前面可以定义流对象
    在try后边的（）可以直接引入流对象的名称（变量名）
    在try代码执行完毕后，流对象也可以释放掉，不用写finally
    格式：
        A a=new A();
        B b=new B();
        try(a,b){
           可能会产生异常的代码
        }catch(异常类型 变量名){
            异常处理逻辑
        }
 */
public class Demo03JDK9 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis=new FileInputStream("E:\\景点地图.jpg");
        //2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos=new FileOutputStream("E:\\JAVA\\景点地图.jpg");
       try(fis;fos){
           //3.使用字节输入流对象中的方法read读取文件
           int len=0;
           while ((len=fis.read())!=-1){
               //4.使用字节输出流中的方法write，把读取的字节写入到目的地的文件中
               fos.write(len);
           }
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
