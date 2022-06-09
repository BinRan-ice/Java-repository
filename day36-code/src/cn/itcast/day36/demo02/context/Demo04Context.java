package cn.itcast.day36.demo02.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo04Context")
public class Demo04Context extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          /*1. 获取MIME类型：
            2. 域对象：共享数据
                1. setAttribute(String name,Object value)
                2. getAttribute(String name)
                3. removeAttribute(String name)

                * ServletContext对象范围：所有用户所有请求的数据
            3. 获取文件的真实(服务器)路径
        */

        //2.通过HttpServlet
        ServletContext context1 = this.getServletContext();

        //获取数据
        Object msg = context1.getAttribute("msg");
        System.out.println(msg);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
