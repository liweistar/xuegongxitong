<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/29
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>毕业模块add</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/graduation/add">
    <a>学号<input type="text" name="studentid"></a></p>
    <a>姓名<input type="text" name="studentname"></a></p>
    <a>性别<input type="text" name="sex"></a></p>
    <a>年龄<input type="text" name="age"></a></p>
    <a>毕业状态<input type="text" name="state"></a></p>

    <input type="submit" value="提交">

</form>
</body>
</html>
