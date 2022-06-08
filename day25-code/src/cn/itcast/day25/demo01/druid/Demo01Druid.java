package cn.itcast.day25.demo01.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Demo01Druid {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件
        //3.加载配置文件
        Properties pro=new Properties();
        InputStream resourceAsStream = Demo01Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(resourceAsStream);
        //4.获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        //5.获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
