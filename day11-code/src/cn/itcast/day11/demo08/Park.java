package cn.itcast.day11.demo08;

import java.util.Calendar;
import java.util.Scanner;

class Park implements Calculate{
    private double price = 0.00;
    private Calendar start = Calendar.getInstance();
    private Calendar end = Calendar.getInstance();
    @Override
    public double calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入白天停车每小时4元，夜间停10元,时间是二十四小时计时");
        System.out.println("请输入停车开始时间 年-月-日-时-分");
        start.set(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println("请输入结束时间 年-月-日-时-分");
        end.set(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        int start_hour = start.get(Calendar.HOUR_OF_DAY );
        int end_hour = end.get(Calendar.HOUR_OF_DAY);
        int start_day = start.get(Calendar.DAY_OF_MONTH);
        int end_day = end.get(Calendar.DAY_OF_MONTH);
        int start_min = start.get(Calendar.MINUTE);
        int end_min = end.get(Calendar.MINUTE);
        if(end_min-start_min > 0)
            end_hour++;
        price = 58*(end_day - start_day);
        if (end_hour < start_hour)
            price += 58;
        if (start_hour > 8 && start_hour < 20)
            if (end_hour > 8 && end_hour < 20){
                price += 4 * (end_hour - start_hour);
            }else if(end_hour > 20){
                price += 4 * (20 - start_hour) + 10;
            }else{
                price +=4 * (8 - start_hour);
            }
        else if (start_hour > 20){
            if (end_hour > 8 && end_hour < 20){
                price+= 10 + 4* (end_hour - 8);
            }else if(end_hour > 20)
                price += 48 + 10;
        }
        return price;
    }
}
