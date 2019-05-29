<%--
  Created by IntelliJ IDEA.
  User: EGO
  Date: 2019/5/29
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>毕业模块修改</title>
</head>
<body>
<form ACTION="${pageContext.request.contextPath}/graduation/updata">
    <input type="hidden" value="${graduation.id}" name="id">
    <a>学号<input type="text" value="${graduation.studentid}" name="studentid"></a></p>
    <a>姓名<input type="text" value="${graduation.studentname}" name="studentname"></a></p>
    <a>性别<input type="text" value="${graduation.sex}" name="sex"></a></p>
    <a>年龄<input type="text" value="${graduation.age}" name="age"></a></p>
    <a>毕业状态<input type="text" value="${graduation.state}" name="state"></a></p>



    <input type="submit" value="提交">
</form>
</body>
</html>
