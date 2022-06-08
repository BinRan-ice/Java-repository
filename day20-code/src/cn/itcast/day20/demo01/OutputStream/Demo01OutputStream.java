package cn.itcast.day20.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.OutputStream:字节输出流
        此抽象类是表示输出字节流的所有类的超类。

    定义了一些子类共性的成员方法：
        void close() 关闭此输出流并释放与此流有关的所有系统资源。
        void flush() 刷新此输出流并强制写出所有缓冲的输出字节。
        void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
        void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
        abstract  void write(int b)  将指定的字节写入此输出流。

    java.io.FileOutputStream extends OutputStream
    FileOutputStream:文件字节输出流
        作用：把内存中的数据写入到硬盘的文件中
    构造方法：
        FileOutputStream(File file)      创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
        FileOutputStream(String name)    创建一个向具有指定名称的文件中写入数据的输出文件流。
        参数：写入数据的目的地
            File file：目的地是一个文件
            String name：目的地是一个文件的路径
        作用：
            1.创建一个FileOutputStream对象
            2.会根据构造方法中传递的文件/文件路径，创建一个空的文件
            3.会把FileOutputStream对象指向创建好的文件

    写入数据的原理（内存-->硬盘）
        iava程序-->JVM(java虚拟机)-->OS-->调用写数据的方法-->把数据写到文件中

    字节输出流的使用步骤（重点）：
        1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        2.调用FileOutputStream对象中的方法write，把数据写入到文件中
        3.释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提高程序的效率）
 */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos=new FileOutputStream("E:\\JAVA\\JAVAProgram\\a.txt");
        //2.调用FileOutputStream对象中的方法write，把数据写入到文件中
        fos.write(97);
        //3.释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提高程序的效率）
        fos.close();
    }
}
