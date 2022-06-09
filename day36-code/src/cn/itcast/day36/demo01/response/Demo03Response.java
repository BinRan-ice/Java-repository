package cn.itcast.day36.demo01.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  重定向
 */

@WebServlet("/Demo03Response")
public class Demo03Response extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取流对象之前。设置流的编码
        response.setCharacterEncoding("gbk");

        //告诉游览器，服务器发送的消息体数据的编码，建议浏览器使用该编码解码
        response.setHeader("content-type","text/html;charset=utf-8");

        //简单的形式设置编码
        response.setContentType("text/html;charset=utf-8");

        //1.获取字符输出流
        PrintWriter writer = response.getWriter();
        //2.输出数据
        //writer.write("hello");
        writer.write("你好");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
