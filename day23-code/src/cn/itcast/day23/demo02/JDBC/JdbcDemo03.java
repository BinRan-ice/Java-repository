package cn.itcast.day23.demo02.JDBC;

import cn.itcast.day23.demo03.t_train_stop.t_train_stop;
import cn.itcast.day23.demo04.JDBC.JdbcUtilDemo01;

import java.io.Reader;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    定义一个方法，查询EMP表的数据将其封装为对象，然后装载集合，返回
 */
public class JdbcDemo03 {
    public static void main(String[] args) {
        List<t_train_stop> list = new JdbcDemo03().findAll2();
        Iterator<t_train_stop> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public List<t_train_stop> findAll(){
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        List<t_train_stop>list=null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_demo", "root", "root123456");
                //3.定义sql
                String sql="select * from t_train_stop";
                //4.获取执行sql的对象
                statement = connection.createStatement();
                //5.执行sql
                resultSet = statement.executeQuery(sql);
                //6.遍历结果集，封装对象，装载集合
                t_train_stop train_stop=null;
                list =new ArrayList<>();
                while (resultSet.next()){
                    //获取数据
                    int train_id = resultSet.getInt(1);
                    int stop_id = resultSet.getInt(2);
                    String city_name = resultSet.getString(3);
                    String station_name = resultSet.getString(4);
                    Date arrive_time = resultSet.getDate(5);
                    int stop_time = resultSet.getInt(6);
                    String mileage = resultSet.getString(7);
                    //创建t_train_stop对象
                    train_stop=new t_train_stop();
                    train_stop.setTrain_id(train_id);
                    train_stop.setStop_id(stop_id);
                    train_stop.setCitr_name(city_name);
                    train_stop.setStation_name(station_name);
                    train_stop.setArrive_time(arrive_time);
                    train_stop.setStop_time(stop_time);
                    train_stop.setMileage(mileage);
                    //装载集合
                    list.add(train_stop);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
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
        return list;
    }

    public List<t_train_stop> findAll2(){
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        List<t_train_stop>list=null;
            try {
                /*//1.注册驱动
                Class.forName("com.mysql.jdbc.Driver");
                //2.获取连接
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_demo", "root", "root123456");*/
                connection=JdbcUtilDemo01.getConnection();
                //3.定义sql
                String sql="select * from t_train_stop";
                //4.获取执行sql的对象
                statement = connection.createStatement();
                //5.执行sql
                resultSet = statement.executeQuery(sql);
                //6.遍历结果集，封装对象，装载集合
                t_train_stop train_stop=null;
                list =new ArrayList<>();
                while (resultSet.next()){
                    //获取数据
                    int train_id = resultSet.getInt(1);
                    int stop_id = resultSet.getInt(2);
                    String city_name = resultSet.getString(3);
                    String station_name = resultSet.getString(4);
                    Date arrive_time = resultSet.getDate(5);
                    int stop_time = resultSet.getInt(6);
                    String mileage = resultSet.getString(7);
                    //创建t_train_stop对象
                    train_stop=new t_train_stop();
                    train_stop.setTrain_id(train_id);
                    train_stop.setStop_id(stop_id);
                    train_stop.setCitr_name(city_name);
                    train_stop.setStation_name(station_name);
                    train_stop.setArrive_time(arrive_time);
                    train_stop.setStop_time(stop_time);
                    train_stop.setMileage(mileage);
                    //装载集合
                    list.add(train_stop);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
            /*if (resultSet!=null){
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
            }*/
                JdbcUtilDemo01.close(statement,connection,resultSet);
        }
        return list;
    }
}
