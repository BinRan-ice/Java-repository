package cn.itcast.day46.demo02.web.servlet;

import cn.itcast.day46.demo01.domain.User;
import cn.itcast.day46.demo03.service.Impl.UserServiceImpl;
import cn.itcast.day46.demo03.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置编码
        request.setCharacterEncoding("utf-8");

        //2.获取数据
        //2.1获取验证码
        String verifycode = request.getParameter("verifycode");
        Map<String, String[]> parameterMap = request.getParameterMap();

        //3.验证码校验
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        //确保验证码的一次性
        session.removeAttribute("CHECKCODE_SERVER");
        if (!checkcode_server.equalsIgnoreCase(verifycode)){
            //验证码不正确
            //提示信息
            request.setAttribute("login_msg","验证码错误!");
            //跳转登录页面
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }

        //4.封装user对象
        User user=new User();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //5.调用service查询
        UserService service=new UserServiceImpl();
        User loginUser= service.login(user);

        //6.判断是否登陆成功
        if (loginUser!=null){
            //登陆成功
            //将用户存入session
            session.setAttribute("user",loginUser);
            //跳转页面
            response.sendRedirect(request.getContextPath()+"/studentindex.jsp");
        }else {
            //登陆失败
            //提示信息
            request.setAttribute("login_msg","用户名或密码错误!");
            //跳转登录页面
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
