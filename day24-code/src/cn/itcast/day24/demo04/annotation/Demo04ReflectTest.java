package cn.itcast.day24.demo04.annotation;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    框架类
 */
@Demo04pro(className = "cn.itcast.day24.demo04.annotation.Demo04show",methodName = "show")
public class Demo04ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象，可以去执行任意方法
        /*
            前提：不能改变该类的任何代码 可以创建任意类的对象，可以去执行任意方法
         */
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<Demo04ReflectTest> demo04ReflectTestClass = Demo04ReflectTest.class;
        //2.获取上边的注解对象
        Demo04pro annotation = demo04ReflectTestClass.getAnnotation(Demo04pro.class);//其实就是在内存中生成了一个该注解机接口的子类实现对象
        //3.调用注解对象中定义的抽象方法获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();
        System.out.println(className);
        System.out.println(methodName);
        //4.加载该类进内存
        Class cls = Class.forName(className);
        //5.创建对象
        Object o = cls.newInstance();
        //6.获取方法对象
        Method method = cls.getMethod(methodName);
        //7.执行方法
        method.invoke(o);
    }
}
