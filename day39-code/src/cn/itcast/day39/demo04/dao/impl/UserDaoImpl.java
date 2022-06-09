package cn.itcast.day39.demo04.dao.impl;

import cn.itcast.day39.demo01.domain.User;
import cn.itcast.day39.demo04.dao.UserDao;
import cn.itcast.day39.demo05.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //使用JDBC操作数据库
        //1.定义sql
        String sql="select * from users";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        try {
            String sql = "select * from users where username = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void add(User user) {
        //1.定义sql
        String sql="insert into users values(null,?,?,?,?,?,?,null,null)";
        //2.执行sql
        template.update(sql,user.getName(),user.getGender(),user.getAge(),user.getAddress(),user.getQq(),user.getEmail());
    }

    @Override
    public void delete(int id) {
        //1.定义sql
        String sql="delete from users where id = ?";
        //2.执行sql
        template.update(sql,id);
    }

    @Override
    public User findById(int id) {
        String sql = "select * from users where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }

    @Override
    public void update(User user) {
        String sql = "update users set name = ?,gender = ? ,age = ? , address = ? , qq = ?, email = ? where id = ?";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());
    }

    @Override
    public int findTotalCount(Map<String, String[]> condition) {
        //1.定义一个模板sql（初始化sql）
        String sql="select count(*) from users where 1 = 1";
        StringBuilder sb=new StringBuilder(sql);
        //2.遍历map
        Set<String> keySet = condition.keySet();
        //定义一个参数的集合
        List<Object>params=new ArrayList<Object>();
        for (String key : keySet) {
            //排除分页条件参数
            if ("currentPage".equals(key) || "rows".equals(key)){
                continue;
            }

            //获取value
            String value = condition.get(key)[0];
            //判断value是否有值
            if (value!=null && !"".equals(value)){
                //有值
                sb.append(" and "+key+" like ? ");
                params.add("%"+value+"%");//加条件的值
            }
        }
        return template.queryForObject(sb.toString(),Integer.class,params.toArray());
    }

    @Override
    public List<User> findByPage(int start, int rows, Map<String, String[]> condition) {
        String sql="select * from users where 1 =1 ";
        StringBuilder sb=new StringBuilder(sql);
        //2.遍历map
        Set<String> keySet = condition.keySet();
        //定义一个参数的集合
        List<Object>params=new ArrayList<Object>();
        for (String key : keySet) {
            //排除分页条件参数
            if ("currentPage".equals(key) || "rows".equals(key)){
                continue;
            }

            //获取value
            String value = condition.get(key)[0];
            //判断value是否有值
            if (value!=null && !"".equals(value)){
                //有值
                sb.append(" and "+key+" like ? ");
                params.add("%"+value+"%");//加条件的值
            }
        }
        //添加分页查询
        sb.append(" limit ?,? ");
        //添加分页查询参数值
        params.add(start);
        params.add(rows);
        return template.query(sb.toString(),new BeanPropertyRowMapper<User>(User.class),params.toArray());
    }

}
