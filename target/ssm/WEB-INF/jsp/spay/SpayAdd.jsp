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
    <title>缴费模块add</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/spay/add">
    <a>学号<input type="text" name="studentid"></a></p>
    <a>姓名<input type="text" name="studentname"></a></p>
    <a>学费<input type="text" name="tution"></a></p>
    <a>缴费状态<input type="text" name="tstate"></a></p>
    <a>住宿费<input type="text" name="accex"></a></p>
    <a>缴费状态<input type="text" name="astate"></a></p>
    <input type="submit" value="提交">

</form>
</body>
</html>
