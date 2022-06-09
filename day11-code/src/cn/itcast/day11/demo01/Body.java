package cn.itcast.day11.demo01;

public class Body {//外部类

    public class Heart{//成员内部类
        public  void beat(){

            //内部类的方法
            System.out.println("心脏跳动：蹦蹦蹦!");
            System.out.println("我叫"+name);
        }
    }
    //外部类的成员变量
    private String name;

    //外部类的方法
    public void  methodBody(){
        System.out.println("外部类的方法");
        Heart heart=new Heart();
        heart.beat();
    }
}
