package cn.itcast.day21.demo01.BufferedStream;

import java.io.*;
import java.util.HashMap;

public class Demo05Test {
    public static void main(String[] args) throws IOException {
        //1.创建一个HashMap集合对象，可以：存储每行文本的序号（1,2,3...）；value：存储每行的文本
        HashMap<String,String>map=new HashMap<>();
        //2.创建字符缓冲输入流对象，构造方法中绑定字符输入流
        BufferedReader br=new BufferedReader(new FileReader("E:\\JAVA\\JAVA 程序\\a.txt"));
        //3.创建字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\JAVA\\JAVA 程序\\b.txt"));
        //4.使用字符缓冲输入流中的方法readline，逐行读取文本
        String line;
        while ((line=br.readLine())!=null){
            //5.对读取到的文本进行切割，获取行中的序号和文本内容
            String[] split = line.split("\\.");
            //6.把切割好的序号和文本内容存储到HashMap集合中（key）序号是有序的，会自动排序1,2,3,4...
            map.put(split[0],split[1]);

        }
        //7.遍历Hashmap集合，获取每一个键值对
        for(String key:map.keySet()){
            String value = map.get(key);
            //8.把每一个键值对，拼接为一个文本行
            line=key+"."+value;
            //9.把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文件中
            bw.write(line);
            bw.newLine();
        }
        //10.资源释放
        bw.close();
        br.close();
    }
}
