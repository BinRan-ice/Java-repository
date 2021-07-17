package cn.itcast.day13.demo04;

import java.util.ArrayList;
import java.util.Collections;

/*
    斗地主综合案例：
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
 */
public class Doudizhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的Arraylist集合，泛型使用String
        ArrayList<String>poker=new ArrayList<>();
        //定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors={"♥","♠","♦","♣"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环遍历两个数组，组装52张牌
        for (String number:
             numbers) {
            for (String color : colors) {
                //把组装好的牌存储到poker集合当中
                poker.add(color+number);
            }
        }
        /*
            2.洗牌
            使用集合的工具类collections中的方法
            static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
         */
        Collections.shuffle(poker);

        /*
            3.发牌
         */
        //定义四个集合，存储玩家的牌和底牌
        ArrayList<String>player1=new ArrayList<>();
        ArrayList<String>player2=new ArrayList<>();
        ArrayList<String>player3=new ArrayList<>();
        ArrayList<String>dipai=new ArrayList<>();

        /*
            遍历poker集合，获取每一张牌
            使用poker集合的索引%3给三个玩家轮流发牌
            剩余三张牌给底牌
            注意：
                先判断底牌（i>51）
         */
        for (int i=0;i<poker.size();i++){
            //获取每一张牌
            String p=poker.get(i);
            //轮流发牌
            if(i>=51){
                //给底牌发牌
                dipai.add(p);
            }else if (i%3==0){
                //给玩家一发牌
                player1.add(p);
            }else if (i%3==1){
                //给玩家二发牌
                player2.add(p);
            }else if (i%3==2){
                //给玩家三发牌
                player3.add(p);
            }
        }
        //看牌
        System.out.println("底牌："+dipai);
        System.out.println("玩家1："+player1);
        System.out.println("玩家2："+player2);
        System.out.println("玩家3："+player3);
    }
}
