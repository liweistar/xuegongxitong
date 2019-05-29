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
    <title>毕业模块</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <td>编号</td>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>就业状态</td>


    </tr>
    </thead>




    <tr>
        <td>${graduation1.get(0).id}</td>
        <td>${graduation1.get(0).studentid}</td>
        <td>${graduation1.get(0).studentname}</td>
        <td>${graduation1.get(0).sex}</td>
        <td>${graduation1.get(0).age}</td>
        <td>${graduation1.get(0).state}</td>


    </tr>

</table>
</body>
</html>
