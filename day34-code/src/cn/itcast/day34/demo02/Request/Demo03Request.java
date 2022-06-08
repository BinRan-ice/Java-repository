package cn.itcast.day34.demo02.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Demo03Request")
public class Demo03Request extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据：user-agent
        String header = request.getHeader("user-agent");
        //判断游览器版本
        if (header.contains("Chrome")) {
            System.out.println("谷歌来了");
        } else if (header.contains("Firefox")) {
            System.out.println("火狐来了");
        }
    }
}
