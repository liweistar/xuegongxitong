<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/29
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>实习模块</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <td>编号</td>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>就业状态</td>
        <td>地址</td>
        <td>电话</td>

    </tr>
    </thead>




    <tr>
        <td>${internship1.get(0).id}</td>
        <td>${internship1.get(0).studentid}</td>
        <td>${internship1.get(0).studentname}</td>
        <td>${internship1.get(0).sex}</td>
        <td>${internship1.get(0).age}</td>
        <td>${internship1.get(0).behave}</td>
        <td>${internship1.get(0).local}</td>
        <td>${internship1.get(0).phone}</td>

    </tr>

</table>
</body>
</html>
