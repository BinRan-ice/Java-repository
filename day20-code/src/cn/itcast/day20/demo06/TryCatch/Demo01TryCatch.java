package cn.itcast.day20.demo06.TryCatch;

import java.io.FileWriter;
import java.io.IOException;

/*

 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域，让finally可以使用
        //变量在定义的时候，可以没有值，但是使用的时候必须有值
        FileWriter fw = null;
        try {
            //可能会出现异常的代码
            fw = new FileWriter("E:\\JAVA\\JAVAProgram\\a.txt", true);
            for (int i = 0; i < 20; i++) {
                fw.write("HelloWorld" + i);
                fw.write("\r\n");
            }
        } catch (IOException e) {
            //异常处理逻辑
            e.printStackTrace();
        } finally {
            //一定会执行的代码
            //创建对象失败了，fw的默认值是null，null是不能调用方法的，会抛出空指针异常，需要增加一个判断，不是null再把资源释放
            if (fw != null) {
                try {
                    //fw.close方法声明抛出了IOException异常对象，所以我们就处理这个异常对象，要么throws，要么trycatch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
