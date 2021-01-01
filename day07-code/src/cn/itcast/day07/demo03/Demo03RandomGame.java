package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo03RandomGame {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
       while (true){
           System.out.println("请输入你猜测的数值：");
           int guessNum = sc.nextInt();
           if(randomNum<guessNum){
               System.out.println("太大了请重试！！！");
           }else if(randomNum>guessNum){
               System.out.println("太小了请重试！！！");
           }else{
               System.out.println("恭喜你猜中了！！！");
               break;
           }
       }
        System.out.println("游戏结束！！！");
    }
}
