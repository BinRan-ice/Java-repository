package cn.itcast.day19.demo03.Filter.Demo01;

import java.io.File;

/*
    我们可以使用过滤器来实现指定目标文件
    在File中有两个和ListFile重载的方法，方法的参数传递就是过滤器
         File[] listFiles(FileFilter filter) 返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
            作用：用来过滤文件（file对象）
            抽象方法：用来过滤文件的方法
                boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
                参数：
                    File pathname：使用ListFile方法遍历目录，得到的每一个文件对象
         File[] listFiles(FilenameFilter filter) 返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
            作用：用来过滤文件名称
            抽象方法：用来过滤文件的方法
                boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。
                参数：
                    File dir：构造方法中传递的被遍历的目录
                    String name：使用ListFile方法遍历目录，获取的每一个文件、文件夹的名称
                注意：
                    两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤方法accept，在方法中自己定义过滤的规则

 */
public class Demo01Filter {
    public static void main(String[] args) {
        File file=new File("E:\\JAVA\\JAVAProgram");
        getAllFile(file);
    }
    /*
        定义一个方法：参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        File[] files = dir.listFiles(new FileFilterImpl());//传递过滤器对象
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
