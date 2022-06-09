package cn.itcast.day31.demo03.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Document对象的功能
 */
public class Demo03Jsoup {
    public static void main(String[] args) throws IOException {
        //1获取student.xml的path
        String path = Demo03Jsoup.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.获取元素对象
        Elements student = document.getElementsByTag("student");
        System.out.println(student);

        System.out.println("-------------");
        //3.2获取属性名为id的元素
        Elements elements = document.getElementsByAttribute("id");
        System.out.println(elements);
        System.out.println("---------------");

        //3.3获取number值为heima_0001的元素对象
        Elements elements1 = document.getElementsByAttributeValue("number", "heima_0001");
        System.out.println(elements1);
        System.out.println("----------------");


        Element element = document.getElementById("itcast");
        System.out.println(element);
    }
}

