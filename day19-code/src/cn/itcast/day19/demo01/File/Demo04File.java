package cn.itcast.day19.demo01.File;

import java.io.File;

/*
File判断功能的方法
     boolean exists() 测试此抽象路径名表示的文件或目录是否存在。
     boolean isDirectory() 测试此抽象路径名表示的文件是否是一个目录。
     boolean isFile() 测试此抽象路径名表示的文件是否是一个标准文件。
 */
public class Demo04File {
    public static void main(String[] args) {
        show02();
    }

    /*
        boolean isDirectory() 测试此抽象路径名表示的文件是否是一个目录。
            用于判断构造方法中给定的路径是否以文件夹结尾
                是：true
                否：false
        boolean isFile() 测试此抽象路径名表示的文件是否是一个标准文件。
            用于判断构造方法中给定的路径是否以文件结尾
                是：true
                否：false
        注意：
            电脑的硬盘中只有文件/文件夹，两个方法是互斥的
            这两个方法的使用前提，路径必须是存在的，否则都返回false
     */
    private static void show02() {
        File f1=new File("E:\\JAVA\\JAVAProgram\\a.txt");
        //不存在就没有必要获取
        if (f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }

        File f2=new File("E:\\JAVA\\JAVAProgram");
        if (f2.exists()){
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }
    }

    /*
         boolean exists() 测试此抽象路径名表示的文件或目录是否存在。
         用于判断构造方法中的路径是否存在
            存在：true
            不存在：false
     */
    private static void show01() {
        File f1=new File("E:\\JAVA\\JAVAProgram");
        System.out.println(f1.exists());

        File f2=new File("E:\\JAVA\\JAVAProgram\\a.txt");
        System.out.println(f2.exists());

        File f3=new File("JAVA 程序.iml");//相对路径
        System.out.println(f3.exists());
    }
}
