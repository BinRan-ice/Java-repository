package cn.itcast.day19.demo02.Recurison;

import java.io.File;

public class Demo01Recurison {
    public static void main(String[] args) {
        File file=new File("E:\\JAVA\\JAVAProgram");
        getAllFile(file);
    }
    /*
        定义一个方法：参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            }else {
                /*
                    只要.java结尾的文件
                    1.把file对象f，转为字符串对象
                 */
                String name = file.getName();
                //2.调用String类中的方法endWith（）判断字符串是否以.java结尾
                boolean b = name.endsWith(".java");
                if (b){
                    System.out.println(file);
                }
            }
        }
    }
}
