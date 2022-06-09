package cn.itcast.day32.demo01.Servlet;

import javax.servlet.*;
import java.io.IOException;

/*
    Servlet的方法
 */
public class Demo02Servlet implements Servlet {
    //初始化方法
    //在servlet被创建的时候执行，只会执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init....");
    }


    /**
     * 获取ServletConfig对象
     * ServletConfig：Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法
     * 每一次servlet被访问时执行，执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service....");
    }


    /**
     * 获取servlet的一些信息，版本，作者
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }


    /**
     * 销毁方法
     * 在servlet被杀死时执行（在服务器正常关闭时执行，执行一次）
     */
    @Override
    public void destroy() {
        System.out.println("destroy....");
    }
}
