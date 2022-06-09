package cn.itcast.day09.demo06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TrainTicket extends Ticket {
    private String train;
    private int num;
    private String seate;
    private StringBuilder  ID;

    public TrainTicket(String place, String destination, String data, String time, double free) {
        super(place, destination, data, time, free);
    }

    public TrainTicket(String place, String destination, String data, String time, double free, String train, int num, String seate, StringBuilder ID) {
        super(place, destination, data, time, free);
        this.train = train;
        this.num = num;
        this.seate = seate;
        this.ID = ID;
    }

    public TrainTicket(String train, int num, String seate, StringBuilder  ID) {
        this.train = train;
        this.num = num;
        this.seate = seate;
        this.ID = ID;
    }

    public TrainTicket() {
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSeate() {
        return seate;
    }

    public void setSeate(String seate) {
        this.seate = seate;
    }

    public StringBuilder  getID() {
        return ID;
    }

    public void setID(StringBuilder ID) {
        this.ID = ID;
    }

    public void getMessage(double s) {
        int x,f1,y1,r1;
        char[] c;
        String str1,str2;
        ArrayList<String> list = Message.train();
        Random r = new Random();
        x = r.nextInt(5);
       train = list.get(x);
        num = r.nextInt(19) + 1;
        f1 = r.nextInt(99) + 1;
        y1 = r.nextInt(29) + 1;
        r1 = r.nextInt(35) + 1;
        System.out.println("该车的车次为：" + train);
        System.out.println("该车的车厢为：" + num);
        System.out.print("该车的座位号：");
        if (s < 120) {
            seate="硬座" + f1;
            System.out.println(seate);
        } else if (s >= 200.5 && s < 320.5) {
            if (s <= 240.5) {
                seate="硬卧上铺" + y1;
                System.out.println(seate);
            } else if (s > 240.5 && s <= 280.5) {
                seate="硬卧中铺" + y1;
                System.out.println(seate);
            } else {
                seate="硬卧下铺" + y1;
                System.out.println(seate);
            }
        }else{
            if (s>500.5&&s<=550.5){
                seate="软卧上铺"+r1;
                System.out.println(seate);
            }else{
                seate="软卧下铺"+r1;
                System.out.println(seate);
            }
        }
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入你的身份证购票");
            str1=sc.next();
            System.out.println("请再次输入你的身份证号");
            str2=sc.next();
            boolean b=str1.equals(str2);
            if (str1.length()!=18&&(!b)){
                System.out.println("身份证长度信息有问题，两次输入的身份证号不相同，请重新输入");
            }else if(str1.length()!=18){
                System.out.println("身份证长度信息有问题，请重新输入");
            } else if(!b){
                System.out.println("两次输入的身份证号不相同，请重新输入");
            }else{
                StringBuilder bulidTemp=new StringBuilder(str1);
                ID=bulidTemp.replace(14,18,"****");
                System.out.println("恭喜您，购票成功");
                break;
            }
        }
    }
}

