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
    <title>就业状态</title>
</head>
<body>
<form ACTION="${pageContext.request.contextPath}/spay/updata">
    <input type="hidden" value="${spay.id}" name="id">
    <a>学号<input type="text" value="${spay.studentid}" name="studentid"></a></p>
    <a>姓名<input type="text" value="${spay.studentname}" name="studentname"></a></p>
    <a>学费<input type="text" value="${spay.tution}" name="tution"></a></p>
    <a>缴费状态<input type="text" value="${spay.tstate}" name="tstste"></a></p>
    <a>住宿费<input type="text" value="${spay.accex}" name="accex"></a></p>
    <a>缴费状态<input type="text" value="${spay.astate}" name="astate"></a></p>
    
    <input type="submit" value="提交">
</form>
</body>
</html>
