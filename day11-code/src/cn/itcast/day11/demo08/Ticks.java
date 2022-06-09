package cn.itcast.day11.demo08;

import java.util.Scanner;

class Ticks implements Calculate{
    private double price = 0;
    private double discount = 0.5;
    private double movies_2D = 50;
    private double movies_3D = 60;
    private double VIP_ = 100;
    @Override
    public double calculate() {
        Scanner scanner = new Scanner(System.in);
        double p = 0.00;
            System.out.println("1. 2D电影       50元");
            System.out.println("2. 3D电影       60元");
            System.out.println("3. VIP放映室    100元");
            System.out.println("=====会员全场五折=====");
            System.out.println("请问您需要买哪种电影票，请输入序号");
            switch (scanner.nextInt()){
                case 1:
                    p = movies_2D;
                    break;
                case 2: p = movies_3D;break;
                case 3: p = VIP_;break;
                default:
                    System.out.println("请输入正确的序号");
            }
            if(p != 0){
                System.out.println("请输入你要购买的票数");
                price += p*scanner.nextInt();
            }
        return price;
    }
}