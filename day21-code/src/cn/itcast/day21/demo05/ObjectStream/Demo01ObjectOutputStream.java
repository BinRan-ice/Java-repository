package cn.itcast.day21.demo05.ObjectStream;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream:对象的序列化流
    作用：把对象以流的方式写入到文件中保存

    构造方法：
        ObjectOutputStream(OutputStream out) 创建写入指定 OutputStream 的 ObjectOutputStream。
        参数：
            OutputStream out：字节输出流
    特有的成员方法：
        void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream。

    使用步骤：
        1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        2.使用ObjectOutputStream对象中的方法writerObject，把对象写入到文件中
        3.释放资源
 */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\JAVA\\JAVAProgram\\a.txt"));
        //2.使用ObjectOutputStream对象中的方法writerObject，把对象写入到文件中JAVA 程序
        oos.writeObject(new Person("李腾蛟",100));
        //3.释放资源
        oos.close();
    }
}
