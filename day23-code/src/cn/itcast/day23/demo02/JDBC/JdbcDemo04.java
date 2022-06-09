package cn.itcast.day23.demo02.JDBC;

import cn.itcast.day23.demo04.JDBC.JdbcUtilDemo01;

import java.sql.*;
import java.util.Scanner;

/*
    需求：
        1.通过键盘录入用户名和密码
        2.判断用户是否登陆成功
 */
public class JdbcDemo04 {
    public static void main(String[] args) {
        //1.键盘录入，接收用户名和密码
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        boolean login2 = new JdbcDemo04().login(username, password);
        if (login2){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
        //2.调用方法
        //3.判断结果，输出不同语句
    }
    /*
        登录方法
     */
    public boolean login(String username,String password){
        if (username==null||password==null){
            return false;
        }
        //连接数据库判断是否登陆成功
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        //1.获取连接
        try {
            connection = JdbcUtilDemo01.getConnection();
            //2.定义sql
            String sql="select * from user where username = '"+username+"' and password = '"+password+"' ";
            //3.获取执行sql的对象
            statement = connection.createStatement();
            //4.执行查询
            resultSet = statement.executeQuery(sql);
            //5.判断
            return resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtilDemo01.close(statement,connection,resultSet);
        }
        return false;
    }

    /*
        登录方法使用PreparedStatement实现
     */
    public boolean login2(String username,String password){
        if (username==null||password==null){
            return false;
        }
        //连接数据库判断是否登陆成功
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        //1.获取连接
        try {
            connection = JdbcUtilDemo01.getConnection();
            //2.定义sql
            String sql="select * from user where username = ? and password = ?";
            //3.获取执行sql的对象
            preparedStatement = connection.prepareStatement(sql);
            //给？赋值
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            //4.执行查询
            resultSet = preparedStatement.executeQuery();
            //5.判断
            return resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtilDemo01.close(preparedStatement,connection,resultSet);
        }
        return false;
    }
}
