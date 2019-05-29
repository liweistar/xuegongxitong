<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/28
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>就业模块</title>
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
            <td>${work1.get(0).id}</td>
            <td>${work1.get(0).studentid}</td>
            <td>${work1.get(0).studentname}</td>
            <td>${work1.get(0).sex}</td>
            <td>${work1.get(0).age}</td>
            <td>${work1.get(0).state}</td>
            <td>${work1.get(0).local}</td>
            <td>${work1.get(0).phone}</td>
        </tr>

</table>
</body>
</html>
