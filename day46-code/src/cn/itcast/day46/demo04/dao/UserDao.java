package cn.itcast.day46.demo04.dao;

import cn.itcast.day46.demo01.domain.Aduser;
import cn.itcast.day46.demo01.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户操作的Dao
 */
public interface UserDao {
    public List<User> findAll();

    User findUserByUsernameAndPassword(String username, String password);

    Aduser findAduserByUsernameAndPassword(String adusername, String adpassword);

    void add(User user);

    void delete(int parseInt);

    User findById(int parseInt);

    void update(User user);

    int findTotalCount(Map<String, String[]> condition);

    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}
