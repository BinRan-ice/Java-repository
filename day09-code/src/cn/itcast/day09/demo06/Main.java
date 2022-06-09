package cn.itcast.day09.demo06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Ticket ticket = new Ticket();
        TrainTicket trainTicket = new TrainTicket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到此系统，请选择你要进行的操作：");
            System.out.println("1.购票");
            System.out.println("2.退出系统");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("请从以下地方中选择你的出发地：");
                    list = Message.getlist();
                    System.out.println(list);
                    ticket.judgePlace();
                    System.out.println("请从以下地方中选择你的目的地：");
                    list1 = Message.destlist();
                    System.out.println(list1);
                    ticket.judgeDest();
                    System.out.println("请选择你要出发的时间(2000-00-00)：");
                    ticket.judgeData();
                    System.out.println("请选择具体时间（00:00）");
                    list2=Message.time();
                    System.out.println(list2);
                    ticket.judgeTime();
                    System.out.println("请选择你要购买的票的种类");
                    double s = ticket.judegeSeate();
                    trainTicket.getMessage(s);
                    allMessage(ticket,trainTicket);
                    break;
                case 2:
                   return;
                default:
                   return;
            }
        }
    }
    public static void allMessage(Ticket ticket,TrainTicket trainTicket){
        System.out.println("用户订单信息");
        System.out.println("出发地:"+ticket.getPlace());
        System.out.println("目的地:"+ticket.getDestination());
        System.out.println("日期:"+ticket.getData());
        System.out.println("时间:"+ticket.getTime());
        System.out.println("票价:"+ticket.getFree());
        System.out.println("车次:"+trainTicket.getTrain());
        System.out.println("车厢:"+trainTicket.getNum());
        System.out.println("座位号:"+trainTicket.getSeate());
        System.out.println("身份证:"+trainTicket.getID());
    }
}
