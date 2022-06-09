package cn.itcast.day16.demo03.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    finally代码块
        try...catch:异常处理的第二种方式，自己处理异常
    格式：
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
            异常的处理逻辑，产生异常对象之后怎么处理异常对象
            一般在工作中，会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名 变量名){
        }finally{
            无论是否出现异常都会执行
        }
    注意：
        1.finally不能单独使用，必须和try一起使用
        2.finally一般用于资源释放，无论程序是否出现异常，最后都要资源释放（IO）
 */
public class Demo02TryCatchFinally {
    public static void main(String[] args) {
        try {
            //可能会产生异常的代码
            readFile("c:\\b.txt");
        } catch (IOException e) {
            //异常处理的逻辑
            e.printStackTrace();
        }finally {
            //无论是否出现异常，都会执行
            System.out.println("资源释放");
        }
    }
    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
