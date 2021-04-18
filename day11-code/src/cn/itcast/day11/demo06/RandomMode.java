package cn.itcast.day11.demo06;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer>list=new ArrayList<>();
        Random r=new Random();
        int leftMney=totalMoney;
        int leftCount=totalCount;
        for (int i=0;i<totalCount-1;i++){
            int money=r.nextInt(leftMney/leftCount*2)+1;
            list.add(money);
            leftMney-=money;
            leftCount--;//剩下还应该要发的红包个数
        }
        list.add(leftMney);
        return list;
    }
}
