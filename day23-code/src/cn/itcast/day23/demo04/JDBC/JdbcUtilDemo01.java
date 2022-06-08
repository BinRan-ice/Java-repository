package cn.itcast.day23.demo04.JDBC;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/*
    JDBC工具类
 */
public class JdbcUtilDemo01 {
    private  static String url;
    private  static String user;
    private  static String password;
    private  static String driver;
    /*
        文件的读取，只需要读取一次即可拿到这些值，使用静态代码块
     */
    static {
        //读取资源文件，获取值
        //2.加载文件
        try {
            //1.创建Properties集合类
            Properties pro=new Properties();
            //获取src路径下的文件方式-->ClassLoader 类加载器
            ClassLoader classLoader = JdbcUtilDemo01.class.getClassLoader();
            URL resource = classLoader.getResource("jdbc.properties");
            String path = resource.getPath();
            //2.加载文件
            pro.load(new FileReader(path));
            //3.获取数据，赋值
            url=pro.getProperty("url");
            user=pro.getProperty("user");
            password=pro.getProperty("password");
            driver=pro.getProperty("driver");
            //4.注册驱动
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
        获取连接 返回连接对象
     */
    public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection(url,user,password);
    }

    /*
        释放资源
     */
    public static void close(Statement statement,Connection connection){
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    /*
        释放资源
     */
    public static void close(Statement statement, Connection connection, ResultSet resultSet){
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
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
