package cn.itcast.day19.demo01.File;

import java.io.File;

/*
File类获取功能的方法
     File getAbsoluteFile() 返回此抽象路径名的绝对路径名形式。
     String getPath() 将此抽象路径名转换为一个路径名字符串。
     String getName() 返回由此抽象路径名表示的文件或目录的名称。
     long length() 返回由此抽象路径名表示的文件的长度。
 */
public class Demo03File {
    public static void main(String[] args) {
        show03();
    }

    /*
        long length() 返回由此抽象路径名表示的文件的长度。
        获取的是构造方法指定的文件的大小，以字节为单位
        注意：
            文件夹是没有大小概念的，不能获取文件夹大小
            如果构造方法中给出的路径不存在，那么length方法返回0
     */
    private static void show04() {
        File f1=new File("E:\\景点地图.jpg");
        long length1 = f1.length();
        System.out.println(length1);//108422字节

        File f2=new File("E:\\景点地图2.jpg");
        long length2 = f2.length();
        System.out.println(length2);//0
    }

    /*
        String getName() 返回由此抽象路径名表示的文件或目录的名称。
        获取的就是构造方法传递路径的结尾部分（文件/文件夹）
     */
    private static void show03() {
        File f1=new File("E:\\JAVA\\JAVAProgram\\a.txt");
        String name1 = f1.getName();
        System.out.println(name1);

        File f2=new File("E:\\JAVA\\JAVA 程序");
        String name2 = f2.getName();
        System.out.println(name2);
    }

    /*
        String getPath() 将此抽象路径名转换为一个路径名字符串。
        获取构造方法中传递的路径

        toString方法调用的就是getPath（）方法
     */
    private static void show02() {
        File f1=new File("E:\\JAVA\\JAVAProgram\\a.txt");
        String path1 = f1.getPath();
        System.out.println(path1);

        File f2=new File("a.txt");
        String path2 = f2.getPath();
        System.out.println(path2);
    }

    /*
        File getAbsoluteFile() 返回此抽象路径名的绝对路径名形式。
        获取构造方法中传递的路径
        无论路径是绝对的还是相对的，getAbsoluteFile方法返回的都是绝对路径
     */
    private static void show01() {
        File f1=new File("E:\\JAVA\\JAVAProgram\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);//E:\JAVA\JAVA 程序\a.txt

        File f2=new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);
    }
}
