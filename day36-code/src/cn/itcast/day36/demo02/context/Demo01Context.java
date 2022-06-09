package cn.itcast.day36.demo02.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo01Context")
public class Demo01Context extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        ServletContext的获取
        1.通过request对象获取
            request.getServletContext();
        2.通过HttpServlet
            this.getServletContext();
        */
        //1.通过request对象获取
        ServletContext context = request.getServletContext();
        //2.通过HttpServlet
        ServletContext context1 = this.getServletContext();
        System.out.println(context==context1);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
