package cn.itcast.day21.demo03;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HardDisk180405420 HLl1=new HardDisk180405420("李磊1+1804班");
        HardDisk180405420 HLl2=new HardDisk180405420("李磊2+1804班");
        HardDisk180405420 HLl3=new HardDisk180405420("李磊3+1804班");
        FlashDisk fd1=new FlashDisk(true,HLl1);
        FlashDisk fd2=new FlashDisk(true,HLl2);
        FlashDisk fd3=new FlashDisk(true,HLl3);
        ArrayList<FlashDisk>list=new ArrayList<>();
        if (fd1.isLocked()){
            list.add(fd1);
            System.out.println("添加的元素:"+fd1.getHD());
            FlashDisk remove = list.remove(0);
            System.out.println("删除的元素："+remove.getHD());
        }else{
            fd1.write();
        }

        list.add(fd1);
        list.add(fd2);
        list.add(fd3);
        System.out.println("该集合中的成员内容为：");
        Iterator<FlashDisk> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    //测试多态
    public void test_Polymorphic(IMobileStorage iMobileStorage){
        iMobileStorage.read();
        iMobileStorage.write();
    }
}
