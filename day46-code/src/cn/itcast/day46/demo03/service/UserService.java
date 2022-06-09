package cn.itcast.day46.demo03.service;

import cn.itcast.day46.demo01.domain.Aduser;
import cn.itcast.day46.demo01.domain.PageBean;
import cn.itcast.day46.demo01.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();

    /**
     * 普通用户登录方法
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 管理员登录方法
     * @param aduser
     * @return
     */
    Aduser adlogin(Aduser aduser);

    /**
     * 保存user
     * @param user
     */
    void addUser(User user);

    /**
     * 根据id删除user
     * @param id
     */
    void deleteUser(String id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findUserById(String id);

    /**
     * 修改学生信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除选中学生
     * @param uids
     */
    void delSelectedUser(String[] uids);

    /**
     * 分页查询
     * @param currentPage
     * @param rows
     * @param
     * @return
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
