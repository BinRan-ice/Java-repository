package cn.itcast.day20.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
    续写：使用两个参数的构造方法
        FileWriter(File file, boolean append) 根据给定的 File 对象构造一个 FileWriter 对象。
        FileWriter(String fileName, boolean append) 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
        参数：
            File file，String fileName：写入数据的目的地
            boolean append：续写开关 true：不会创建新的文件覆盖源文件，可以续写；false：创建新的文件覆盖源文件
    换行：换行符号
        windows：\r\n
        linux：/n
        Mac：/r
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("E:\\JAVA\\JAVAProgram\\a.txt",true);
        for (int i = 0; i < 20; i++) {
            fw.write("HelloWorld"+i);
            fw.write("\r\n");
        }
        fw.close();
    }
}
