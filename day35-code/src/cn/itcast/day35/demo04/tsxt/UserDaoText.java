package cn.itcast.day35.demo04.tsxt;

import cn.itcast.day35.demo01.domain.User;
import cn.itcast.day35.demo02.dao.UserDao;
import org.junit.Test;

public class UserDaoText {
    @Test
    public void testLogin(){
        User user =new User();
        user.setUsername("superbaby");
        user.setPassword("123");
        UserDao dao=new UserDao();
        User login = dao.login(user);
        System.out.println(login);
    }
}
