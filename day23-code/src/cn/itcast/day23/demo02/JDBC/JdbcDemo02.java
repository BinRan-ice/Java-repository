package cn.itcast.day23.demo02.JDBC;

import java.sql.*;

public class JdbcDemo02 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast", "root", "root123456");
                //3.定义sql
                String sql="select * from account";
                //4.获取sql对象
                statement = connection.createStatement();
                //5.执行sql结果
                resultSet = statement.executeQuery(sql);
                //6.处理结果
                //6.1让游标向下移动一行
                /*if (resultSet.next()){
                    //6.2获取数据
                    int anInt = resultSet.getInt(1);
                    String string = resultSet.getString(2);
                    float aFloat = resultSet.getFloat(3);
                    System.out.println(anInt+"----"+string+"----"+aFloat);
                }*/
                while (resultSet.next()){
                    //循环判断游标是否是最后一行末尾
                    //获取数据
                    int anInt = resultSet.getInt(1);
                    String string = resultSet.getString(2);
                    float aFloat = resultSet.getFloat(3);
                    System.out.println(anInt+"----"+string+"----"+aFloat);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //避免空指针异常
            if (resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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
