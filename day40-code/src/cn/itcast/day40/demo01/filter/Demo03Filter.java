package cn.itcast.day40.demo01.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class Demo03Filter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //对request对象请求消息增强
        System.out.println("Demo03Filter.....");

        //放行
        chain.doFilter(req, resp);
        //对response的响应消息增强
        System.out.println("Demo03Filter....回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
