package cn.itcast.day36.demo01.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo01Response")
public class Demo01Response extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo01....");

        /*//访问Demo01Response，会自动跳转Demo02Response
        //1.设置状态码为302
        response.setStatus(302);
        //2.设置响应头location
        response.setHeader("location","/day36/Demo02Response");*/

        //动态获取虚拟目录
        String contextPath = request.getContextPath();

        //简单地重定向方法
        response.sendRedirect(contextPath+"/Demo02Response");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
