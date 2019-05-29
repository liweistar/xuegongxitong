
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/29
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>缴费模块</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/spay/toadd">新增</a>
<table border="1">
    <thead>
    <tr>
        <td>编号</td>
        <td>学号</td>
        <td>姓名</td>
        <td>学费</td>
        <td>缴费状态</td>
        <td>住宿费</td>
        <td>缴费状态</td>
        <td>操作</td>
    </tr>
    </thead>

    <c:forEach items="${spastudents}" var="a">
        <tr>
            <td><c:out value="${a.id}"></c:out></td>
            <td><c:out value="${a.studentid}"></c:out></td>
            <td><c:out value="${a.studentname}"></c:out></td>
            <td><c:out value="${a.tution}"></c:out></td>
            <td><c:out value="${a.tstate}"></c:out></td>
            <td><c:out value="${a.accex}"></c:out></td>
            <td><c:out value="${a.astate}"></c:out></td>
            <td><a href="${pageContext.request.contextPath}/spay/delete?id=${a.id}">删除</a>
                <a href="${pageContext.request.contextPath}/spay/toupdata?id=${a.id}">修改</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
