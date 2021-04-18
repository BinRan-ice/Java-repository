package cn.itcast.day11.demo08;

public class Sale {
    public static void main(String[] args) {
        System.out.println("您购买的电影票价为："+new Ticks().calculate());
        System.out.println("您的打车费为："+new Taxi().calculate());
        System.out.println("您的停车费为："+new Park().calculate());
    }
}
