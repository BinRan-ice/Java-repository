package cn.itcast.day20.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其它方法：
        void write(char[] cbuf) 写入字符数组。
        abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分。
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("E:\\JAVA\\JAVA 程序\\a.txt");
        //void write(char[] cbuf) 写入字符数组。
        char[] cs={'a','b','c','d','e'};
        fw.write(cs);//abcde
        //abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。
        fw.write(cs,1,3);
        //void write(String str) 写入字符串。
        fw.write("HelloWorld");
        //void write(String str, int off, int len) 写入字符串的某一部分。
        fw.write("HelloWorld",2,3);
        fw.close();
    }
}
