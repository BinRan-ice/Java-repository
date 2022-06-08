package cn.itcast.day46.demo03.service.Impl;

import cn.itcast.day46.demo01.domain.Aduser;
import cn.itcast.day46.demo01.domain.PageBean;
import cn.itcast.day46.demo01.domain.User;
import cn.itcast.day46.demo03.service.UserService;
import cn.itcast.day46.demo04.dao.Impl.UserDaoImpl;
import cn.itcast.day46.demo04.dao.UserDao;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();
    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public Aduser adlogin(Aduser aduser) {
        return dao.findAduserByUsernameAndPassword(aduser.getAdusername(),aduser.getAdpassword());
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void delSelectedUser(String[] uids) {
       //1.遍历数组
        for (String uid : uids) {
            dao.delete(Integer.parseInt(uid));
        }
    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        int currentPage=Integer.parseInt(_currentPage);
        int rows=Integer.parseInt(_rows);

        if (currentPage<=0){
            currentPage=1;
        }

        //1.创建空的PageBean对象
        PageBean<User> pb=new PageBean<User>();

        //2.设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        //3.调用dao查询记录总数
        int totalCount=dao.findTotalCount(condition);
        pb.setTotalCount(totalCount);

        //4.调用dao查询list集合
        //计算开始记录的索引
        int start=(currentPage-1)*rows;
        List<User> list= dao.findByPage(start,rows,condition);
        pb.setList(list);

        //5.计算总页码
        int totalPage=(totalCount % rows)==0 ? (totalCount/rows) : (totalCount/rows)+1;
        pb.setTotalPage(totalPage);
        return pb;
    }


}
