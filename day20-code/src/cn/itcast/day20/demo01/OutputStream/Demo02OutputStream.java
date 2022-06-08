package cn.itcast.day20.demo01.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    一次写多个字节的方法：
         void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
         void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos1=new FileOutputStream("E:\\JAVA\\JAVAProgram\\a.txt");
        //调用write方法
        //在文件中显示HelloWorld
        String s="HelloWorld";
        byte[] bytes = s.getBytes();
        fos1.write(bytes);

        /*
            void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
         */

        fos1.write(bytes,5,5);
        //释放资源
        fos1.close();
    }
}
