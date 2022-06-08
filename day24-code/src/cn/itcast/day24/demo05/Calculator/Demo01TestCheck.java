package cn.itcast.day24.demo05.Calculator;

import cn.itcast.day24.demo01.junit.Calculate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 *
 * 当主方法执行后，会自动执行被检测的所有方法（加了check注解的方法），判断方法是否有异常，记录到文件中
 */
public class Demo01TestCheck {
    public static void main(String[] args) throws IOException {
        //1.创建计算器对象
        Demo01Caluculator demo01Caluculator=new Demo01Caluculator();
        //2.获取字节码文件对象
        Class cls = demo01Caluculator.getClass();
        //3/获取所有方法
        Method[] methods = cls.getMethods();
        int num=0;//出现异常的次数
        BufferedWriter bw=new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            //4.判断方法上是否有check注解
            if(method.isAnnotationPresent(Demo01Check.class)){
                //5.执行
                try {
                    method.invoke(demo01Caluculator);
                } catch (Exception e) {
                    e.printStackTrace();
                    //6.捕获异常
                    //记录到文件中
                    num++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现" + num + "次异常");
        bw.flush();
        bw.close();
    }
}
