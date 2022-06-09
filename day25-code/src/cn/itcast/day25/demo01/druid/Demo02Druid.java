package cn.itcast.day25.demo01.druid;

import cn.itcast.day25.demo02.utils.Demo01JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
    使用新的工具类
 */
public class Demo02Druid {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        //1.获取连接
        try {
            connection = Demo01JDBCUtils.getConnection();
            //2.定义sql
            String sql="insert into account values(?,?,?)";
            //3.获取pstmt对象
            preparedStatement = connection.prepareStatement(sql);
            //4.给？赋值
            preparedStatement.setInt(1,5);
            preparedStatement.setString(2,"e");
            preparedStatement.setFloat(3,2000);
            //5.执行sql
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            Demo01JDBCUtils.close(preparedStatement,connection);
        }
    }
}
