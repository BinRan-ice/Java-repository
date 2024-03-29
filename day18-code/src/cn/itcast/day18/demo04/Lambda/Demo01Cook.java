package cn.itcast.day18.demo04.Lambda;
/*
    需求：
        给定一个厨子接口，内含唯一的抽象方法makefood，且无参数，无返回值。
        使用Lambda的标准格式调用invokeCook方法，打印出”吃饭啦！“的字样
 */
public class Demo01Cook {
    public static void main(String[] args) {
        //调用invokeCook方法，参数是cook接口，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦");
            }
        });

        //使用Lambda表达式，简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("吃饭啦!");
        });

        //优化省略Lambda
        //使用Lambda表达式，简化匿名内部类的书写
        invokeCook(()-> System.out.println("吃饭啦!"));
    }

    //定义一个方法，参数传递Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
