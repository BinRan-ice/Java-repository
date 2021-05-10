package cn.itcast.day12.demo05;
/*
StringBuilder和String可以相互转换；
    String->StringBuilder:可以使用StringBuilder的构造方法
    StringBuilder->String:可以使用StringBuilder中的toString方法
*/
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //String->StringBuilder
        String str="Hello";
        System.out.println("str:"+str);
        StringBuilder bu1 = new StringBuilder(str);
        //往StringBuilder中添加数据
        bu1.append("World");
        System.out.println("bu1:"+bu1);

        //StringBuilder->String
        String s = bu1.toString();
        System.out.println("s:"+s);
    }
}
