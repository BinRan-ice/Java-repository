package cn.itcast.day08.demo01;

public class Demo01Sring {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();
        System.out.println("第一个字符串"+str1);

        //根据字符数组创建字符串
        char[] charArry={'A','B','C'};
        String str2=new String(charArry);
        System.out.println("第二个字符串"+str2);

        //根据字节数组创建字符串
        byte[] byteArra={97,98,99};
        String str3=new String(byteArra);
        System.out.println("第三个字符串"+str3);

        String str4="Hello";
        System.out.println("第四个字符串"+str4);
    }
}
