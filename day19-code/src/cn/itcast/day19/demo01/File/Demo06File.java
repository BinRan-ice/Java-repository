package cn.itcast.day19.demo01.File;

import java.io.File;

/*
File类遍历（文件夹）目录功能
    String[] list() 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
    File[] listFiles() 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。

注意：
    list和listfiles方法遍历得是构造方法中给出的目录
    如果构造方法中给出的目录的路径不存在，会抛出空指针异常
    如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class Demo06File {
    public static void main(String[] args) {
        show02();
    }

    /*
        File[] listFiles() 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
        遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把文件/文件夹封装为File对象，多个File对象存储到File数组中
     */
    private static void show02() {
        File file=new File("E:\\JAVA\\JAVAProgram");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

    /*
        String[] list() 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
        遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
     */
    private static void show01() {
        File file=new File("E:\\JAVA\\JAVAProgram");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
