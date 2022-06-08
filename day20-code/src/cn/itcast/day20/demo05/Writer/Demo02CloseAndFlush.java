package cn.itcast.day20.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    flush方法和Close方法的区别
        flush：刷新缓冲区，流对象可以继续使用
        close：先刷新缓冲区，然后通知系统释放资源，流对象不可以在使用了。
 */
public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fw=new FileWriter("E:\\JAVA\\JAVAProgram\\a.txt");
        //2.使用FileWriter的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
        fw.write(97);
        //3.使用FileWriter的方法flush，把内存缓冲区的数据，刷新到文件中
        fw.flush();
        //刷新之后流可以继续使用
        fw.write(98);
        //4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
        fw.close();
    }
}
