<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>学生信息展示</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <script>
        //将数据行的奇数行背景色设置为 pink，偶数行背景色设置为 yellow
        $(function () {
            //1. 获取数据行的奇数行的tr，设置背景色为pink
            $("table tr:gt(0):odd").css("backgroundColor","#82D9FF");
            //2. 获取数据行的偶数行的tr,设置背景色为yellow
            $("table tr:gt(0):even").css("backgroundColor","#FFAA00");
        });
    </script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
        #btn_{
            float:right;
        }
        .h3{
            color: red;
        }
        body{
            background: url("img/background.jpg");
            background-repeat: no-repeat;
            background-size: 100% auto;
        }
    </style>

    <script>
        function deleteUser(id) {
            //用户安全提示
            if(confirm("您确定要删除么？")){
                //访问路径
                location.href="${pageContext.request.contextPath}/delUserServlet?id="+id;
            }
        }

        window.onload=function () {
            //给删除选中按钮添加单击事件
            document.getElementById("delSelected").onclick=function () {
                if(confirm("您确定要删除选中条目么？")){
                    var flag=false;
                    //判断是否有选中条目
                    let cbs = document.getElementsByName("uid");
                    for (let i = 0; i < cbs.length; i++) {
                        if(cbs[i].checked){
                            //有一个条目选中
                            flag=true;
                            break;
                        }
                    }
                    if (flag){
                        //提交表单
                        document.getElementById("form").submit();
                    }
                }
            }

            //1.获取第一个cb
            document.getElementById("firstCb").onclick=function () {
                //2.获取下边列表中所有的cb
                let cbs = document.getElementsByName("uid");
                //3.遍历
                for (let i = 0; i < cbs.length; i++) {
                    //4.设置这些cbs[i]的状态=firstcb
                    cbs[i].checked=this.checked;
                }
            }
        }
    </script>
</head>
<body>
<div class="container">
    <h3 style="text-align: center" class="h3">学生信息列表</h3>

    <div style="float:left;">
        <form class="form-inline" action="${pageContext.request.contextPath}/findUserByPageServlet" method="post">
            <div class="form-group">
                <label for="exampleInputName">姓名</label>
                <input type="text" name="name"  value="${condition.name[0]}" class="form-control" id="exampleInputName" placeholder="请输入姓名">
            </div>
            <div class="form-group">
                <label for="exampleInputStnum">学号</label>
                <input type="text" name="stunum" value="${condition.stunum[0]}" class="form-control" id="exampleInputStnum" placeholder="请输入学号">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail2">邮件</label>
                <input type="email" name="email" value="${condition.email[0]}" class="form-control" id="exampleInputEmail2" placeholder="请输入邮件">
            </div>
            <button type="submit" class="btn btn btn-primary">查询</button>
        </form>
    </div>

    <div style="float: right;margin: 5px">
        <a class="btn btn-success" href="${pageContext.request.contextPath}/add.jsp">添加学生</a>
        <a class="btn btn-info" href="javascript:void(0);" id="delSelected">删除选中</a>
        <a class="btn btn-warning" href="add.html">抽签排序</a>
    </div>

    <form id="form" action="${pageContext.request.contextPath}/delSelectedServlet" method="post">
    <table border="1" class="table table-bordered table-hover">
        <tr style="background-color: #999999;">
            <th><input type="checkbox" id="firstCb"></th>
            <th>编号</th>
            <th>姓名</th>
            <th>学号</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pb.list}" var="user" varStatus="s">
            <tr id="row">
                <td><input type="checkbox" name="uid" value="${user.id}"></td>
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.stunum}</td>
                <td>${user.gender}</td>
                <td>${user.age}</td>
                <td>${user.address}</td>
                <td>${user.qq}</td>
                <td>${user.email}</td>
                <td><a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/findUserServlet?id=${user.id}">修改</a>&nbsp;<a class="btn btn-default btn-sm" href="javascript:deleteUser(${user.id});">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    </form>

    <div>
        <nav>
            <ul class="pagination">
                <c:if test="${pb.currentPage==1}">
                <li class="disabled">
                    </c:if>

                    <c:if test="${pb.currentPage!=1}">
                <li>
                    </c:if>

                    <a href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pb.currentPage-1}&rows=5&name=${condition.name[0]}&stunum=${condition.stunum[0]}&email=${condition.email[0]}"
                       aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                 </li>

                <c:forEach begin="1" end="${pb.totalPage}" var="i">
                    <c:if test="${pb.currentPage==i}">
                        <li class="active"><a href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${i}&rows=5&name=${condition.name[0]}&stunum=${condition.stunum[0]}&email=${condition.email[0]}">${i}</a></li>
                    </c:if>

                    <c:if test="${pb.currentPage!=i}">
                        <li><a href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${i}&rows=5&name=${condition.name[0]}&stunum=${condition.stunum[0]}&email=${condition.email[0]}">${i}</a></li>
                    </c:if>
                </c:forEach>


                     <c:if test="${pb.currentPage!=pb.totalPage}">
                    <li>
                        <a href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pb.currentPage+1}&rows=5&name=${condition.name[0]}&stunum=${condition.stunum[0]}&email=${condition.email[0]}"
                           aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                     </c:if>
                    <span style="font-size: 25px;margin-left: 5px">
                    共${pb.totalCount}条记录，共${pb.totalPage}页
                </span>
            </ul>
        </nav>
    </div>
</div>
</body>
</html>
