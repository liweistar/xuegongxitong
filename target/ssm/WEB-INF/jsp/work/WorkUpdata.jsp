<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/28
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>就业模块修改</title>
</head>
<body>
<form ACTION="${pageContext.request.contextPath}/work/updata">
    <input type="hidden" value="${work.id}" name="id">
    <a>学号<input type="text" value="${work.studentid}" name="studentid"></a></p>
    <a>姓名<input type="text" value="${work.studentname}" name="studentname"></a></p>
    <a>性别<input type="text" value="${work.sex}" name="sex"></a></p>
    <a>年龄<input type="text" value="${work.age}" name="age"></a></p>
    <a>就业状态<input type="text" value="${work.state}" name="state"></a></p>
    <a>地址<input type="text" value="${work.local}" name="local"></a></p>
    <a>电话<input type="text" value="${work.phone}" name="phone"></a></p>


    <input type="submit" value="提交">
</form>
</body>
</html>
