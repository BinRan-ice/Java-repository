package cn.itcast.day07.demo04;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array=new Person[3];
        Person one=new Person("迪丽热巴",18);
        Person two=new Person("古力娜扎",20);
        Person three=new Person("马尔扎哈",42);
        //将one当中的地址值赋值到数组的0号元素
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);
        Person person=array[0];
        System.out.println(person.getName());
    }
}
