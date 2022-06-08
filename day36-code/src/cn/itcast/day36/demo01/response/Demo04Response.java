package cn.itcast.day36.demo01.response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  重定向
 */

@WebServlet("/Demo04Response")
public class Demo04Response extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //简单的形式设置编码
        response.setContentType("text/html;charset=utf-8");

        //1.获取字节输出流
        ServletOutputStream outputStream = response.getOutputStream();
        //2.输出数据
        outputStream.write("hello".getBytes());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
