package cn.itcast.day09.demo08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        calculate method1 = new MoiveTrick();
        calculate method2 = new StopTrick();
        TaxiTrick method3 = new TaxiTrick();
        int f1=0, f2, f3,free, num;
        double kio;
        String time;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请选择你要看的电影种类：");
            System.out.println("1.2D电影（50元）");
            System.out.println("2.3D电影（60元）");
            System.out.println("3.VIP影厅（100元）");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    f1 = method1.Free(50);
                    break;
                case 2:
                    f1 = method1.Free(60);
                    break;
                case 3:
                    f1 = method1.Free(100);
                    break;
                default:
                    System.out.println("输入错误，请重新输入！！！");
                    break;
            }
            System.out.println("请输入你家到目的地影院的距离：");
            kio=sc.nextDouble();
            f2=method3.Free(kio);
            System.out.println("停车时间段：（9：00-16：00）");
            f3=method2.Free(8);
            free=f1+f2+f3;
            System.out.println("总共的费用为："+free);
            return;
        }

    }

    public static void isBelong(){

        SimpleDateFormat df = new SimpleDateFormat("HH:mm");//设置日期格式
        Date now =null;
        Date beginTime = null;
        Date endTime = null;
        try {
            now = df.parse("09:00");
            beginTime = df.parse("08:00");
            endTime = df.parse("20:00");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Boolean flag = belongCalendar(now, beginTime, endTime);
        System.out.println(flag);
    }

    public static boolean belongCalendar(Date nowTime, Date beginTime, Date endTime) {
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
}
