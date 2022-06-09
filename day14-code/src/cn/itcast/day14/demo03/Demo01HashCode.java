package cn.itcast.day14.demo03;
/*
哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址，是一个逻辑地址，是模拟出来得到的地址，不是数据实际存储的物理地址）
    在Object类有一个方法，可以获取对象的哈希值
    int hashCode（）返回该对象的哈希码值
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        //person类继承了Object类，所以可以使用Object类中的hashCode方法
        Person p1=new Person();
        int i = p1.hashCode();
        System.out.println(i);

        Person p2=new Person();
        int i1 = p2.hashCode();
        System.out.println(i1);

        System.out.println(p1==p2);//false

        /*
            String类的哈希值
                String类重写Object类的hashCode方法
        */
        String s1=new String("abc");
        String s2=new String("def");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
