package cn.itcast.day09.demo03;

/*
方法覆盖重写的注意事项：
1.必须保证父子类之间方法的名称相同，参数列表也相同。
@Override:写在方法前面，用来检测是不是有效的正确覆盖书写
这个注解就算不写，只要满足要求，也是正确的方法覆盖重写

2.子类方法的返回值必须小于等于父类方法的返回值范围
Object类是所有类的公共最高类（祖宗类）

3.子类方法的权限必须大于等于父类方法的权限修饰符
小扩展提示：public>protected>(default)>private
备注：（default）不是关键字default，而是什么都不写，留空
*/

public class Demo01Override {
    public static void main(String[] args) {

    }
}
