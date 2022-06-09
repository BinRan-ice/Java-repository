package cn.itcast.day08.demo02;
/*
==是进行对象的地址比较，如果确实需要字符串的内容比较，可以使用两个方法：
public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false。
备注：任何对象都能用Object进行接收

public boolean equalsIgnoreCase(String str):忽略大小写，进行内容比较
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("hello".equals(str1));

        String str5=null;
        System.out.println("abc".equals(str5));//推荐：false
        //System.out.println(str5.equals("abc"));//不推荐：报错，空指针异常

        String strA="JAVA";
        String strB="java";
        //注意：只有英文字母区分大小写，其他都不区分大小写
        System.out.println(strA.equals(strB));//false,严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));//true，忽略大小写
    }
}
