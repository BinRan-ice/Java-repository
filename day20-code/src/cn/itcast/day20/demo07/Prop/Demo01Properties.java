package cn.itcast.day20.demo07.Prop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends hashtable<k,v> implements Map<k,v>
    Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
    Properties集合是一个唯一和IO流相结合的集合
        可以使用Properties集合中的方法store把集合中的临时数据，持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把硬盘中的文件（键值对），读取到集合中使用
    Properties集合是一个双列集合，k，v默认都是字符串
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
        可以使用Properties集合中的方法load，把硬盘中的文件（键值对），读取到集合中使用
        void load(InputStream inStream) 从输入流中读取属性列表（键和元素对）。
        void load(Reader reader) 按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
        参数：
            InputStream inStream：字节输入流，不能读取含有中文的键值对
            Reader reader：字符输入流，能读取含有中文的键值对
        使用步骤：
            1.创建Properties集合对象
            2.使用Properties集合对象中的方法load读取保存键值对的文件
            3.遍历Properties集合
        注意：
            1.存储键值对的文件中，键与值默认的连接符号可以使用=，空格（其他符号）
            2.存储键值对的文件中，可以使用#进行注释，被注释的键值对不会再被读取
            3.存储键值对的文件中，键与值默认都是字符串，不能再加引号
     */
    private static void show03() throws IOException {
        // 1.创建Properties集合对象
        Properties prop=new Properties();
        //2.使用Properties集合对象中的方法load读取保存键值对的文件
        prop.load(new FileReader("E:\\JAVA\\JAVAProgram\\a.txt"));
        Set<String> strings = prop.stringPropertyNames();
        for (String string : strings) {
            String property = prop.getProperty(string);
            System.out.println(string+"="+property);
        }
    }

    /*
         可以使用Properties集合中的方法store把集合中的临时数据，持久化写入到硬盘中存储
          void store(OutputStream out, String comments) 以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
          void store(Writer writer, String comments) 以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
          参数：
            OutputStream out：字节输出流，不能写中文
            Writer writer：字符输出流，可以写中文
            String comments：注释，用来解释说明保存的文件是做什么用的
                不能使用中文，会产生乱码，默认是Unicode编码
                一般使用“”空字符串
         使用步骤：
            1.创建Properties集合对象，添加数据
            2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
            3.使用Properties集合中的方法，把集合中的临时数据，持久化写入到硬盘中存储
            4.释放资源
     */
    private static void show02() throws IOException {
        //1.创建Properties集合对象，添加数据
        Properties prop=new Properties();
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","169");
        prop.setProperty("古力娜扎","160");

        //2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
        FileWriter fw=new FileWriter("E:\\JAVA\\JAVAProgram\\a.txt");

        //3.使用Properties集合中的方法，把集合中的临时数据，持久化写入到硬盘中存储
        prop.store(fw,"save data");

        //4.释放资源
        fw.close();
    }

    /*
        使用Properties集合存储数据，遍历取出Properties集合中的数据
        Properties集合是一个双列集合，k，v默认都是字符串
        Properties集合有一些操作字符串的特有方法
        Object setProperty(String key, String value) 调用 Hashtable 的方法 put。
        String getProperty(String key) 用指定的键在此属性列表中搜索属性。
        Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，则还包括默认属性列表中不同的键。
     */
    private static void show01() {
        //创建Properties集合对象
        Properties prop=new Properties();
        //使用setProperty方法往集合中添加数据
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","169");
        prop.setProperty("古力娜扎","160");
        //使用stringPropertyNames把Properties集合中的键取出，存储到一个set集合中
        Set<String> strings = prop.stringPropertyNames();
        //遍历set集合取出Properties集合的每一个键
        for (String string : strings) {
            //使用getProperties方法通过key获取value
            String property = prop.getProperty(string);
            System.out.println(string+"="+property);
        }
    }
}
