package cn.itcast.day21.demo06.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    java.io.PrintStream:打印流
        PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式
    PrintStream特点：
        1.只负责数据的输出，不负责数据的读取
        2.与其他输出流不同，PrintStream 永远不会抛出 IOException
        3.有特有的方法：
            void print(任意类型的值)
            void println（任意类型的值并换行）
    构造方法：
        PrintStream(File file) 输出的目的地是一个文件。
        PrintStream(String fileName) 输出的目的地是一个文件路径。
        PrintStream(OutputStream out) 输出的目的地是一个字节输出流。
    PrintStream extends OutputStream
        继承自父类的共性成员方法：
        void close() 关闭此输出流并释放与此流有关的所有系统资源。
        void flush() 刷新此输出流并强制写出所有缓冲的输出字节。
        void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
        void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
        abstract  void write(int b)  将指定的字节写入此输出流。
    注意：
        如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表97->a
        如果使用自己特有的方法print/println方法写数据，写的数据远洋输出97->97
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps=new PrintStream("E:\\JAVA\\JAVAProgram\\a.txt");
        //如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表97->a
        ps.write(97);
        //如果使用自己特有的方法print/println方法写数据，写的数据原样输出97->97
        ps.print(97);
        //释放资源
        ps.close();
    }
}
