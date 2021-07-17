package cn.itcast.day15.demo06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
    斗地主综合案例：有序版本
    1.准备牌
    2.洗牌
    3.发牌
    4.排序
    5.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //创建一个map集合,c存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个list集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个集合，存储花色和牌的序号
        List<String> colors = List.of("♥", "♠", "♦", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //把大王和小王存储到集合当中
        //定义一个牌的索引
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历两个集合，组装52张牌，存储到集合中
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
        //2.洗牌
        Collections.shuffle(pokerIndex);
        //3.发牌
        //定义四个集合，存储玩家牌的索引，和底牌的索引
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //遍历存储牌索引的list集合，获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if (i >= 51) {
                //给底牌发牌
                diPai.add(in);
            } else if (i % 3 == 0) {
                //给玩家一发牌
                player01.add(in);
            } else if (i % 3 == 1) {
                //给玩家二发牌
                player02.add(in);
            } else {
                //给玩家三发牌
                player03.add(in);
            }
        }
        //4.排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        //看牌
        lookpoker("刘德华",poker,player01);
        lookpoker("周润发",poker,player02);
        lookpoker("周星驰",poker,player03);
        lookpoker("底牌",poker,diPai);

    }
    //定义一个看牌的方法，提高代码的复用性
    public static void lookpoker(String name,HashMap<Integer,String> poker,ArrayList<Integer>list){
        //输出玩家的名称
        System.out.print(name+": ");
        //遍历玩家或者底牌集合，获取牌的索引
        for (Integer integer : list) {
            String value = poker.get(integer);
            System.out.print(value+" ");
        }
        System.out.println();//打印完每一个玩家的牌换行
    }
}
