package cn.itcast.day25.demo03.JDBCTemplate;

import cn.itcast.day25.demo02.utils.Demo01JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/*
    JDBCTemplate入门学习
 */
public class Demo01JdbcTemplate {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建jdbcTemplate对象
        JdbcTemplate template=new JdbcTemplate(Demo01JDBCUtils.getDataSource());
        //3.调用方法
        String sql="update account set money=5000 where id=?";
        int update = template.update(sql, 3);
        System.out.println(update);
    }
}
