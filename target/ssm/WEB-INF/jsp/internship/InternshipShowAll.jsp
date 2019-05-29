<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/29
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>实习模块</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/internship/toadd">新增</a>
<table border="1">
    <thead>
    <tr>
        <td>编号</td>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>实习状态</td>
        <td>地址</td>
        <td>电话</td>

        <td>操作</td>
    </tr>
    </thead>

    <c:forEach items="${intstudents}" var="a">
        <tr>
            <td><c:out value="${a.id}"></c:out></td>
            <td><c:out value="${a.studentid}"></c:out></td>
            <td><c:out value="${a.studentname}"></c:out></td>
            <td><c:out value="${a.sex}"></c:out></td>
            <td><c:out value="${a.age}"></c:out></td>
            <td><c:out value="${a.behave}"></c:out></td>
            <td><c:out value="${a.local}"></c:out></td>
            <td><c:out value="${a.phone}"></c:out></td>
            <td><a href="${pageContext.request.contextPath}/internship/delete?id=${a.id}">删除</a>
                <a href="${pageContext.request.contextPath}/internship/toupdata?id=${a.id}">修改</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
