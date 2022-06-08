package cn.itcast.day16.demo01.Exception;

import java.util.Objects;

/*
    Objects类中的静态方法
 */
public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
        //对传递过来的参数进行合法性判断,判断是否为null
       /* if (obj==null){
         throw new NullPointerException("传递对象的值为null");
        }*/
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递对象的值是null");
    }
}
