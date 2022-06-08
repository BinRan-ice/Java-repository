package cn.itcast.day24.demo02.test;

import cn.itcast.day24.demo01.junit.Calculate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
##Junit单元测试:
    测试分类:
        1．黑盒测试:不需要写代码，给输入值，看程序是否能够输出期望的值。
        2．白盒测试∶需要写代码的。关注程序具体的执行流程。
Junit使用∶白盒测试
    *步骤:
        1．定义一个测试类(测试用例)
    *建议∶
            测试类名:被测试的类名Test calculatorTest
            包名∶xx×.xxx.xx.test  cn.itcast.test
        2．定义测试方法:可以独立运行
    *建议∶
            *方法名: test测试的方法名    testAdd()
            *返回值: void
             *参数列表:空参
        3．给方法加@Test
        4．导入junit依赖环境
    *判定结果∶
    *红色:失败
    *绿色:成功

 */

public class CalculatorText {
    /*
        初始化方法：
            用于资源的申请 所有测试方法在执行前都会执行该方法
     */
    @Before
    public void init(){
        System.out.println("init....");
    }

    /*
        释放资源 所有测试方法在执行后都会执行该方法
     */
    @After
    public void close(){
        System.out.println("close....");
    }

    /*
        测试add方法
     */
    @Test
    public void testAdd(){
        //System.out.println("我被执行了");
        //1.创建计算器对象
        Calculate calculate=new Calculate();
        //2.调用add方法
        int result = calculate.add(1, 2);
        System.out.println("textadd.....");
        //3.断言  我断言这个结果是三
        Assert.assertEquals(3,result);
    }
}
