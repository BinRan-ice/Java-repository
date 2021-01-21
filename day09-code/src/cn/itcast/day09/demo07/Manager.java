package cn.itcast.day09.demo07;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redlist = new ArrayList<>();

        //首先看一下群主自己有多少钱
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redlist;//返回空集合
        }
        //扣钱，重新设置余额
        super.setMoney(leftMoney - totalMoney);
        //发红包需要平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数
        //除不开的零头，包在最后一个红包当中
        //把红包放到集合当中
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        int last=avg+mod;
        redlist.add(last);
        return redlist;
    }
}
