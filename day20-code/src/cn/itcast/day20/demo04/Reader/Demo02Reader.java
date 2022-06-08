package cn.itcast.day20.demo04.Reader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    使用字节流读取中文文件
    1个中文
        GBK：占用两个字节
        UTF-8：占用三个字节
 */
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\JAVA\\JAVAProgram\\a.txt");
        int len=0;
        while ((len=fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();
    }
}
