package cn.itcast.day11.demo04;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero=new Hero();
        //为英雄起一个名字，并且设置年龄
        hero.setName("王玉辉");
        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon=new Weapon("诸葛连弩");
        //为英雄配备武器
        hero.setWeapon(weapon);
        //年龄为20的王玉辉用诸葛连弩攻击敌方。
        hero.attack();
    }
}
