package cn.itcast.day35.demo04.tsxt;

import cn.itcast.day35.demo01.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {

    @Test
    public void Test(){
        User user=new User();

        try {
            BeanUtils.setProperty(user,"username","zhangsan");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
