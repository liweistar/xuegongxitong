<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/28
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>就业模块add</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/work/add">
    <a>学号<input type="text" name="studentid"></a></p>
    <a>姓名<input type="text" name="studentname"></a></p>
    <a>性别<input type="text" name="sex"></a></p>
    <a>年龄<input type="text" name="age"></a></p>
    <a>就业状态<input type="text" name="state"></a></p>
    <a>地址<input type="text" name="local"></a></p>
    <a>电话<input type="text" name="phone"></a></p>
    <input type="submit" value="提交">

</form>
</body>
</html>
