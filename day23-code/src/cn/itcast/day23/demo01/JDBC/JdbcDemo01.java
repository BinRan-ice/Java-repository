package cn.itcast.day23.demo01.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
    JDBC快速入门

 */
public class JdbcDemo01 {
    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库的连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast", "root", "root123456");
        //4.定义sql语句
        String sql="update account set money=500 where id=1";
        //5.获取执行sql对象 Statement
        Statement statement = connection.createStatement();
        //6.执行sql 返回值是影响的行数
        int i = statement.executeUpdate(sql);
        //7.处理结果
        System.out.println(i);
        //8.释放资源
        statement.close();
        connection.close();
    }
}
