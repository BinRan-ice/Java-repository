<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- HTML5文档-->
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style>
        .error{
            color: red;
        }
        body{
            background: url("img/background.jpg");
            background-repeat: no-repeat;
            background-size: 100% auto;
        }
    </style>

    <script>
        /*
            1.给表单绑定onsubmit事件 监听器中判断每一个方法校验的结果
                如果都为true，返回true 如果有一个返回false 则返回false
            2.定义一些方法分别校验表单项
            3.给各个表单项绑定离焦事件
        */
        window.onload=function () {
            document.getElementById("form").onsubmit=function () {
                return checkUsername()&&checkStunum()&&checkAge()&&checkEmail()&&checkQq();
            }
            document.getElementById("name").onblur=checkUsername;
            document.getElementById("stunum").onblur=checkStunum;
            document.getElementById("age").onblur=checkAge;
            document.getElementById("email").onblur=checkEmail;
            document.getElementById("qq").onblur=checkQq;
        }

        //校验用户名
        function checkUsername() {
            let username = document.getElementById("name").value;
            var reg_name=/^[\u4E00-\u9FA5A-Za-z]+$/;
            let flag = reg_name.test(username);
            var s_username=document.getElementById("s_username");
            if (flag){
                s_username.innerHTML="<img width='35' height='25' src='img/gou.png'/>"
            }else{
                s_username.innerHTML="用户名格式有误"
            }
            return flag;
        }

        //校验学号
        function checkStunum() {
            let stunum = document.getElementById("stunum").value;
            var reg_name=/^\d{9}$/;
            let flag = reg_name.test(stunum);
            var s_stunum=document.getElementById("s_stunum");
            if (flag){
                s_stunum.innerHTML="<img width='35' height='25' src='img/gou.png'/>"
            }else{
                s_stunum.innerHTML="学号格式有误"
            }
            return flag;
        }

        //校验年龄
        function checkAge() {
            let age = document.getElementById("age").value;
            var reg_name=/^\d{1,3}$/;
            let flag = reg_name.test(age);
            var s_age=document.getElementById("s_age");
            if (flag){
                s_age.innerHTML="<img width='35' height='25' src='img/gou.png'/>"
            }else{
                s_age.innerHTML="年龄格式有误"
            }
            return flag;
        }

        //校验qq
        function checkQq() {
            let qq = document.getElementById("qq").value;
            var reg_name=/^\d{3,10}$/;
            let flag = reg_name.test(qq);
            var s_qq=document.getElementById("s_qq");
            if (flag){
                s_qq.innerHTML="<img width='35' height='25' src='img/gou.png'/>"
            }else{
                s_qq.innerHTML="qq格式有误"
            }
            return flag;
        }

        //校验邮箱
        function checkEmail() {
            let email = document.getElementById("email").value;
            var reg_name=/^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/;
            let flag = reg_name.test(email);
            var s_email=document.getElementById("s_email");
            if (flag){
                s_email.innerHTML="<img width='35' height='25' src='img/gou.png'/>"
            }else{
                s_email.innerHTML="邮箱格式有误"
            }
            return flag;
        }
    </script>
</head>
<body>
<div class="container">
    <center><h3>添加学生页面</h3></center>
    <form action="${pageContext.request.contextPath}/addUserServlet" method="post" id="form">
        <div class="form-group">
            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
            <span id="s_username" class="error"></span>
        </div>

        <div class="form-group">
            <label for="name">学号</label>
            <input type="text" class="form-control" id="stunum" name="stunum" placeholder="请输入学号">
            <span id="s_stunum" class="error"></span>
        </div>

        <div class="form-group">
            <label>性别：</label>
            <input type="radio" name="gender" value="男" checked="checked"/>男
            <input type="radio" name="gender" value="女"/>女
        </div>

        <div class="form-group">
            <label for="age">年龄：</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄">
            <span id="s_age" class="error"></span>
        </div>

        <div class="form-group">
            <label for="address">籍贯：</label>
            <select name="address" class="form-control" id="address">
                <option value="广东">广东</option>
                <option value="广西">广西</option>
                <option value="湖南">湖南</option>
                <option value="河南">河南</option>
                <option value="黑龙江">黑龙江</option>
                <option value="北京">北京</option>
            </select>
        </div>

        <div class="form-group">
            <label for="qq">QQ：</label>
            <input type="text" class="form-control" name="qq" id="qq" placeholder="请输入QQ号码"/>
            <span id="s_qq" class="error"></span>
        </div>

        <div class="form-group">
            <label for="email">Email：</label>
            <input type="text" class="form-control" name="email" id="email" placeholder="请输入邮箱地址"/>
            <span id="s_email" class="error"></span>
        </div>

        <div class="form-group" style="text-align: center">
            <input class="btn btn-success" type="submit" value="提交" />
            <input class="btn btn-info" type="reset" value="重置" />
            <input class="btn btn-warning" type="button" value="返回" />
        </div>
    </form>
</div>
</body>
</html>