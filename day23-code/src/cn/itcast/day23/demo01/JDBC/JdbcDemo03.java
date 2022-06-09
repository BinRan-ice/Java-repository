package cn.itcast.day23.demo01.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    account表 修改记录
 */
public class JdbcDemo03 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接对象
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast", "root", "root123456");
                //3.定义sql
                String sql="update account set name = 'e' where id = 5";
                //4.获取执行sql的对象
                 statement = connection.createStatement();
                //5.执行sql
                int i = statement.executeUpdate(sql);
                //6.处理结果
                if (i>0){
                    System.out.println("添加成功");
                }else {
                    System.out.println("添加失败");

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //避免空指针异常
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
