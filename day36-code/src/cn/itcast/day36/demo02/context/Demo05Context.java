package cn.itcast.day36.demo02.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo05Context")
public class Demo05Context extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          /*1. 获取MIME类型：
            2. 域对象：共享数据
            3. 获取文件的真实(服务器)路径
                1. 方法：String getRealPath(String path)
				 String b = context.getRealPath("/b.txt");//web目录下资源访问
		         System.out.println(b);

		        String c = context.getRealPath("/WEB-INF/c.txt");//WEB-INF目录下的资源访问
		        System.out.println(c);

		        String a = context.getRealPath("/WEB-INF/classes/a.txt");//src目录下的资源访问
		        System.out.println(a);
        */

        //2.通过HttpServlet
        ServletContext context1 = this.getServletContext();

        //获取文件的真实路径
        String realPath = context1.getRealPath("/b.txt");//web目录下资源访问
        String realPath1 = context1.getRealPath("/WEB-INF/c.txt");//WEB-INF目录下的资源访问
        String realPath2 = context1.getRealPath("/WEB-INF/classes/a.txt");//src目录下的资源方位
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
