package cn.itcast.day13.demo03;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass demo02Generic=new GenericClass();
        demo02Generic.setName("只能是字符串");
        Object o = demo02Generic.getName();

        //创建Demo02Generic对象，泛型使用Integer类型
        GenericClass<Integer> demo02Generic2=new GenericClass();
        demo02Generic2.setName(1234);
        Integer name = demo02Generic2.getName();
        System.out.println(name);
    }
}
