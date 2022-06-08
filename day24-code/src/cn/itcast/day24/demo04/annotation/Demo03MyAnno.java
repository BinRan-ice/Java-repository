package cn.itcast.day24.demo04.annotation;

public @interface Demo03MyAnno {
    public String name() default "张三";
    Person per();
    Demo03MyAnno2 annno2();
    String[] str();
}
