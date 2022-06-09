package cn.itcast.day09.demo06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ticket {
    private String place;
    private String destination;
    private String data;
    private String time;
    private double free;

    public Ticket(String place, String destination, String data, String time, double free) {
        this.place = place;
        this.destination = destination;
        this.data = data;
        this.time = time;
        this.free = free;
    }

    public Ticket() {
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getFree() {
        return free;
    }

    public void setFree(double free) {
        this.free = free;
    }

    public void judgePlace(){
        int num1;
        ArrayList<String> list=new ArrayList<>();
        list=Message.getlist();
        Scanner sc=new Scanner(System.in);
        while (true){
            num1=sc.nextInt();
            if (num1<0||num1>5){
                System.out.println("输入不合法请重新输入");
            }else{
               place=list.get(num1);
              this.setPlace(place);
               break;
            }
        }
    }

    public void judgeDest(){
        int num2;
        ArrayList<String> list1=new ArrayList<>();
        list1=Message.destlist();
        Scanner sc=new Scanner(System.in);
        while (true){
            num2=sc.nextInt();
            if (num2<0||num2>5){
                System.out.println("输入不合法请重新输入");
            }else{
                destination=list1.get(num2);
                this.setDestination(destination);
                break;
            }
        }
    }

    public void judgeData(){
        Scanner sc=new Scanner(System.in);
        data=sc.next();
        this.setData(data);
    }

    public void judgeTime(){
        int x;
        ArrayList<String>list=Message.time();
        Scanner sc=new Scanner(System.in);
        while (true){
            x=sc.nextInt();
            if (x<0||x>5){
                System.out.println("输入不合法请重新输入");
            }else{
                time=list.get(x);
                break;
            }
        }

    }

    public double judegeSeate(){
        int s1,s2,s3,x;
        double f1,y1,r1;
        Random r=new Random();
        s1=r.nextInt(6);
        s2=r.nextInt(6);
        s3=r.nextInt(6);
        f1=r.nextInt(50)+50.5;
        y1=r.nextInt(120)+200.5;
        r1=r.nextInt(500)+100.5;
        System.out.println("[0]硬座：剩余票数"+s1+"  [1]硬卧：剩余票数："+s2+"  [2]软卧：剩余票数"+s3);
        Scanner sc=new Scanner(System.in);
        while(true){
            x=sc.nextInt();
            if(x<0||x>2||(x==0&&s1==0)||(x==1&&s2==0)||(x==2&&s3==0)){
                System.out.println("输入错误或该票余额不足，请重新输入！！！");
            }else{
                if (x==0){
                    s1=s1-1;
                    System.out.print("该票的价格为："+f1);
                    System.out.println("购票以后的结果：");
                    System.out.println("硬座：剩余票数"+s1+",硬卧：剩余票数："+s2+",软卧：剩余票数"+s3);
                    free=f1;
                    return f1;
                }else if(x==1){
                    s2=s2-1;
                    System.out.println("该票的价格为："+y1);
                    System.out.println("购票以后的结果：");
                    System.out.println("硬座：剩余票数"+s1+",硬卧：剩余票数："+s2+",软卧：剩余票数"+s3);
                    free=y1;
                    return y1;
                }else{
                    s3=s3-1;
                    System.out.println("该票的价格为："+r1);
                    System.out.println("购票以后的结果：");
                    System.out.println("硬座：剩余票数"+s1+",硬卧：剩余票数："+s2+",软卧：剩余票数"+s3);
                    free=r1;
                    return  r1;
                }
            }
        }
    }
}
