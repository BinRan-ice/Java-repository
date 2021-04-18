package cn.itcast.day11.demo08;

import java.util.Scanner;

class Taxi implements Calculate{
    private double price;
    @Override
    public double calculate() {
        System.out.println("请输入你的里程:");
        Scanner sc = new Scanner(System.in);
        int du = 0;
        du =(int)sc.nextDouble() + 1;
        price = 8.00;
        if (du > 3){
            price = price+(du - 3)* 0.8;
        }
        return price;
    }
}
