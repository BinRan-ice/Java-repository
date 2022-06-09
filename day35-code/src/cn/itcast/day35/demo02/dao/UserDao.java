package cn.itcast.day35.demo02.dao;

import cn.itcast.day35.demo01.domain.User;
import cn.itcast.day35.demo03.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.*;

/**
 * 操作数据库中user表的类
 */
public class UserDao {
    //声明JDBCTemplate对象共用
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 登录方法
     * @param loginUser 只有用户名和密码
     * @return user包含用户全部数据,没有查询到，返回null
     */
    public User login(User loginUser){
        try {
            //1.编写sql
            String sql="select * from user where username= ? and password = ? ";
            //2.调用query方法
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), loginUser.getUsername(), loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
