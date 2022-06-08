package cn.itcast.day24.demo05.Calculator;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Demo01Check {
}
