package cn.itcast.day19.demo01.File;

import java.io.File;
import java.io.IOException;

/*
File类创建删除的方法
     boolean createNewFile() 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
     boolean delete() 删除此抽象路径名表示的文件或目录。
     boolean mkdir() 创建此抽象路径名指定的目录。
     boolean mkdirs() 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。

 */
public class Demo05File {
    public static void main(String[] args) throws IOException {
        show02();
    }

    /*
         boolean delete() 删除此抽象路径名表示的文件或目录。
         此方法，可以删除构造方法路径中给出的文件/文件夹
         返回值：布尔值
            true：文件/文件夹删除成功，返回true
            false：文件夹中有内容，不会删除返回false；构造方法中路径不存在false
         注意：
            delete方法是直接在硬盘删除文件/文件夹，不走回收站，删除要谨慎
     */
    private static void show03() throws IOException {
        File f1 = new File("E:\\JAVA\\JAVAProgram\\1.txt");
        boolean file = f1.createNewFile();
        System.out.println("file:" + file);

        boolean b = f1.delete();
        System.out.println("b:"+b);
    }

    /*
         boolean mkdir() 创建单级文件夹。
         boolean mkdirs() 既可以创建单级文件夹，也可以创建多级文件夹。
         创建文件夹的路径和名称在构造方法中给出（构造方法的参数）
            返回值：布尔值
                true：文件夹不存在，创建文件夹，返回true
                false：文件夹存在，不会创建，返回false；构造方法中的路径不存在返回false
        注意：
            1.此方法只能创建文件夹，不能创建文件
     */
    private static void show02() {
        File f1=new File("E:\\JAVA\\JAVAProgram\\aaa");
        boolean b = f1.mkdir();
        System.out.println("b:"+b);

        File f2=new File("E:\\JAVA\\JAVAProgram\\111\\222\\333\\444");
        boolean b1 = f2.mkdirs();
        System.out.println("b1"+b1);

        File f3=new File("E:\\JAVA\\JAVAProgram\\abc.txt");
        boolean b2 = f3.mkdirs();//看类型是一个文件
        System.out.println("b2"+b2);

        File f4=new File("E:\\JAVA\\JAVA\\abc");
        boolean b3 = f4.mkdirs();//不会抛出异常，路径不存在不会创建
        System.out.println("b3"+b3);
    }

    /*
        boolean createNewFile() 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出（构造方法的参数）
        返回值：布尔值
            true：文件不存在，创建文件，返回true
            false：文件存在，不会创建，返回false
        注意：
            1.此方法只能创建文件，不能创建文件夹
            2.创建文件的路径必须存在，否则会抛出异常

        public boolean createNewFile() throws IOException
        createNewFile声明抛出了IOException，我们调用这个方法，就必须处理这个异常，要么throws，要么trycatch
     */
    private static void show01() throws IOException {
        File f1 = new File("E:\\JAVA\\JAVAProgram\\1.txt");
        boolean file = f1.createNewFile();
        System.out.println("file:" + file);

        File f2 = new File("JAVAProgram\\2.txt");
        System.out.println(f2.createNewFile());//路径不存在会抛出IO异常

    }
}
