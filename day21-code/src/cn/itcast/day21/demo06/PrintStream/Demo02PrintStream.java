package cn.itcast.day21.demo06.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    可以改变输出语句的目的地（打印流的流向）
    输出语句，默认在控制台输出
    使用System.setOut方法改变输出语句的目的地为参数传递的打印流的目的地
        static void setOut(PrintStream out) 重新分配“标准”输出流。
 */
public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出的");
        PrintStream ps=new PrintStream("E:\\JAVA\\JAVAProgram\\a.txt");
        System.setOut(ps);//把输出语句的目的地改变为打印流的目的地
        System.out.println("我在打印流的目的地中输出");
        ps.close();
    }
}
