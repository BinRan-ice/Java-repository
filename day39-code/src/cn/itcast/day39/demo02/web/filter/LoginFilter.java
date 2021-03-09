package cn.itcast.day39.demo02.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 登录验证的过滤器
 */
@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.获取资源的请求路径
        HttpServletRequest request = (HttpServletRequest) req;
        String requestURI = request.getRequestURI();
        //2.判断是否包含登录相关资源路径,要注意排除掉 css/js/图片/验证码等资源
        if (requestURI.contains("/login.jsp") || requestURI.contains("/loginServlet")||requestURI.contains("/css/")||requestURI.contains("/js/")||requestURI.contains("/fonts/")||requestURI.contains("/checkCodeServlet")) {
            //包含，用户想登录
            chain.doFilter(req, resp);
        } else {
            //不包含，需要验证用户是否登录
            //3.从获取session中获取user
            Object user = request.getSession().getAttribute("user");
            if (user != null) {
                //登录了。放行
                chain.doFilter(req, resp);
            } else {
                //没有登录。跳转登录页面

                request.setAttribute("login_msg", "您尚未登录，请登录");
                request.getRequestDispatcher("/login.jsp").forward(request, resp);
            }

            //chain.doFilter(req, resp);
        }
    }
    public void init(FilterConfig config) throws ServletException {

    }

}
