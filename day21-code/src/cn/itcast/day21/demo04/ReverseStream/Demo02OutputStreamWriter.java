package cn.itcast.day21.demo04.ReverseStream;

import java.io.*;

/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter:是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节。(编码：把能看懂的变成看不懂的)

    继承自父类的共性成员方法：
        abstract  void close() 关闭此流，但要先刷新它。
        abstract  void flush() 刷新该流的缓冲。
        void write(char[] cbuf) 写入字符数组。
        abstract  void write(char[] cbuf, int off, int len) 写入字符数组的某一部分。
        void write(int c) 写入单个字符。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分。
    构造方法：
        OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的 OutputStreamWriter。
        OutputStreamWriter(OutputStream out) 创建使用默认字符编码的 OutputStreamWriter。
        参数：
            OutputStream out：字节输出流，可以用来写转换之后的字节到文件中
            String charsetName：指定的编码表名称，不区分大小写，可以是utf-8/UTF-8...不指定默认使用utf-8
    使用步骤：
        1.创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中（编码）
        3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区的字节刷新到文件中（使用字节流写字节的过程）
        4.释放资源
 */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        //write_utf_8();
        write_gbk();
    }

    /*
        使用转换流OutputStreamWriter写gbk格式的文件
     */
    private static void write_gbk() throws IOException {
        //1.创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("E:\\JAVA\\JAVAProgram\\a.txt"),"gbk");
        //2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中（编码）
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();
        //4.释放资源
        osw.close();
    }

    /*
        使用转换流OutputStreamWriter写utf-8格式的文件
     */
    private static void write_utf_8() throws IOException {
        //1.创建一个OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("E:\\JAVA\\JAVAProgram\\a.txt"),"utf-8");
        //2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储到缓冲区中（编码）
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();
        //4.释放资源
        osw.close();
    }
}
