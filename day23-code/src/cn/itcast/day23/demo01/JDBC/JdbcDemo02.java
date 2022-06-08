package cn.itcast.day23.demo01.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    account表 添加一条记录 insert语句
 */
public class JdbcDemo02 {
    public static void main(String[] args) {
        Statement statement=null;
        Connection connection=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql= "insert into account values(null,'d',3000)";
            //3.获取connection对象
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast", "root", "root123456");
                //4.获取执行sql的对象 Statement
                statement = connection.createStatement();
                //5.执行sql
                int i = statement.executeUpdate(sql);//影响的行数
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
