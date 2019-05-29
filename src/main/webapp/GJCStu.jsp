<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/28
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1></h1>
<a href="${pageContext.request.contextPath}/work/showOne?studentid=${sessionScope.student1.username}">就业信息查询</a></p>
<a href="${pageContext.request.contextPath}/graduation/showOne?studentid=${sessionScope.student1.username}">毕业信息查询</a></p>
<a href="${pageContext.request.contextPath}/internship/showOne?studentid=${sessionScope.student1.username}">实习信息查询</a></p>
<a href="${pageContext.request.contextPath}/spay/showOne?studentid=${sessionScope.student1.username}">缴费信息查询</a></p>
</body>
</html>
