package cn.itcast.day20.demo03.CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制的练习：一读一写
        明确：
            数据源
            数据目的地

    文件复制的步骤：
        1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write，把读取的字节写入到目的地的文件中
        5.释放资源
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        //1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis=new FileInputStream("E:\\景点地图.jpg");
        //2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos=new FileOutputStream("E:\\JAVA\\景点地图.jpg");
        //3.使用字节输入流对象中的方法read读取文件
        int len=0;
        while ((len=fis.read())!=-1){
            //4.使用字节输出流中的方法write，把读取的字节写入到目的地的文件中
            fos.write(len);
        }
        //5.释放资源
        fos.close();
        fis.close();
    }
}
