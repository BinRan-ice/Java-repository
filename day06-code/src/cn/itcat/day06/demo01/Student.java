package cn.itcat.day06.demo01;
//成员方法不要写static关键字
public class Student {
   private String name;
   private int age;
   private boolean male;

    public Student(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public void setMale(boolean b){
       male=b;
   }

    public boolean isMale() {
        return male;
    }

    public void setName(String str){
       name =str;
   }

   public String getName(){
       return name;
   }

   public void setAge(int num){
       age=num;
   }

   public int getAge(){
       return age;
   }
}
