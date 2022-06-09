package cn.itcast.day20.demo02.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream:字节输入流
        此抽象类是表示字节输入流的所有类的超类。
    定义了所有子类共性的方法：
           abstract  int read()从输入流中读取数据的下一个字节。
           int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
           int read(byte[] b, int off, int len)将输入流中最多 len 个数据字节读入 byte 数组。
           void close() 关闭此输入流并释放与该流关联的所有系统资源。

    java.io.FileInputStream extends InputStream
    FileInputStream:文件字节输入流
        作用：把硬盘文件中的数据，读取到内存中使用

    构造方法：
        FileInputStream(String name)通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
        FileInputStream(File file) 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
        参数：读取文件的数据源
            String name：文件的路径
            File file：文件
        构造方法的作用：
            1.会创建一个FileInputStream对象
            2.会把FileInputStream对象指向构造方法中要读取的文件

    读取数据的原理（硬盘-->内存）
        java程序-->JVM-->OS-->读取数据的方法-->读取文件

    字节输入流的使用步骤：
        1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        2.使用FileInputStream对象中的方法read，读取文件
        3.释放资源

 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis1=new FileInputStream("E:\\JAVA\\JAVAProgram\\a.txt");
        //2.使用FileInputStream对象中的方法read，读取文件
        int len=0;//记录读取到的字节

        /*
            布尔表达式(len=fis1.read())!=-1
                1.fis1.read()：读取一个字节
                2.len=fis1.read():把读取到的字节赋值给变量len
                3.(len=fis1.read())!=-1：判断变量len是否不等于-1
         */
        while ((len=fis1.read())!=-1){
            System.out.println((char)len);
        }
        //3.释放资源
        fis1.close();
    }
}
