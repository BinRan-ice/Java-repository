package cn.itcast.day24.demo04.annotation;

import java.lang.annotation.*;

/*
 元注解：用于描述注解的注解
 @Target：描述注解能够作用的位置
 @Retention：描述注解被保留的阶段
 @Documented：描述注解是否被抽取到api文档中
 @Inherited:描述注解是否被子类继承
 */
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//表示该注解只能作用于类上
@Retention(RetentionPolicy.RUNTIME)//当前被描述的注解，会保留到class字节码文件中，并被jvm读取到
@Documented
@Inherited
public @interface Demo03MyAnno3 {
}
