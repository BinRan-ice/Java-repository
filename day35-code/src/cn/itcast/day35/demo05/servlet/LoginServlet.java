package cn.itcast.day35.demo05.servlet;

import cn.itcast.day35.demo01.domain.User;
import cn.itcast.day35.demo02.dao.UserDao;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置编码
        request.setCharacterEncoding("utf-8");
        /*//2.获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //3.封装对象
        User loginuser=new User();
        loginuser.setUsername(username);
        loginuser.setPassword(password);*/

        //2.获取所有请求参数
        Map<String, String[]> map = request.getParameterMap();
        //3.创建一个user对象
        User loginuser=new User();
        //3.2使用BeanUtil封装
        try {
            BeanUtils.populate(loginuser,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //4.调用UserDao的login方法
        UserDao userDao=new UserDao();
        User user = userDao.login(loginuser);
        //5.判断user
        if(user==null){
            //登陆失败
            request.getRequestDispatcher("/failServlet").forward(request,response);
        }else{
            //登陆成功
            //存储数据
            request.setAttribute("user",user);
            //转发
            request.getRequestDispatcher("/successServlet").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
