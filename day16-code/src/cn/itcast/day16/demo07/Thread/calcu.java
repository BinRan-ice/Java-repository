package cn.itcast.day16.demo07.Thread;

import java.math.BigInteger;

public class calcu {
    public static void main(String[] args) {
        BigInteger a,b,c;
        int exponent=11;
        a=new BigInteger("13");
        b=a.pow(exponent);
        c=new BigInteger("77");
        BigInteger[] d=b.divideAndRemainder(c);
        System.out.println(b);
        System.out.println(d[1]);
    }
}
