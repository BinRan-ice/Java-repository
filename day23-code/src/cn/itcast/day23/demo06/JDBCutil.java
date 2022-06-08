package cn.itcast.day23.demo06;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 * */

public class JDBCutil {
    //只有静态变量才能被静态代码块执行
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    /**
     * 不想传递参数，还得保证工具类的通用性
     * 解决：配置文件
     * jdbc.properties
     * url = jdbc:mysql://127.0.0.1:3306/my_sql_test?serverTimezone=UTC
     * user = root
     * password = 071126
     * driver = com.mysql.cj.jdbc.Driver
     * 只需要读取文件一次就可拿到全部的值
     * 使用静态代码块
     * */
    static{
//获取资源文件，读取值
        //使用Properties集合类
        Properties properties = new Properties();
        //加载文件
        try {

            //获取文件资源的路径
            ClassLoader classLoader = JDBCutil.class.getClassLoader();
            URL url1 = classLoader.getResource("jdbc.properties");
            String path = url1.getPath();
            properties.load(new FileReader(path));
            /**
             * 获取src路径下的文件方式---->ClassLoader
             * */
            //获取数据赋值
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取连接
     * @return连接对象
     * */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
    /**
     * 释放资源
     * */
    public static void close(Statement statement,Connection connection){
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(ResultSet resultSet,Statement statement, Connection connection){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(statement,connection);
    }
}
