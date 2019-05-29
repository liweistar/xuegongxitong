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
    <title>实习模块修改</title>
</head>
<body>
<form ACTION="${pageContext.request.contextPath}/internship/updata">
    <input type="hidden" value="${internship.id}" name="id">
    <a>学号<input type="text" value="${internship.studentid}" name="studentid"></a></p>
    <a>姓名<input type="text" value="${internship.studentname}" name="studentname"></a></p>
    <a>性别<input type="text" value="${internship.sex}" name="sex"></a></p>
    <a>年龄<input type="text" value="${internship.age}" name="age"></a></p>
    <a>就业状态<input type="text" value="${internship.behave}" name="behave"></a></p>
    <a>地址<input type="text" value="${internship.local}" name="local"></a></p>
    <a>电话<input type="text" value="${internship.phone}" name="phone"></a></p>


    <input type="submit" value="提交">
</form>
</body>
</html>
